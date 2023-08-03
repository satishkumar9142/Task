
package com.reactiveworks.productuser.mainmethod;

import java.util.ArrayList;
import java.util.List;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.reactiveworks.productuser.daofactory.ProductFactory;
import com.reactiveworks.productuser.daointerface.ProductDao;
import com.reactiveworks.productuser.exception.ProductException;
import com.reactiveworks.productuser.model.Product;

public class ProductDetails {
	private static Logger log = LogManager.getLogger(ProductDetails.class);

	public static void main(String[] args) {
		
		List<Product> list = new ArrayList<>();

		ProductDao factory = ProductFactory.getCityDAO("jdbc");

		try {
			list = factory.getAlldatafromDS();
		} catch (ProductException e) {
			log.error(e);
		}
		for(Product prod : list )
			log.info(prod);
	}
}
