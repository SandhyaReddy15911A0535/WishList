package com.cg.capStore.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity

public class Product {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "productSequence")
    @SequenceGenerator(name = "productSequence",initialValue=2001, sequenceName = "productSequence")
	private int productId;
	private String productName;
	private int productQuantity;
	private int productPrice;
	private String productDescription;
	private int productRating;
	
	@ManyToOne
	@JoinColumn(name="categoryId")
	private Category categoryId;
	@ManyToOne
	@JoinColumn(name="MerchantId")
	private Merchant merchantId;
	private int productStatus;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public int getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
	public float getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(int productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public float getProductRating() {
		return productRating;
	}
	public void setProductRating(int productRating) {
		this.productRating = productRating;
	}
	
	public Category getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Category categoryId) {
		this.categoryId = categoryId;
	}
	public Merchant getMerchantId() {
		return merchantId;
	}
	public void setMerchantId(Merchant merchantId) {
		this.merchantId = merchantId;
	}
	public int getProductStatus() {
		return productStatus;
	}
	public void setProductStatus(int productStatus) {
		this.productStatus = productStatus;
	}
	
}