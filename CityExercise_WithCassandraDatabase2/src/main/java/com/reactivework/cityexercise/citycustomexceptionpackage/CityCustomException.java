package com.reactivework.cityexercise.citycustomexceptionpackage;
/**
 * 
 * CityCustomException class.
 *
 */
public class CityCustomException  extends Exception {
	/**
	 * No argument Constructor.
	 */
	public CityCustomException() {
		super();  
		// TODO Auto-generated constructor stub
	}
	/**
	 *  
	 * @param message- msg abount the Exception.
	 * @param cause- from which causes Exception will occur.
	 * @param enableSuppression- 
	 * @param writableStackTrace-
	 */
	public CityCustomException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}
	/**
	 * 
	 * @param message-msg abount the Exception
	 * @param cause-from which causes Exception will occur.
	 */
	public CityCustomException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}
	/**
	 * 
	 * @param cause-from which causes Exception will occur
	 */
	public CityCustomException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}
	public CityCustomException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}
	
}
