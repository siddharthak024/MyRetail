package com.target.myretail.service.api.impl;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.initMocks;
import static org.springframework.test.util.ReflectionTestUtils.setField;

import java.net.URI;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.powermock.reflect.Whitebox;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.web.client.RestTemplate;

import com.target.myretail.model.CurrentPrice;
import com.target.myretail.model.Product;

@RunWith(PowerMockRunner.class)
@PrepareForTest(ProductDetailsServiceImpl.class)
public class ProductDetailsImplTest {

	@InjectMocks
	private ProductDetailsServiceImpl productDetails;

	@Mock
	private RestTemplate restTemplate;

	@Mock
	private MongoOperations mongoOperations;

	@Before
	public void setup() {
		initMocks(this);
	}

	@Test
	public void getQueryCriteria() throws Exception {
		Query expected = new Query();
		expected.addCriteria(Criteria.where(null).is("id"));
		Query query = Whitebox.invokeMethod(productDetails, "getQueryCriteria", "id");
		assertNotNull(query);
		assertEquals(expected, query);
	}

	@Test
	public void getUpdateCriteria() throws Exception {
		final Product product = new Product();
		product.setProductId("15117729");
		product.setName("productNmae");
		CurrentPrice currentPrice = new CurrentPrice();
		currentPrice.setCurrencyCode("currencyCode");
		currentPrice.setCurrencyValue(123.00);
		product.setCurrentPrice(currentPrice);
		Update expected = new Update();
		expected.set("currentPrice.currencyValue", product.getCurrentPrice().getCurrencyValue());
		expected.set("currentPrice.currencyCode", product.getCurrentPrice().getCurrencyCode());

		setField(productDetails, "currentPriceValue", "currentPrice.currencyValue");
		setField(productDetails, "currentPriceCode", "currentPrice.currencyCode");

		Update update = Whitebox.invokeMethod(productDetails, "getUpdateCriteria", product);

		assertEquals(expected, update);
	}
	
	@Test
	public void getUri() throws Exception {
		setField(productDetails, "externalApi", "http://mock.com");
		URI expected = new URI("http://mock.com");
		URI actual = Whitebox.invokeMethod(productDetails, "getUri");
		assertEquals(expected, actual);
	}
	
	@Test
	public void getProductFromDB() throws Exception {
		Query query = new Query();
		query.addCriteria(Criteria.where(null).is("id"));
		Product expected = new Product();
		when(mongoOperations.findOne(query, Product.class)).thenReturn(expected);
		Product product = Whitebox.invokeMethod(productDetails, "getProductFromDB", query);
		assertEquals(expected, product);
	}
}
