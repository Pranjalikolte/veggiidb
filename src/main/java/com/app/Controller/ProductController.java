package com.app.Controller;

import java.util.List;
import java.util.Optional;

import javax.management.AttributeNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.app.Entity.Category;
import com.app.Entity.Products;
import com.app.Repository.CategoryRepository;
import com.app.Repository.ProductRepository;
import com.app.Service.CategoryService;
import com.app.Service.ProductService;

import DTO.ProductDTO;
import jakarta.persistence.EntityNotFoundException;

@RestController
public class ProductController {

	@Autowired
	ProductRepository productRepository;

	@Autowired
	CategoryRepository categoryRepository;

	@Autowired
	ProductService productService;

	@Autowired
	CategoryService categoryService;

	// update all records
//	@PostMapping("/add")
//	public ResponseEntity<String> addProduct(@RequestBody Products product) {
//	    Products existingProduct = productService.getProductByName(product.getProductName());
//	    if (existingProduct != null) {
//	        // If product already exists, update its quantity and other fields
//	        Long updatedQuantity = existingProduct.getProductQuantity() + product.getProductQuantity();
//	        existingProduct.setProductQuantity(updatedQuantity);
//	        existingProduct.setImages(product.getImages());
//	        existingProduct.setProductDescription(product.getProductDescription());
//	        existingProduct.setProductUnits(product.getProductUnits());
//	        existingProduct.setProductMrp(product.getProductMrp());
//	        existingProduct.setRegular(product.getRegular());
//	        existingProduct.setOffer(product.getOffer());
//	        existingProduct.setActions(product.getActions());
//	        existingProduct.setCategory(product.getCategory());
//	        productService.addProduct(existingProduct);
//	        return ResponseEntity.ok("Product updated successfully.");
//	    } else {
//	        // If product does not exist, create a new record
//	        productService.addProduct(product);
//	        return ResponseEntity.ok("Product added successfully.");
//	    }
//	}

//	     @PostMapping("/add") // simply add
//	     public ResponseEntity<String> addProduct(@RequestBody Products product) {
//	         productService.addProduct(product);
//	         return ResponseEntity.ok("Product added successfully.");
//	     }
//	     

//	     @GetMapping("/products")
//	     public ResponseEntity<List<Products>> getAllProducts() {
//	         List<Products> products = productRepository.findAll();
//	         return new ResponseEntity<>(products, HttpStatus.OK);
//	     }
//	     

	// delete product by id

//	     @DeleteMapping("/delete/{productName}")
//	     public ResponseEntity<Void> deleteProduct(@PathVariable("productName") String productName) {
//	         Optional<Products> product = productRepository.findById(productName);
//	         if (product.isPresent()) {
//	             productRepository.delete(product.get());
//	             return new ResponseEntity<>(HttpStatus.OK);
//	         } else {
//	             return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//	         }
//	     }

	// add category
	@PostMapping("/addcategories")
	public ResponseEntity<Category> createCategory(@RequestBody Category category) {
		Category savedCategory = categoryService.saveCategory(category);
		return ResponseEntity.ok().body(savedCategory);
	}
	
	// Delete category by ID
	@DeleteMapping("/deletecategory/{categoryId}")
	public ResponseEntity<String> deleteCategory(@PathVariable Long categoryId) {
	    categoryService.deleteCategoryById(categoryId);
	    return ResponseEntity.ok().body("Category with ID " + categoryId + " has been deleted.");
	}

	// Get all categories
	@GetMapping("/getallcategories")
	public List<Category> getAllCategories() {
	    return categoryService.getAllCategories();
	}


	// add product
	@PostMapping("/addproduct")
	public Products createProduct(@RequestBody Products product) {
		return productRepository.save(product);
	}

	// get product by id
	@GetMapping("/getproducts/{productId}")
	public Products getProductById(@PathVariable Long productId) throws AttributeNotFoundException {
		return productRepository.findById(productId)
				.orElseThrow(() -> new AttributeNotFoundException("Product not found with id: " + productId));
	}

	// get list of all products
	@GetMapping("/products")
	public List<Products> getAllProducts() {
		return productRepository.findAll();
	}

	// update products
	@PatchMapping("/update")
	public ResponseEntity<Products> updateProduct(@RequestBody ProductDTO productDTO) {
		Long productId = productDTO.getProductId();
		Optional<Products> optionalProduct = productRepository.findById(productId);
		if (!optionalProduct.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		Products product = optionalProduct.get();
		if (productDTO.getProductName() != null) {
			product.setProductName(productDTO.getProductName());
		}
		if (productDTO.getProductDescription() != null) {
			product.setProductDescription(productDTO.getProductDescription());
		}
		if (productDTO.getProductUnits() != null) {
			product.setProductUnits(productDTO.getProductUnits());
		}
		if (productDTO.getProductQuantity() != null) {
			product.setProductQuantity(productDTO.getProductQuantity());
		}
		if (productDTO.getProductMrp() != null) {
			product.setProductMrp(productDTO.getProductMrp());
		}
		if (productDTO.getRegular() != null) {
			product.setRegular(productDTO.getRegular());
		}
		if (productDTO.getOffer() != null) {
			product.setOffer(productDTO.getOffer());
		}
		Products updatedProduct = productRepository.save(product);
		return ResponseEntity.ok(updatedProduct);
	}

	// delete product by product id
	@DeleteMapping("/{productId}")
	public ResponseEntity<String> deleteProduct(@PathVariable Long productId) {
		Optional<Products> optionalProduct = productRepository.findById(productId);
		if (!optionalProduct.isPresent()) {
			return ResponseEntity.notFound().build();
		}
		Products product = optionalProduct.get();
		productRepository.delete(product);
		return ResponseEntity.ok("Product deleted successfully.");
	}

}
