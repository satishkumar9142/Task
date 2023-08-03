package com.reactiveworks.stocktrade.suitepackage;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.reactiveworks.stocktrade.stocktradereaderimpl.StockTradeReaderImplFailureTest;
import com.reactiveworks.stocktrade.stocktradereaderimpl.StockTradeReaderImplTest;

@RunWith(Suite.class)
@SuiteClasses({StockTradeReaderImplTest.class,
			StockTradeReaderImplFailureTest.class})
public class suite {

}
