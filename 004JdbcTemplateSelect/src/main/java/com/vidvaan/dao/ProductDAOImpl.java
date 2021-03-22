package com.vidvaan.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import org.springframework.validation.BeanPropertyBindingResult;

import com.vidvaan.model.Product;

@Repository("productDAO")
public class ProductDAOImpl implements ProductDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public Product findById(int pid) {
		String query="SELECT * FROM PRODUCT WHERE PID=?";
		return jdbcTemplate.queryForObject(query, new Object[] {pid}, new BeanPropertyRowMapper<Product>(Product.class));
	}

//	public List<Product> findAll() {
//		String query ="SELECT * FROM PRODUCT";
//		return jdbcTemplate.query(query, new BeanPropertyRowMapper<Product>(Product.class));
//	}
	
//	public List<Product> findAll() {
//		String query ="SELECT * FROM PRODUCT";
//		return jdbcTemplate.query(query, new ProductRowMapper());
//	}
	
	//Anonimous class
//	public List<Product> findAll() {
//		String query ="SELECT * FROM PRODUCT";
//		return jdbcTemplate.query(query, new RowMapper<Product>() {
//
//			@Override
//			public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
//				Product product = new Product();
//				product.setPid(rs.getInt(1));
//				product.setPname(rs.getString(2));
//				product.setPcost(rs.getDouble(3));
//				return product;
//			}
//
//			
//			
//		});
//	}


	//1.8 Impl
	public List<Product> findAll() {
		String query ="SELECT * FROM PRODUCT";
		return jdbcTemplate.query(query, (rs,rc)->{
			Product product = new Product();
			product.setPid(rs.getInt(1));
			product.setPname(rs.getString(2));
			product.setPcost(rs.getDouble(3));
			return product;
		});
	}


}