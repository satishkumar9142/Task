package pack1;

import org.apache.log4j.Logger;

public class TestApp {
	// create Logger 
	private static Logger log = Logger.getLogger(TestApp.class);
	public static void main(String[] args) {
		
	  	log.debug("HELLO ONE");
	  	log.info("HELLO TWO");
	  	log.warn("HELLO ABC");
	  	log.error("HELLO XYZ");
	  	log.fatal("HELLO MNO");
	}
}
