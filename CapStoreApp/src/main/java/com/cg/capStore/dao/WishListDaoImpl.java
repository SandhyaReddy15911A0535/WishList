package com.cg.capStore.dao;

import java.util.ArrayList;
import java.util.Iterator;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.query.Query;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.cg.capStore.model.Customer;
import com.cg.capStore.model.Product;
import com.cg.capStore.model.WishList;
@ComponentScan("com.cg.capStore.Dao")
@Component("wishListDao")
@Repository
public class WishListDaoImpl implements WishListDao {
	@PersistenceContext
	EntityManager entityManager;
	Customer customer;
	public WishList addProduct(Product product) {
		// TODO Auto-generated method stub
		WishList wishList=new WishList();
       customer = new Customer();		
		customer.setCustomerId(1002);
		customer.setName("sandhya");
		customer.setPassword("sandhya");
		customer.setContactNo(123456789);
		customer.setEmailId("sandhy@g.c");
		
		wishList.setCustomerId(customer);
		wishList.setProductId(product);
		entityManager.persist(wishList);
		
		
		return wishList;
	}
	public ArrayList<Product> getAll() {
		
		Query query=(Query) entityManager.createQuery("from Product");
		ArrayList<Product> al=(ArrayList<Product>) query.list();
            
		
		return al;
		// TODO Auto-generated method stub
		
	}
	@Override
	public ArrayList<WishList> getAllWishList() {
		// TODO Auto-generated method stub
		Query query=(Query) entityManager.createQuery("from WishList");
		ArrayList<WishList> wl=(ArrayList<WishList>) query.list();
            
		return wl;
	}

}
