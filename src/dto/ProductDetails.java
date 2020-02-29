package dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ProductDetails {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer productId;
	@Column(nullable = false, unique = false)
	private String productName;
	@Column(nullable = false, unique = false)
	private Double productPrice;
	@Column(nullable = false, unique = false)
    private Integer noOfQuantity;
	@Column(nullable = false, unique = false)
    private String specifications;
    
	public ProductDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ProductDetails(Integer productId, String productName, Double productPrice, Integer noOfQuantity,
			String specifications) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.noOfQuantity = noOfQuantity;
		this.specifications = specifications;
	}
	public Integer getProductId() {
		return productId;
	}
	public void setProductId(Integer productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public Double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}
	public Integer getNoOfQuantity() {
		return noOfQuantity;
	}
	public void setNoOfQuantity(Integer noOfQuantity) {
		this.noOfQuantity = noOfQuantity;
	}
	public String getSpecifications() {
		return specifications;
	}
	public void setSpecifications(String specifications) {
		this.specifications = specifications;
	}
	@Override
	public String toString() {
		return "ProductDetails [productId=" + productId + ", productName=" + productName + ", productPrice="
				+ productPrice + ", noOfQuantity=" + noOfQuantity + ", specifications=" + specifications + "]";
	}
    
    
    
    

}