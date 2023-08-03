package com.reactiveWork.ProductCategory.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.reactiveWork.ProductCategory.CustomException.CustomException;
import com.reactiveWork.ProductCategory.individualProduct.AllDevice;
/**
 * ProductCSVReader Class its read all data from the csv file.
 *
 */
public class ProductCSVReader {

	private static Logger log = LogManager.getLogger(ProductCSVReader.class);
	public List<AllDevice> getAllDevicesDetails() throws CustomException {
		List<AllDevice> list = new ArrayList<>();

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
			AllDevice device = new AllDevice();
			try {
				device.setProductId(x[0]);
				device.setProductName(x[1]);
				device.setProductType(x[2]);
				device.setPrice((x[3]));
				device.setWarranty(x[4]);
				device.setManufecturedDt(x[5]);
				device.setScreenSize(x[6]);
				device.setOs(x[7]);
				device.setBatterySize(x[8]);
				device.setNumCore((x[9]));
				device.setRAM((x[10]));
				device.setSimType(x[11]);
				device.setDisplaySize((x[12]));
				device.setDisplayType(x[13]);
				device.setIsSmartTV((x[14]));
				device.setLoadCapacity(x[15]);
				device.setIsAutomatic(x[16]);
				device.setDoorType(x[17]);
				device.setGraphicCard(x[18]);

			}catch (ArrayIndexOutOfBoundsException e) {
			}
			finally {
				list.add(device);
			}
		});
		return list;
	} 
}
