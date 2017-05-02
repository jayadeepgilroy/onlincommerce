package org.commerce.service;

import org.springframework.http.ResponseEntity;

public interface ProductService {
	
	public ResponseEntity<?> createProduct();
	public ResponseEntity<?> getProducts();
	public ResponseEntity<?> getProduct();

}
