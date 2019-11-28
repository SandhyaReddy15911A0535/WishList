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

public class Merchant {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_Sequence")
    @SequenceGenerator(name = "id_Sequence",initialValue=4001 ,allocationSize=1,sequenceName = "merchant_Sequence")
	@Column(name="merchantId")
	private int merchantId;
	private String merchantName;
	private String merchantEmail;
	private long merchantContactNumber;
	private String merchantPassword;
	private String approvalStatus;
	public int getMerchantId() {
	return merchantId;
	}
	public void setMerchantId(int merchantId) {
	this.merchantId = merchantId;
	}
	public String getMerchantName() {
	return merchantName;
	}
	public void setMerchantName(String merchantName) {
	this.merchantName = merchantName;
	}
	public String getMerchantEmail() {
	return merchantEmail;
	}
	public void setMerchantEmail(String merchantEmail) {
	this.merchantEmail = merchantEmail;
	}
	public long getMerchantContactNumber() {
	return merchantContactNumber;
	}
	public void setMerchantContactNumber(long merchantContactNumber) {
	this.merchantContactNumber = merchantContactNumber;
	}
	public String getMerchantPassword() {
	return merchantPassword;
	}
	public void setMerchantPassword(String merchantPassword) {
	this.merchantPassword = merchantPassword;
	}
	public String getApprovalStatus() {
	return approvalStatus;
	}
	public void setApprovalStatus(String approvalStatus) {
	this.approvalStatus = approvalStatus;
	}
}
