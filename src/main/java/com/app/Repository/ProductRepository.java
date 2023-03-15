package com.app.Repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.Entity.Category;
import com.app.Entity.Products;

@Repository
public interface ProductRepository extends JpaRepository< Products ,Long> {
	
	Optional<Products> findByProductName(String productName);

	Optional<Products> findByCategoryAndProductName(Category category, String productName);

    

 
}
