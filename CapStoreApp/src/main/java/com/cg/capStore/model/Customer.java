package com.cg.capStore.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
public class Customer {

		@Id
		@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "customerSequence")
	    @SequenceGenerator(name = "customerSequence",initialValue=1001, sequenceName = "customerSequence")
		private int customerId;
		private String name;
		private String emailId;
		private String password;
		private long contactNo;
		
		
		public int getCustomerId() {
			return customerId;
		}
		public void setCustomerId(int customerId) {
			this.customerId = customerId;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getEmailId() {
			return emailId;
		}
		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public long getContactNo() {
			return contactNo;
		}
		public void setContactNo(long contactNo) {
			this.contactNo = contactNo;
		}
		
	}
