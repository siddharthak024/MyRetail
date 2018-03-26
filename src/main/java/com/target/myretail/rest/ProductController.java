package com.target.myretail.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.target.myretail.model.Product;
import com.target.myretail.service.api.ProductDetailsService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

/**
 * @author Siddhartha
 *
 */

@RestController
@RequestMapping(value = "/product")
public class ProductController {

	@Autowired
	private ProductDetailsService productDetails;

	/**
	 * Get Product Details from DB and external service	 * 
	 * @PathVariable id 
	 * return Product 
	 * Exception = NoProductFoundException
	 */
	@ApiOperation(value = "Get the combined response of product name and price details")
	@ApiResponses(value = { @ApiResponse(response = Product.class, code = 200, message = "OK"),
			@ApiResponse(code = 404, message = "No product found : {id}") })
	@GetMapping("/{id}")
	public ResponseEntity getPriceDetails(@PathVariable("id") String id) {
		Product product = productDetails.getProductDetails(id);
		return new ResponseEntity(product, HttpStatus.OK);
	}

	/**
	 * Update Product price details in DB	 * 
	 * @PathVariable id
	 * @RequestBody Product 
	 * return nothing 
	 * Exception = NoProductFoundException,
	 *              ProductIdParamAndRequestNotMatchException,
	 *              CurrencyCodeNullException, CurrencyValueNullException
	 */
	@ApiOperation(value = "Updates the product price details")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "OK"),
			@ApiResponse(code = 404, message = "No product found : {id}"),
			@ApiResponse(code = 400, message = "Currency Value should not be Null/ALPHA_NUMERIC for {id}"),
			@ApiResponse(code = 400, message = "Currency Code should not be Null for {id}"),
			@ApiResponse(code = 400, message = "Product id does not match with id in Request body: {id}") })
	@PutMapping("/{id}")
	public ResponseEntity updatePriceDetails(@PathVariable("id") String id,
			@Validated @RequestBody final Product product) {
		productDetails.updateProductPriceDetails(id, product);
		return new ResponseEntity(HttpStatus.OK);
	}

	/**
	 * Used for container health check
	 * Returns Success 200 OK 
	 * 
	 */
	@GetMapping("/health")
	public ResponseEntity heathCheck() {
		return new ResponseEntity(HttpStatus.OK);
	}

}
