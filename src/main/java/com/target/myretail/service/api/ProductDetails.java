package com.target.myretail.service.api;

import com.target.myretail.model.Product;
import com.target.myretail.model.MyRetailResponse;

public interface ProductDetails {
	public MyRetailResponse getProductDetails(String id);
	public Product putProductDetails(String id, MyRetailResponse productGetResponse);
}
