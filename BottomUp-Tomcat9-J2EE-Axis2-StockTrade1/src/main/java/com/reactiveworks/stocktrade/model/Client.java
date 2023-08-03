package com.reactiveworks.stocktrade.model;

import com.reactiveworks.stocktrade.exception.StockTradeInvalidFormateException;
import com.reactiveworks.stocktrade.service.StockTradeReaderImpl;

public class Client {
	public static void main(String[] args) throws StockTradeInvalidFormateException {
		StockTradeReaderImpl impl = new StockTradeReaderImpl();
		System.out.println(impl.getDailyTradingDifferential());
	}
}
