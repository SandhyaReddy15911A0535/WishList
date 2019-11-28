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
@Component

public class WishList {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_Sequence")
    @SequenceGenerator(name = "id_Sequence",initialValue=8001 ,allocationSize=1,sequenceName = "wishList_Sequence")
	private int wishListId;
	@ManyToOne
	@JoinColumn(name="customerId")
	private Customer customerId;
	public Customer getCustomerId() {
		return customerId;
	}
	public void setCustomerId(Customer customerId) {
		this.customerId = customerId;
	}
	@ManyToOne
	@JoinColumn(name="productId")
 private Product productId;
	public int getWishListId() {
		return wishListId;
	}
	public void setWishListId(int wishListId) {
		this.wishListId = wishListId;
	}
	
	
	public Product getProductId() {
		return productId;
	}
	public void setProductId(Product productId) {
		this.productId = productId;
	}

}
