package com.reactiveworks.stocktrade.stocktradereaderimpl;



import java.time.LocalDate;
import java.util.LinkedHashMap;

import java.util.List;
import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.reactiveworks.stocktrade.modelclass.StockTrade;
import com.reactiveworks.stocktrade.stocktradeInvalidformateexception.StockTradeInvalidFormateException;
import com.reactiveworks.stocktrade.stocktradereaderImpl.StockTradeReaderImpl;

/**
 * Test Class Where we test the method for Services.
 * 
 */
public class StockTradeReaderImplTest {
	private static Logger log = LogManager.getLogger(StockTradeReaderImplTest.class);
	private List<StockTrade> list;
	StockTradeReaderImpl reader;
	/**
	 *  SetUp Method which execute every time in before test Annotation.
	 * @throws StockTradeInvalidFormateException if Path is not correct of file.
	 */
	@Before
	public void setUp() throws StockTradeInvalidFormateException {
		log.info("This is inside the SetUp method");
		 reader = new StockTradeReaderImpl();
		 list = reader.readStockTrades();
		
	} 
	/**
	 *  testGetMaxVolumeTrade method for testing the maximum volumne of 
	 *  stockTrade are equal to the Output we get from GetMaxVolumeTrade Method.
	 */
	private StockTrade MaxVol;
	@Test
	public void testGetMaxVolumeTrade() {
		MaxVol = reader.getMaxVolumeTrade(list);
		String s  ="" + MaxVol.getVol();
		Assert.assertEquals(s, "2.432554E8");
		log.info("There is no error while testing the MAximum Volumne");
		
	}
	
	/**
	 *  testGetMinVolumeTrade method for testing the minimum volume of 
	 *  stockTrade are equal to the Output we get from getMinVolumeTrade Method.
	 */
	private StockTrade MinVol;
	@Test
	public void testGetMinVolumeTrade() {
		MinVol = reader.getMinVolumeTrade(list);
		String s  ="" + MinVol.getVol();
		Assert.assertEquals(s, "1.25507E7");
		log.info("There is no error while testing the Minimum Volumne");
	}
	
 
	/**
	 *  testGetDailyTradingDifferential method for testing the diff of High to low Volume of 
	 *  stockTrade are equal to the Output we get from GetDailyTradingDifferential Method.
	 */
	@Test
	public void testGetDailyTradingDifferential() {
		Map<LocalDate, Double> map = new LinkedHashMap<>();
		map = reader.getDailyTradingDifferential(list);
		LocalDate s =  list.get(0).getDate();
			String diff = "" + map.get(s);
			String expected = "" + ((list.get(0).getHigh()-list.get(0).getOpen()));
			Assert.assertEquals(expected, diff);
		log.info("There is no error while testing the GetDailyTradingDifferential Volumne");
	}
}
