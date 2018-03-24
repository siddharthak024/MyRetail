package com.target.myretail.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.target.myretail.model.MyRetailResponse;
import com.target.myretail.model.Product;
import com.target.myretail.service.api.ProductDetails;

@RestController
@RequestMapping(value = "/product/{id}")
public class RestMappingController {
	
	@Autowired
	private ProductDetails productDetails;
	
	@GetMapping
	public ResponseEntity getPriceDetails(@PathVariable("id") String id) {
		MyRetailResponse myRetailResponse = productDetails.getProductDetails(id);
		if(myRetailResponse == null) {
			ErrorResponse errorResponse = new ErrorResponse(MyRetailErrorCodes.ID_NOT_IN_DB.getCode(), "not valid id",
					MyRetailErrorCodes.ID_NOT_IN_DB.getText());
			return new ResponseEntity<ErrorResponse>(errorResponse, HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<MyRetailResponse>(myRetailResponse, HttpStatus.OK);
	}
	
	@PutMapping
	public ResponseEntity putPriceDetails(@PathVariable("id") String id, @RequestBody MyRetailResponse productGetResponse) {
		Product currentProduct = productDetails.putProductDetails(id, productGetResponse);
		if(currentProduct == null) {
			ErrorResponse errorResponse = new ErrorResponse(MyRetailErrorCodes.ID_NOT_IN_DB.getCode(), "not valid id",
					MyRetailErrorCodes.ID_NOT_IN_DB.getText());
			return new ResponseEntity<ErrorResponse>(errorResponse, HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<Product>(currentProduct, HttpStatus.OK);
	}
}
