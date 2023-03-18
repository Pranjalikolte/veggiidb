package com.app.Entity;


import java.time.LocalDateTime;
import java.util.List;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "category", uniqueConstraints = { @UniqueConstraint(columnNames = "categoryId"), @UniqueConstraint(columnNames = "categoryName")  })
public class Category {
	
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long categoryId;

	    private String categoryName;

	    @CreationTimestamp
		private LocalDateTime dateCreated;

		@UpdateTimestamp
		private LocalDateTime dateUpdated;

	    @OneToMany(mappedBy = "category")
	    private List<Products> products;
	    
	    public Category() {}
	    
	    
	    

		public Category(Long categoryId, String categoryName) {
			super();
			this.categoryId = categoryId;
			this.categoryName = categoryName;
			
		}

		public Long getCategoryId() {
			return categoryId;
		}

		public void setCategoryId(Long categoryId) {
			this.categoryId = categoryId;
		}

		public String getCategoryName() {
			return categoryName;
		}

		public void setCategoryName(String categoryName) {
			this.categoryName = categoryName;
		}




		public LocalDateTime getDateCreated() {
			return dateCreated;
		}




		public void setDateCreated(LocalDateTime dateCreated) {
			this.dateCreated = dateCreated;
		}




		public LocalDateTime getDateUpdated() {
			return dateUpdated;
		}




		public void setDateUpdated(LocalDateTime dateUpdated) {
			this.dateUpdated = dateUpdated;
		}

		

		
	

}
