package pack1;

import java.io.IOException;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.FileAppender;
import org.apache.log4j.HTMLLayout;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.xml.XMLLayout;

public class TestApp {
	// create Logger
	private static Logger log=Logger.getLogger(TestApp.class);
	
	public static void main(String[] args) throws IOException {
		//1. create layout
		
//		Layout layout = new SimpleLayout();
//		Layout layout = new HTMLLayout();
//		Layout layout = new XMLLayout();
		Layout layout = new PatternLayout("%p %d %C %M %m %n");
		
		//2. create Appender + link layout
		
//		Appender app = new ConsoleAppender(layout);
		Appender app = new FileAppender(layout, "S:/WorkSpace/FileAppender/data.log");
		
		// 3.  link appender with logger
		log.addAppender(app);
		
		// print message
		log.info("From INFO");
		log.debug("From DEBUG");
		log.fatal("From FATAL");
		log.error("From ERROR");
		log.warn("From WARN");
	}
}
// https://www.facebook.com/groups/thejavatemple/