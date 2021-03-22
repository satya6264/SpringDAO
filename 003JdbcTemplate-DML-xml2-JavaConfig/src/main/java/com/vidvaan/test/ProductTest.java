package com.vidvaan.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.vidvaan.config.SpringConfig;
import com.vidvaan.dao.ProductDAO;
import com.vidvaan.model.Product;

public class ProductTest {
	
	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(SpringConfig.class);
		ProductDAO productDAO = (ProductDAO) applicationContext.getBean("productDAO");
		Product  product = new Product();
		product.setPid(102);
		product.setPname("Moto");
		product.setPcost(22000.00);
		productDAO.add(product);
//		productDAO.delete(101);
		System.out.println("Added Successfully...");
	}

}
