package com.vidvaan.dao;

import com.vidvaan.model.Product;

public interface ProductDAO {

	public void add(Product product);

	public void update(Product product);

	public int delete(int pid);

}
