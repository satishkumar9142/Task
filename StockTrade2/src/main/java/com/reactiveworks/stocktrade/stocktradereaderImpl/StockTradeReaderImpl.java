package com.reactiveworks.stocktrade.stocktradereaderImpl;

import java.io.BufferedReader;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.reactiveworks.stocktrade.istocktradereader.IStockTradeReader;
import com.reactiveworks.stocktrade.modelclass.StockTrade;
import com.reactiveworks.stocktrade.stocktradeInvalidformateexception.StockTradeInvalidFormateException;

/**
 * This is StockTradeReaderImpl Class where we will make the body of interface method through Override.
 *
 */
public class StockTradeReaderImpl implements IStockTradeReader{

	private static Logger log = LogManager.getLogger(StockTradeReaderImpl.class); 

	// ==========================================================================
	/**
	 * getMaxVolumeTrade Method where we will give the Maximum Volumne of StockTrade Object.
	 * @return give the Maximum Volumne of  StockTrade Object return type as list
	 */
	@Override
	public StockTrade getMaxVolumeTrade(List<StockTrade> list) {
		log.info("I am Inside GetMaxVolumeTrade method");
		return list.stream().max((a,b)-> b.getVol()>a.getVol()?-1:+1).get();
	} 
	
    // =============================================================================
	
	/**
	 * getMinVolumeTrade Method where we will give the Minimum Volumne of StockTrade.
	 * @return give the Minimum Volumne of  StockTrade Object return type as list
	 */
	@Override
	public StockTrade getMinVolumeTrade(List<StockTrade> list) {
		log.info("I am Inside GetMinVolumeTrade method");
		return list.stream().min((a,b)-> b.getVol()>a.getVol()?-1:+1).get();
	}
	/**
	 * getDailyTradingDifferential Method where we will give in the form of MAp with Date and Double  <p>
	 * from where we can store date by diff of High and OPen StockTrade.
	 * @return give the diff of high and open value of  StockTrade Object return type as Map
	 */
	
   // ===============================================================================
	
	@Override
	public Map<LocalDate, Double> getDailyTradingDifferential(List<StockTrade> list) {
		log.info("I am Inside getDailyTradingDifferential method");
		Map<LocalDate, Double> map = new LinkedHashMap<LocalDate, Double>();
		list.stream().forEach(x-> map.put(x.getDate(), x.getHigh() - x.getOpen()));
		return map;
	}
    /**
     * readStockTrades method from where we can read all data from the csv file into List of StockTrade.
     * @return give the list of stockTrade object from reading the csv file
     */
	
	// ===============================================================================
	
	@SuppressWarnings("resource")
	@Override
	public List<StockTrade> readStockTrades() throws StockTradeInvalidFormateException {
		log.info("I am inside readStockTrades method");
		List<StockTrade> list = new ArrayList<StockTrade>();
		BufferedReader br;
		StockTrade stock;
		
		try {
			br = new BufferedReader(new FileReader("src//main//resources//Cisco.csv"));
			String s ="";
			try {
				s= br.readLine();
				s= br.readLine();
			} catch (IOException e) {
				throw new StockTradeInvalidFormateException("Problem in reading the line");
			}

			while(s != null) {
				stock = new StockTrade();
				String [] s1 = s.split(",");
				stock.setSequrity(s1[0]);
				stock.setDate(changeDatePattern(s1[1]));
				try {
					stock.setOpen(Double.parseDouble(s1[2]));
					stock.setHigh(Double.parseDouble(s1[3]));
					stock.setLow(Double.parseDouble(s1[4]));
					stock.setClose(Double.parseDouble(s1[5]));
					stock.setVol(Double.parseDouble(s1[6]));
					stock.setAdjClose(Double.parseDouble(s1[7]));
				}
				catch(NumberFormatException e) {
					try {
						s = br.readLine();
						continue;
					} catch (IOException e1) {
						throw new StockTradeInvalidFormateException("Problem in reading the line");
					}
				}
				list.add(stock);

				try {
					s = br.readLine();
				} catch (IOException e) {
					throw new StockTradeInvalidFormateException("Problem in reading the line");
				}
			}
		} catch (FileNotFoundException e) {

			throw new StockTradeInvalidFormateException("Path of file is not correct/FIle not found on this path");
		}
		return list;
	}
	
	// ===================================================================================================
	
	private static LocalDate changeDatePattern(String s) {
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
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
		LocalDate date = LocalDate.parse(s1, formatter);
		   return date;
			}
}
