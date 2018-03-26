package com.target.myretail.rest;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.doNothing;
import static org.mockito.MockitoAnnotations.initMocks;

import org.junit.Before;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.target.myretail.model.Product;
import com.target.myretail.service.api.ProductDetailsService;

public class ProductControllerTest {

	@InjectMocks
	private ProductController subject;

	@Mock
	private ProductDetailsService productDetails;

	@Before
	public void setup() {
		initMocks(this);
	}
	
	@Test
	public void getPriceDetails() {
		Product product = new Product();
		ResponseEntity expected = new ResponseEntity(product, HttpStatus.OK);
		when(productDetails.getProductDetails("id")).thenReturn(product);
		final ResponseEntity actual = subject.getPriceDetails("id");
		assertEquals(expected, actual);
	}
	
	@Test
	public void getProductDetails_Null() {
		when(productDetails.getProductDetails("id")).thenReturn(null);
		final ResponseEntity actual = subject.getPriceDetails("id");
		assertNotNull(actual);
	}
	
	@Test
	public void putPriceDetails() {
		Product product = new Product();
		doNothing().when(productDetails).updateProductPriceDetails("id", product);
		ResponseEntity expected = new ResponseEntity(HttpStatus.OK);
		final ResponseEntity actual = subject.updatePriceDetails("id", product);
		assertEquals(expected, actual);
	}	
}
