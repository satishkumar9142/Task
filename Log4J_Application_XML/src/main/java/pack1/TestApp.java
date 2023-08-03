package pack1;

import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

public class TestApp {
    static Logger logger = Logger.getLogger(TestApp.class);  
	public static void main(String[] args) {
		 DOMConfigurator.configure("log4j.xml");  
	       logger.debug("Sample debug message");  
	       logger.info("Sample info message");  
	       logger.warn("Sample warn message");  
	       logger.error("Sample error message");  
	       logger.fatal("Sample fatal message");
	}	    
}
