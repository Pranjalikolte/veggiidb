package com.app.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Entity.Products;
import com.app.Repository.ProductRepository;

@Service
public class ProductService {


	  @Autowired
	  private ProductRepository productRepository;

	public void addProduct(Products product) {
		// TODO Auto-generated method stub
		
	}



}
