package pack1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestApp {
	
	private static Logger log = LoggerFactory.getLogger(TestApp.class);
	public static void main(String[] args) {
	 
		for(int i=0;i<1000;i++) {
			log.debug("Hi I am from debug");
			log.error("Hi I am from error");
			log.warn("Hi I am from warn");
		}
	}
}
