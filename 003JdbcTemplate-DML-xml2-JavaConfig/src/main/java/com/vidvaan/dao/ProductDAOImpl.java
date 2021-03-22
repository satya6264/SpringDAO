package com.vidvaan.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.vidvaan.model.Product;

@Repository("productDAO")
public class ProductDAOImpl implements ProductDAO {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void add(Product product) {
		jdbcTemplate.update("INSERT INTO PRODUCT VALUES(?,?,?)",
				new Object[] { product.getPid(), product.getPname(), product.getPcost() });
	}

	public void update(Product product) {
		jdbcTemplate.update("UPDATE PRODUCT SET PNAME = ?, PCOST = ? WHERE PID = ?",
				new Object[] { product.getPname(), product.getPcost(), product.getPid() });
	}

	public int delete(int pid) {
		return jdbcTemplate.update("DELETE FROM PRODUCT WHERE PID = ?", pid);
	}

}