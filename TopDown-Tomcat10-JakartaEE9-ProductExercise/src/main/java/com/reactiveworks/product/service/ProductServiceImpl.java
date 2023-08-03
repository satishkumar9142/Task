package com.reactiveworks.product.service;

import java.util.List;
import java.util.stream.Collectors;

import com.reactiveworks.product.exception.ProductException;
import com.reactiveworks.product.util.ProductCsvReader;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
@WebService
public class ProductServiceImpl implements ProductService{

	@Override
	@WebMethod
	public List<Product> getListOfProductFromProductType(String productType) {
		ProductCsvReader csv = new ProductCsvReader();
		List<Product> list = null;
		try {
			list = csv.getAllProducts();
		} catch (ProductException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list.stream().filter(i->i.getProductType().equals(productType)).collect(Collectors.toList());
	}

}
