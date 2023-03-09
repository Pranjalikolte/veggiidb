package com.app.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.Entity.Products;
import com.app.Repository.ProductRepository;

@RestController
public class ProductController {
	
	@Autowired
	ProductRepository productRepository;
	
//	 @PostMapping("/product")
//	    public ResponseEntity<Products> addProduct(@RequestBody Products product) {
//	        Products existingProduct = productRepository.findByName(product.getName());
//	        if (existingProduct != null) {
//	            Long newQuantity = existingProduct.getQuantity() + product.getQuantity();
//	            existingProduct.setQuantity(newQuantity);
//	            productRepository.save(existingProduct);
//	            return ResponseEntity.ok(existingProduct);
//	        } else {
//	            Products savedProduct = productRepository.save(product);
//	            return ResponseEntity.ok(savedProduct);
//	        }
//	 }


	 

	     @PostMapping("/add")
	     public ResponseEntity<Products> addProduct(@RequestBody Products product) {
	         Optional<Products> existingProduct = productRepository.findById(product.getName());
	         if (existingProduct.isPresent()) {
	             Products updatedProduct = existingProduct.get();
	             updatedProduct.setQuantity(updatedProduct.getQuantity() + product.getQuantity());
	             productRepository.save(updatedProduct);
	             return new ResponseEntity<>(updatedProduct, HttpStatus.OK);
	         } else {
	             Products newProduct = productRepository.save(product);
	             return new ResponseEntity<>(newProduct, HttpStatus.CREATED);
	         }
	     }
	 }

