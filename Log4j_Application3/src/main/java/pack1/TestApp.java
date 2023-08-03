package pack1;

import org.apache.log4j.Logger;

public class TestApp {

	private static Logger log = Logger.getLogger(TestApp.class);

	public static void main(String[] args) {
	
		for(int i = 0; i < 500; i++) {
			log.info("This is the " + i + " time INFO");
			log.debug("This is the " + i + " time DEBUG");
			log.warn("This is the " + i + " time WARN");
			log.error("This is the " + i + " time ERROR");
			log.fatal("This is the " + i + " time FATAL");
		}
		System.out.println("done");	
	}
}
