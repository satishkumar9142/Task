package pack1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestApp {
	
	private static Logger log = LoggerFactory.getLogger(TestApp.class);
	
	public static void main(String[] args) {
		for(int i=0;i<1000;i++) {
		  log.debug("This is from debug");
		  log.error("This is from error");
		  log.warn("This is from WARN");
		}
	}
}
