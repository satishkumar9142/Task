package pack1;

import org.apache.log4j.Logger;

public class TestApp {
	private static Logger log = Logger.getLogger(TestApp.class);
	public static void main(String[] args) {
		
		for(int i =0;i<2000;i++) {
			log.info("I am from Info");
		}
		System.out.println("done");
	}
}
