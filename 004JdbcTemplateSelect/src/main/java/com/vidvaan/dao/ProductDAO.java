package com.vidvaan.dao;

import java.util.List;

import com.vidvaan.model.Product;

public interface ProductDAO {

	Product findById(int pid);
	List<Product> findAll();

}
