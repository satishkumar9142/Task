package com.reactiveworks.productuser.csvreader;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.reactiveworks.productuser.exception.CustomException;
import com.reactiveworks.productuser.model.Product;

public class ProductCSVReader {

	private static Logger log = LogManager.getLogger(ProductCSVReader.class);
	public List<Product> getAllDevicesDetails() throws com.reactiveworks.productuser.exception.CustomException {
		List<Product> list = new ArrayList<>();

		BufferedReader br;
		InputStream is = getClass().getClassLoader().getResourceAsStream("ProductDetail.csv");
		InputStreamReader isr = new InputStreamReader(is);
		if(is == null) {
			throw new CustomException("File Not found Exception");
		}
		br = new BufferedReader(isr);
		try {
			br.readLine();
		} catch (IOException e) {
			throw new CustomException("Problem in Reading the Line");
		}
		br.lines().filter(i->i != null).map(i->Pattern.compile(",").split(i)).forEach(x->{
			Product device = new Product();
			try {
				device.setProductId(x[0]);
				device.setProductName(x[1]);
				device.setProductType(x[2]);
				device.setPrice((x[3]));
				device.setWarranty(x[4]);
				device.setManufectureDate(x[5]);
				device.setScreenSize(x[6]);
				device.setOS(x[7]);
				device.setBatterySize(x[8]);
				device.setNumCore((x[9]));
				device.setRam(x[9]);
				device.setSimType(x[11]);
				device.setDisplaySize((x[12]));
				device.setDisplayType(x[13]);
				device.setIsSmartTV((x[14]));
				device.setLoadCapacity(x[15]);
				device.setIsAutomation(x[16]);
				device.setDoorType(x[17]);
				device.setGraphicsCard(x[18]);
				
			}catch (ArrayIndexOutOfBoundsException e) {
			}
			finally {
				list.add(device);
			}
		});
		return list;
	} 
}
