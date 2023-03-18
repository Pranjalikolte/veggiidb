package com.app.Entity;
import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

@Entity
@Table(name = "products", uniqueConstraints = {@UniqueConstraint(columnNames = "productName")  })
@DynamicUpdate
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Long productId;
    
    private String productName;
    
    private String productDescription;
    
    private Long productQuantity;
    
    private Long productMrp;

    private Long regular;
    
    private String offer;

	@CreationTimestamp
	private LocalDateTime dateCreated;

	@UpdateTimestamp
	private LocalDateTime dateUpdated;
    
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "category_id" , referencedColumnName="categoryId")
    private Category category;
    
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "units_id" , referencedColumnName="unitsId")
    private Units units ;
    
    public Products() {}

	public Products(Long productId, String productName, String productDescription, 
			Long productQuantity, Long productMrp, Long regular, String offer, LocalDateTime dateCreated,
			LocalDateTime dateUpdated, Category category, Units units) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productDescription = productDescription;
		this.productQuantity = productQuantity;
		this.productMrp = productMrp;
		this.regular = regular;
		this.offer = offer;
		this.dateCreated = dateCreated;
		this.dateUpdated = dateUpdated;
		this.category = category;
		this.units = units;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public Long getProductQuantity() {
		return productQuantity;
	}

	public void setProductQuantity(Long productQuantity) {
		this.productQuantity = productQuantity;
	}

	public Long getProductMrp() {
		return productMrp;
	}

	public void setProductMrp(Long productMrp) {
		this.productMrp = productMrp;
	}

	public Long getRegular() {
		return regular;
	}

	public void setRegular(Long regular) {
		this.regular = regular;
	}

	public String getOffer() {
		return offer;
	}

	public void setOffer(String offer) {
		this.offer = offer;
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

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Units getUnits() {
		return units;
	}

	public void setUnits(Units units) {
		this.units = units;
	}
    
	
	
	
}