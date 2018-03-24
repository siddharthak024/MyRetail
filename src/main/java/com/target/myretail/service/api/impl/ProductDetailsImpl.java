package com.target.myretail.service.api.impl;

import java.net.URI;
import java.net.URISyntaxException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.target.myretail.dao.ProductDao;
import com.target.myretail.model.Current_price;
import com.target.myretail.model.Product;
import com.target.myretail.model.MyRetailResponse;
import com.target.myretail.model.response.ProductResponse;
import com.target.myretail.rest.AbstractRequestHeaders;
import com.target.myretail.service.api.ProductDetails;

@Service
public class ProductDetailsImpl implements ProductDetails {

	@Autowired
	private ProductDao productDao;

	@Autowired
	private MongoOperations mongoOperations;

	@Value("${spring.redsky.target.uri}")
	private String externalApi;

	@Value("${spring.data.mongo.findCriteria}")
	private String criteria;

	@Value("${spring.data.mongo.update.currentPriceValue}")
	private String currentPriceValue;

	@Value("${spring.data.mongo.update.currentPriceCode}")
	private String currentPriceCode;

	Logger log = LogManager.getLogger(getClass());

	@Override
	public MyRetailResponse getProductDetails(String id) {
		ResponseEntity<ProductResponse> responseEntity = getExternalResponse();
		Product product = productDao.findByProductid(id);
		MyRetailResponse productGetResponse = new MyRetailResponse();
		try {
			productGetResponse = setResponse(product, getProductResponseName(responseEntity));
		} catch (Exception e) {
			log.error("" + e.getMessage());
			return null;
		}
		return productGetResponse;
	}

	private ResponseEntity<ProductResponse> getExternalResponse() {
		RestTemplate restTemplate = new RestTemplate();
		URI uri = getUri();
		HttpHeaders headers = AbstractRequestHeaders.buildHttpHeaders();
		HttpEntity<?> entity = new HttpEntity<Object>(headers);
		ResponseEntity<ProductResponse> responseEntity = restTemplate.exchange(uri, HttpMethod.GET, entity,
				ProductResponse.class);
		return responseEntity;
	}

	private URI getUri() {
		URI uri = null;
		try {
			uri = new URI(externalApi);
		} catch (URISyntaxException e) {
			log.error("external api uri not well formed" + e.getMessage());
		}
		return uri;
	}

	private String getProductResponseName(ResponseEntity<ProductResponse> response) {
		return response.getBody().getProduct().getItem().getProduct_description().getTitle();
	}

	public MyRetailResponse setResponse(Product product, String productName) throws Exception {
		MyRetailResponse productGetResponse = new MyRetailResponse();
		productGetResponse.setId(product.getProductId());
		productGetResponse.setName(productName);
		Current_price current_price = new Current_price();
		current_price.setCurrency_code(product.getCurrentPrice().getCurrencyCode());
		current_price.setValue(product.getCurrentPrice().getCurrencyValue());
		productGetResponse.setCurrent_price(current_price);
		return productGetResponse;
	}

	@Override
	public Product putProductDetails(String id, MyRetailResponse productGetResponse) {
		if(!id.equalsIgnoreCase(productGetResponse.getId())) {
			log.error("product id not matched with request product id");
			return null;
		}
		Query query = getQueryCriteria(id);
		Update update = getUpdateCriteria(productGetResponse);
		mongoOperations.updateFirst(query, update, Product.class);
		return getUpdatedProduct(query);
	}

	private Product getUpdatedProduct(Query query) {
		Product updatedProduct = mongoOperations.findOne(query, Product.class);
		return updatedProduct;
	}

	private Query getQueryCriteria(String id) {
		Query query = new Query();
		query.addCriteria(Criteria.where(criteria).is(id));
		return query;
	}

	private Update getUpdateCriteria(MyRetailResponse myRetailResponse) {
		Update update = new Update();
		update.set(currentPriceValue, myRetailResponse.getCurrent_price().getValue());
		update.set(currentPriceCode, myRetailResponse.getCurrent_price().getCurrency_code());
		return update;
	}

}
