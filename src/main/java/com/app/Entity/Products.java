package com.app.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Products {
	
	private String images;
	
	@Id
	private String name;
	private String description;
	private String category;
	private String units;
	private Long quantity;
	private Long regular;
	private Long offer;
	private String actions;
	
	
	
	public Products() {}
	
	
	public Products(String images, String name, String description, String category, String units, Long quantity,
			Long regular, Long offer, String actions) {
		super();
		this.images = images;
		this.name = name;
		this.description = description;
		this.category = category;
		this.units = units;
		this.quantity = quantity;
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
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getUnits() {
		return units;
	}
	public void setUnits(String units) {
		this.units = units;
	}
	public Long getQuantity() {
		return quantity;
	}
	public void setQuantity(Long quantity) {
		this.quantity = quantity;
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
