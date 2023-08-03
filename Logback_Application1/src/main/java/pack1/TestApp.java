package pack1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestApp {
	
	private static Logger log = LoggerFactory.getLogger(TestApp.class);
	
	public static void main(String[] args) {
	 	for (int i = 1; i < 1000; i++) {
			log.error("This is From Error" +i);
			log.debug("This is From Debug" + i);
			log.info("This is From Info" + i);
		}
	}
}
