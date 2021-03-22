package com.vidvaan.test;

import java.util.List;

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

		List<Product> products = productDAO.findAll();
		products.forEach(System.out::println);

//		System.out.println(productDAO.findById(101));
	}

}
