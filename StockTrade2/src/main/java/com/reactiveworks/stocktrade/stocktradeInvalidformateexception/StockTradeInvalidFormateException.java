package com.reactiveworks.stocktrade.stocktradeInvalidformateexception;
/**
 * 
 * This is Custom excepton Class of StockTradeInvalidFormateException
 *
 */
public class StockTradeInvalidFormateException extends Exception {
	/**
	 *  This is no Argument Constructor of StockTradeInvalidFormateException
	 */
	public StockTradeInvalidFormateException() {
		// TODO Auto-generated constructor stub 
	}
	/**
	 *  
	 * @param message  to write known message for own exception.
	 * @param cause  to write causes for the exception.
	 * @param enableSuppression --
	 * @param writableStackTrace --
	 */
	public StockTradeInvalidFormateException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}
	/**
	 * 
	 * @param message - to write known message for own exception.
	 * @param cause - to write causes for the exception.
	 */
	public StockTradeInvalidFormateException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}
	/**
	 * 
	 * @param message - to write known message for own exception.
	 */
	public StockTradeInvalidFormateException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	/**
	 * 
	 * @param cause -  to write causes for the exception.
	 */
	public StockTradeInvalidFormateException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

}
