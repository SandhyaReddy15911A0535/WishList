package com.cg.capStore.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Component

public class Category {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_Sequence")
    @SequenceGenerator(name = "id_Sequence",initialValue=3001 ,allocationSize=1,sequenceName = "category_Sequence")
	//@Column(name="categoryId")
	private int categoryId;
	private String categoryName;
	private int categoryStatus;
	public int getCategoryId() {
	return categoryId;
	}
	public void setCategoryId(int categoryId) {
	this.categoryId = categoryId;
	}
	public String getCategoryName() {
	return categoryName;
	}
	public void setCategoryName(String categoryName) {
	this.categoryName = categoryName;
	}
	public int getCategoryStatus() {
	return categoryStatus;
	}
	public void setCategoryStatus(int categoryStatus) {
	this.categoryStatus = categoryStatus;
	}
}
