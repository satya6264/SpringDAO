package com.vidvaan.dao;

import java.util.List;

import com.vidvaan.model.Product;

public interface ProductDAO {

	public Integer saveWithPSC(Product product);
	
	public Integer callIncrementFunction(int num);
	
	public Integer callIncrementFunctionWithJava8(int num);
	

}
