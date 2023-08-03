package pack1;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestApp {
	private static final Logger logger 
	=LogManager.getLogger(TestApp.class);
	public static void main(String[] args)  {
		for(int i = 0; i < 10000; i++) {
			logger.info("This is the " + i + " time I say 'info'.");
			logger.error("This is the " + i + " time I say 'error'.");
			logger.warn("This is the " + i + " time I say 'warn'.");
			logger.fatal("This is the " + i + " time I say 'fatal'.");
			logger.debug("This is the " + i + " time I say 'debug'.");
		}
	}
}


