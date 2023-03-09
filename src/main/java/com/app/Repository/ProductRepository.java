package com.app.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.Entity.Products;

@Repository
public interface ProductRepository extends JpaRepository< Products ,String> {
	
    Products findByName(String name);


}
