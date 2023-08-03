package com.reactiveworks.productuser.Implimentation;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import com.reactiveworks.productuser.daointerface.ProductDao;
import com.reactiveworks.productuser.exception.ProductException;
import com.reactiveworks.productuser.model.Product;

public class ProductDaoCSVReaderImpl implements ProductDao {

	@Override
	public List<Product> getAlldatafromDS() throws ProductException {
		List<Product> list = new ArrayList<>();
		BufferedReader br;
		InputStream is = getClass().getClassLoader().getResourceAsStream("ProductDetail.csv");
		InputStreamReader isr = new InputStreamReader(is);
		if(is == null) {
			throw new ProductException("File Not found Exception");
		}
		br = new BufferedReader(isr);
		try {
			br.readLine();
		} catch (IOException e) {
			throw new ProductException("Problem in Reading the Line");
		}
		br.lines().filter(i->i != null).map(i->Pattern.compile(",").split(i)).forEach(x->{
			Product prod = new Product();
			try {
				prod.setProductId(x[0]);
				prod.setProductName(x[1]);
				prod.setProductType(x[2]);
				prod.setPrice(x[3]);
				prod.setWarranty(x[4]);
				prod.setManufectureDate(x[5]);
				prod.setScreenSize(x[6]);
				prod.setOS(x[7]);
				prod.setBatterySize(x[8]);
				prod.setNumCore(x[9]);
				prod.setRam(x[10]);
				prod.setSimType(x[11]);
				prod.setDisplaySize(x[12]);
				prod.setDisplayType(x[13]);
				prod.setIsSmartTV(x[14]);
				prod.setLoadCapacity(x[15]);
				prod.setIsAutomation(x[16]);
				prod.setDoorType(x[17]);
				prod.setGraphicsCard(x[18]);
				
			}catch (ArrayIndexOutOfBoundsException e) {
			}
			finally {
				list.add(prod);
			}
		});
		return list;
	}
}
