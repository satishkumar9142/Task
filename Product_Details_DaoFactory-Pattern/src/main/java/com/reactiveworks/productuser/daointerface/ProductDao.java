package com.reactiveworks.productuser.daointerface;

import java.util.List;

import com.reactiveworks.productuser.exception.ProductException;
import com.reactiveworks.productuser.model.Product;

public interface ProductDao {
	
	List<Product> getAlldatafromDS() throws ProductException;
}
