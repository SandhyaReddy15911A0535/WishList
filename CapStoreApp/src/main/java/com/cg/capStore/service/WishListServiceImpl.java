package com.cg.capStore.service;

import java.util.ArrayList;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.cg.capStore.dao.WishListDao;
import com.cg.capStore.dao.WishListDaoImpl;
import com.cg.capStore.model.Customer;
import com.cg.capStore.model.Product;
import com.cg.capStore.model.WishList;

@Service
@Component("wishListService")
@Transactional 
public class WishListServiceImpl implements WishListService{
@Autowired
WishListDao  wishListDao;
	@Override
	public WishList addProduct(Product product) {
		
	return wishListDao.addProduct(product);
		
	}
	@Override
	public ArrayList<Product> getAll() {
		// TODO Auto-generated method stub
		
		return  wishListDao.getAll();
	
	}
	@Override
	public ArrayList<WishList> getAllWishList() {
		// TODO Auto-generated method stub
		
		return wishListDao.getAllWishList();
	}

}
