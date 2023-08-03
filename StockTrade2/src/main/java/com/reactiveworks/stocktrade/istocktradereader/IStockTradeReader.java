package com.reactiveworks.stocktrade.istocktradereader;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

import com.reactiveworks.stocktrade.modelclass.StockTrade;
import com.reactiveworks.stocktrade.stocktradeInvalidformateexception.StockTradeInvalidFormateException;
/**
 * 
 * interface is four Abstract method.<P>
 *
 */
public interface IStockTradeReader {
	
	public List<StockTrade> readStockTrades() throws StockTradeInvalidFormateException;

	public StockTrade getMaxVolumeTrade(List<StockTrade> list);
	
	public StockTrade getMinVolumeTrade(List<StockTrade>list);
	
	public Map<LocalDate,Double> getDailyTradingDifferential(List<StockTrade> list);	
}
