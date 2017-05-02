package org.commerce.controller;

import java.util.logging.Logger;

import org.commerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	private ProductService productService;
	private Logger logger;
    
	@Autowired
	public ProductController(ProductService productService,Logger logger){
		this.productService= productService;
		this.logger = logger;
	}
	
	@PostMapping(value="/product")
	public ResponseEntity<?> createProduct(){
		return productService.createProduct();
	}
	
	@GetMapping(value="/products")
	public ResponseEntity<?> getProducts(){
		return productService.getProducts();
	}
	@GetMapping(value="/product/{productId}")
	public ResponseEntity<?> getProduct(@PathVariable("productId") String productId){
		return productService.getProduct();
	}

}
