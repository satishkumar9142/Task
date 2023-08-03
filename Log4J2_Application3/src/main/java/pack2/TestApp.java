package pack2;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestApp {
	
	private static Logger log = LogManager.getLogger(TestApp.class);
	
	public static void main(String[] args) {
	  
		for(int i=0;i<100;i++) {
			log.info("I am From Info");
			log.debug("I am from Debug");
			log.warn("I am from Warn");
			log.error("I am from Error");
			log.fatal("I am from Fatal");
		}
	}
}
