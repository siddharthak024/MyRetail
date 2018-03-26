package com.target.myretail.service.api;

import com.target.myretail.model.Product;

public interface ProductDetailsService {
	public Product getProductDetails(String id);
	public void updateProductPriceDetails(String id, Product product);
}
