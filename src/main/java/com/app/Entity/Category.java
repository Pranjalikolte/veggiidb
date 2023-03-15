package com.app.Entity;


import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "category", uniqueConstraints = { @UniqueConstraint(columnNames = "categoryid"), @UniqueConstraint(columnNames = "categoryName")  })
public class Category {
	
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long categoryId;

	    private String categoryName;
	    
	    

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

		

		
	

}
