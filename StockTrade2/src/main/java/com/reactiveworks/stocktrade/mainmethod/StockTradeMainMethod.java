package com.reactiveworks.stocktrade.mainmethod;

import java.time.LocalDate;
import java.util.List;



import java.util.Map;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.reactiveworks.stocktrade.modelclass.StockTrade;
import com.reactiveworks.stocktrade.stocktradeInvalidformateexception.StockTradeInvalidFormateException;
import com.reactiveworks.stocktrade.stocktradereaderImpl.StockTradeReaderImpl;

/**
 * StockTrade Main Method Class.<P>
 * This is used take all data from other class and simply execute all thing from main method Class.
 *
 */
public class StockTradeMainMethod {  

	private static Logger log = LogManager.getLogger(StockTradeMainMethod.class);
	/**
	 * 
	 * @param args -- main method
	 */
	public static void main(String[] args) {

		log.info("I am inside Main Method of Stocktrade"); 
		StockTradeReaderImpl impl = new StockTradeReaderImpl();
		List<StockTrade> stock =null;
		StockTrade minVol = null;
		StockTrade maxVol= null;
		Map<LocalDate,Double> tradeDiff=null;

		try {
			stock = impl.readStockTrades();
		} catch (StockTradeInvalidFormateException e) {

		}
		minVol = impl.getMinVolumeTrade(stock);
		maxVol = impl.getMaxVolumeTrade(stock);
		tradeDiff = impl.getDailyTradingDifferential(stock);

		log.info("All Data Of stock Trade" + stock);
		log.info("minimum volume of Stock" + minVol);
		log.info("Maximum Volumne of Stock" + maxVol);
		log.info("Trade Difference 0f HighTrade and OpenTrade" + tradeDiff);
	}
}
