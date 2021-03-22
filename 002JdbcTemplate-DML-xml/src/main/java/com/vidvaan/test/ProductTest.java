package com.vidvaan.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vidvaan.dao.ProductDAO;
import com.vidvaan.model.Product;

public class ProductTest {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
		ProductDAO productDAO = (ProductDAO) applicationContext.getBean("productDAO");
		Product  product = new Product();
		product.setPid(101);
		product.setPname("Samsung");
		product.setPcost(20000.00);
		productDAO.add(product);
//		productDAO.delete(101);
		System.out.println("Added Successfully...");
	}

}
