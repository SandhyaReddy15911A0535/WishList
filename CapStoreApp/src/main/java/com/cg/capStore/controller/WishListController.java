package com.cg.capStore.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cg.capStore.model.Customer;
import com.cg.capStore.model.Product;
import com.cg.capStore.model.WishList;
import com.cg.capStore.service.WishListService;

@RestController
@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
public class WishListController {
@Autowired
WishListService wishListService;

@RequestMapping(value="/addProduct",method=RequestMethod.POST)
public WishList addproduct(@RequestBody Product product)
{
	WishList wishList=wishListService.addProduct(product);
	return wishList;
	
}
@RequestMapping(value="/",method=RequestMethod.GET)
public String start() {
	
	return "Hello";
}

@RequestMapping(value="/getAll",method=RequestMethod.GET)
public ArrayList<Product> getAllProducts()
{
	System.out.println("before contr");

	ArrayList<Product> products=wishListService.getAll();
	return products;
}
@RequestMapping(value="/getWishList",method=RequestMethod.GET)
public ArrayList<WishList> getAllWishList()
{
	ArrayList<WishList> wishList=wishListService.getAllWishList();
	return wishList;
}
}
