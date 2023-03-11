package com.app.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Products {
	
	private String images;
	
	@Id
	private String productName;
	private String productDescription;
	private String category;
	private String productUnits;
	private Long productQuantity;
	private Long productMrp;
	private Long regular;
	private Long offer;
	private String actions;
	
	
	
	public Products() {}



	public Products(String images, String productName, String productDescription, String category, String productUnits,
			Long productQuantity, Long productMrp, Long regular, Long offer, String actions) {
		super();
		this.images = images;
		this.productName = productName;
		this.productDescription = productDescription;
		this.category = category;
		this.productUnits = productUnits;
		this.productQuantity = productQuantity;
		this.productMrp = productMrp;
		this.regular = regular;
		this.offer = offer;
		this.actions = actions;
	}



	public String getImages() {
		return images;
	}



	public void setImages(String images) {
		this.images = images;
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



	public String getCategory() {
		return category;
	}



	public void setCategory(String category) {
		this.category = category;
	}



	public String getProductUnits() {
		return productUnits;
	}



	public void setProductUnits(String productUnits) {
		this.productUnits = productUnits;
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



	public Long getOffer() {
		return offer;
	}



	public void setOffer(Long offer) {
		this.offer = offer;
	}



	public String getActions() {
		return actions;
	}



	public void setActions(String actions) {
		this.actions = actions;
	}
	
	
	
	

}
