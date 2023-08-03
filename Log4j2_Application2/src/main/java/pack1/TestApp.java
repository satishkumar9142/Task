package pack1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestApp {
	
	private static Logger log = LogManager.getLogger(TestApp.class);
	public static void main(String[] args) {
		
		for(int i=0;i<100;i++) {
			log.debug("I am from Debug");
			log.info("I am from INFO");
			log.warn("I am from warn");
			log.error("I am from error");
			log.fatal("I am from fatal");
		}
	}
}
