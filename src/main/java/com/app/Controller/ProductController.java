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
	 
	     @PostMapping("/add")
	     public ResponseEntity<Products> addProduct(@RequestBody Products product) {
	         Optional<Products> existingProduct = productRepository.findById(product.getProductName());
	         if (existingProduct.isPresent()) {
	             Products updatedProduct = existingProduct.get();
	             updatedProduct.setProductQuantity(updatedProduct.getProductQuantity() + product.getProductQuantity());
	             productRepository.save(updatedProduct);
	             return new ResponseEntity<>(updatedProduct, HttpStatus.OK);
	         } else {
	             Products newProduct = productRepository.save(product);
	             return new ResponseEntity<>(newProduct, HttpStatus.CREATED);
	         }
	     }
	 }

