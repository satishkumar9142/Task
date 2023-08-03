
package com.reactiveworks.productuser.mainmethod;

import java.util.ArrayList;
import java.util.List;

import com.reactiveworks.productuser.crud.ProductImplDao;
import com.reactiveworks.productuser.csvreader.ProductCSVReader;
import com.reactiveworks.productuser.exception.CustomException;
import com.reactiveworks.productuser.model.Product;

public class ProductDetails {
	public static void main(String[] args) {
		List<Product> list = new ArrayList<>();
		ProductCSVReader csv = new ProductCSVReader();
		ProductImplDao impl = new ProductImplDao();
		try {
			list = csv.getAllDevicesDetails();
			//		impl.createTable();
			//		impl.InsertintoMySQl(list);
			impl.ReadfromMySQl();
		} catch (CustomException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
