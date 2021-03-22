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

//		Product product = new Product();
//		product.setPid(103);
//		product.setPname("Nokia");
//		product.setPcost(24000.00);
//		System.out.println(productDAO.saveWithPSC(product));
		
		System.out.println(productDAO.callIncrementFunction(1));
	}

}
