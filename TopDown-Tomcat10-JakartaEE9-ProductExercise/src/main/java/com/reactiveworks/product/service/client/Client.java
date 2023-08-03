package com.reactiveworks.product.service.client;

import java.util.List;

public class Client {
	public static void main(String[] args) {
	
		ProductServiceImplService service = new ProductServiceImplService();
		ProductServiceImpl port = service.getProductServiceImplPort();
		List<Product> product = port.getListOfProductFromProductType("Laptop");
		System.out.println(product);
	}
}
