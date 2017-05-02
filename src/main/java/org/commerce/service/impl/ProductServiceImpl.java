package org.commerce.service.impl;

import java.util.List;

import org.commerce.entity.Product;
import org.commerce.entity.repo.ProductRepository;
import org.commerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
class ProductServiceImpl implements ProductService{
	
	ProductRepository productRepo;

	@Autowired
	private ProductServiceImpl(ProductRepository productRepo){
		this.productRepo = productRepo;
	}
	

	public ResponseEntity<?> createProduct(){
		return null;
		
	}
	
	public ResponseEntity<?> getProducts(){
		
		List<Product> products = productRepo.findAll();
		
		return ResponseEntity.ok(products);
		
	}
	
	
	public ResponseEntity<?> getProduct(){
		
		return null;
		
	}
	

}
