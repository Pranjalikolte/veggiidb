package DTO;

public class ProductDTO {
	
	private Long productId;

	private String productName;

	private String productDescription;

	private String productUnits;

	private Long productQuantity;

	private Long productMrp;

	private Long regular;

	private String offer;
	
	private Long categoryId;

	
	

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

	public String getOffer() {
		return offer;
	}

	public void setOffer(String offer) {
		this.offer = offer;
	}

	public Long getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}

	
	
	
	

}
