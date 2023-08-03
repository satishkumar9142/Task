
/**
 * StockTradeServiceSkeleton.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis2 version: 1.6.2  Built on : Apr 17, 2012 (05:33:49 IST)
 */
package org.example.www.stocktradeservice;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.List;

/**
 *  StockTradeServiceSkeleton java skeleton for the axisService
 */
public class StockTradeServiceSkeleton{

	List<StockTrade> stockList;
	public StockTradeServiceSkeleton() {
		stockList = readData();
	}
	/**
	 * Auto generated method signature
	 * 
	 * @param getMinimumVolTrade 
	 * @return getMinimumVolTradeResponse 
	 */

	public org.example.www.stocktradeservice.GetMinimumVolTradeResponse getMinimumVolTrade
	(org.example.www.stocktradeservice.GetMinimumVolTrade getMinimumVolTrade)
	{
		GetMinimumVolTradeResponse response = new GetMinimumVolTradeResponse();

		StockTrade trade = new StockTrade();
		double min = Double.MAX_VALUE;
		for(int i =0;i<stockList.size();i++) {
			if(min > stockList.get(i).getVol()) {
				min = stockList.get(i).getVol();
				trade = stockList.get(i);
			}
		}
		response.setMinVolTrade(trade);
		return response;
	}


	/**
	 * Auto generated method signature
	 * 
	 * @param getMaximumVolTrade 
	 * @return getMaximumVolTradeResponse 
	 */
	public org.example.www.stocktradeservice.GetMaximumVolTradeResponse getMaximumVolTrade
	(org.example.www.stocktradeservice.GetMaximumVolTrade getMaximumVolTrade)
	{
		GetMaximumVolTradeResponse response = new GetMaximumVolTradeResponse();
		StockTrade trade = new StockTrade();
		double max = Double.MIN_VALUE;
		for(int i =0;i<stockList.size();i++) {
			if(max < stockList.get(i).getVol()) {
				max = stockList.get(i).getVol();
				trade = stockList.get(i);
			}
		}
		response.setMaxVolTrade(trade);
		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param readStockTrade 
	 * @return readStockTradeResponse 
	 */

	public org.example.www.stocktradeservice.ReadStockTradeResponse readStockTrade
	(org.example.www.stocktradeservice.ReadStockTrade readStockTrade)
	{
		
		ReadStockTradeResponse response = new ReadStockTradeResponse();
		
		StockTrade [] stock = new StockTrade[stockList.size()];
		for(int i =0;i<stockList.size();i++)
			stock[i] = stockList.get(i);
		
		response.setStockList(stock);
		return response;
	}

	/**
	 * Auto generated method signature
	 * 
	 * @param getDailyTradingDiff 
	 * @return getDailyTradingDiffResponse 
	 */

	public org.example.www.stocktradeservice.GetDailyTradingDiffResponse getDailyTradingDiff
	(org.example.www.stocktradeservice.GetDailyTradingDiff getDailyTradingDiff)
	{
		GetDailyTradingDiffResponse response = new GetDailyTradingDiffResponse();
		String[] diff = new String[stockList.size()];
		for(int i =0;i<stockList.size();i++) {
			diff[i] = (stockList.get(i).getDate()+ "=" + (stockList.get(i).getHigh()-stockList.get(i).getLow()));
		}
		response.setDiffOfDailyTrading(diff);
				return response;
	}
	
	
	public static List<StockTrade> readData(){
		List<StockTrade> list = new ArrayList<StockTrade>();
		String s ="";

		BufferedReader br;
		try {
			br = new BufferedReader(new FileReader("S:\\WorkSpace\\Cisco.csv"));
			
			try {
				s =br.readLine();
				s =br.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}

			while( s != null) {
				String [] splitLine = s.split(",");
				StockTrade stock = new StockTrade();
				boolean flag = true;
				stock.setSequrity(splitLine[0]);
				stock.setDate(changeDatePattern(splitLine[1]));
				try {
					stock.setOpen(Double.parseDouble(splitLine[2]));
					stock.setHigh(Double.parseDouble(splitLine[3]));
					stock.setLow(Double.parseDouble(splitLine[4]));
					stock.setClose(Double.parseDouble(splitLine[5]));
					stock.setVol(Double.parseDouble(splitLine[6]));
					stock.setAdjClose(Double.parseDouble(splitLine[7]));
				}
				catch(NumberFormatException e) {
					flag = false;
				}
				if(flag) {
					list.add(stock);
				}
				try {
					s = br.readLine();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		} catch (FileNotFoundException e) {

		}
		return list;
	}
	private static String changeDatePattern(String s) {
		String s1 = "";

		try {
			String [] s2 = s.split("/");
			if(s2[0].length()<2) s1 += "0" + s2[0]+"/";
			else s1 += s2[0] + "/";
			if(s2[1].length()<2) s1 += "0" + s2[1]+"/";
			else s1 += s2[1]+"/";
			s1 += s2[2];
		}
		catch(DateTimeParseException e){
			s1 = "";
			String [] s2 = s.split("-");
			if(s2[0].length()<2) s1 += "0" + s2[0]+"/";
			else s1 += s2[0] + "/";
			if(s2[1].length()<2) s1 += "0" + s2[1]+"/";
			else s1 += s2[1]+"/";
			s1 += s2[2];
		}		
		return s1;
	}
}
