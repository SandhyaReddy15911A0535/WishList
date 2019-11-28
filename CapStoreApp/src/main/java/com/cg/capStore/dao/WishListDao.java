package com.cg.capStore.dao;

import java.util.ArrayList;

import com.cg.capStore.model.Customer;
import com.cg.capStore.model.Product;
import com.cg.capStore.model.WishList;

public interface WishListDao {
public WishList addProduct(Product product);

public ArrayList<Product> getAll();

public ArrayList<WishList> getAllWishList();
}
