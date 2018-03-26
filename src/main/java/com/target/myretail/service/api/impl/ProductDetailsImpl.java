package com.target.myretail.service.api.impl;

import java.net.URI;
import java.net.URISyntaxException;

import org.apache.commons.lang3.StringUtils;
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

import com.target.myretail.exception.CurrencyCodeNullException;
import com.target.myretail.exception.CurrencyValueNullException;
import com.target.myretail.exception.NoProductFoundException;
import com.target.myretail.exception.ProductIdParamAndRequestNotMatchException;
import com.target.myretail.model.Product;
import com.target.myretail.model.response.ProductResponse;
import com.target.myretail.rest.AbstractRequestHeaders;
import com.target.myretail.service.api.ProductDetails;

@Service
public class ProductDetailsImpl implements ProductDetails {

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
	public Product getProductDetails(String id) {
		ResponseEntity<ProductResponse> responseEntity = getExternalResponse();
		Product product = getProductFromDB(getQueryCriteria(id));
		if (product == null) {
			log.error("GET product id not found in db");
			throw new NoProductFoundException(id);
		}
		Product productGetResponse = retriveMyRetailResponse(product, getProductResponseName(responseEntity));
		log.info("GET call success for product id : " + id);
		return productGetResponse;
	}

	@Override
	public void updateProductPriceDetails(String id, Product product) {
		if (!id.equalsIgnoreCase(product.getProductId())) {
			log.error("product id not matched with request product id");
			throw new ProductIdParamAndRequestNotMatchException(id);
		}
		Query query = getQueryCriteria(id);
		Update update = getUpdateCriteria(product);
		mongoOperations.updateFirst(query, update, Product.class);
		product = getProductFromDB(query);
		if (product == null) {
			log.error("PUT product id not found in db");
			throw new NoProductFoundException(id);
		}
		log.info("PUT call success for product id : " + id);
	}

	private ResponseEntity getExternalResponse() {
		RestTemplate restTemplate = new RestTemplate();
		URI uri = getUri();
		HttpHeaders headers = AbstractRequestHeaders.buildHttpHeaders();
		HttpEntity entity = new HttpEntity(headers);
		ResponseEntity responseEntity = restTemplate.exchange(uri, HttpMethod.GET, entity, ProductResponse.class);
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

	public Product retriveMyRetailResponse(Product product, String productName) {
		product.setName(productName);
		return product;
	}

	private Product getProductFromDB(Query query) {
		Product product = mongoOperations.findOne(query, Product.class);
		return product;
	}

	private Query getQueryCriteria(String id) {
		Query query = new Query();
		query.addCriteria(Criteria.where(criteria).is(id));
		return query;
	}

	private Update getUpdateCriteria(Product myRetailResponse) {
		if (StringUtils.isBlank(myRetailResponse.getCurrentPrice().getCurrencyCode())) {
			log.error("Currency Code should not be Null for : " + myRetailResponse.getProductId());
			throw new CurrencyCodeNullException(myRetailResponse.getProductId());
		}
		if (myRetailResponse.getCurrentPrice().getCurrencyValue() == null
				|| myRetailResponse.getCurrentPrice().getCurrencyValue().isNaN()) {
			log.error("Currency Value should not be Null/ALPHA_NUMERIC for : " + myRetailResponse.getProductId());
			throw new CurrencyValueNullException(myRetailResponse.getProductId());
		}
		Update update = new Update();
		update.set(currentPriceValue, myRetailResponse.getCurrentPrice().getCurrencyValue());
		update.set(currentPriceCode, myRetailResponse.getCurrentPrice().getCurrencyCode());
		return update;
	}

}
