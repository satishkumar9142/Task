package com.reactiveworks.productuser.crud;

import java.util.List;

import com.reactiveworks.productuser.modelinterface.Product;

public interface ProductDao {
	
	void createTable();
	void InsertintoMySQl(List<Product> list);
	void ReadfromMySQl();
	
	
}
