package com.app.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.Entity.Category;
import com.app.Repository.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	CategoryRepository categoryRepository;

	public Category saveCategory(Category category) {
		return categoryRepository.save(category);
	}

	public CategoryService(CategoryRepository categoryRepository) {
		this.categoryRepository = categoryRepository;
	}

	public List<Category> getAllCategories() {
		return categoryRepository.findAll();
	}

	public void deleteCategoryById(Long categoryId) {
		categoryRepository.deleteById(categoryId);
	}

	
}
