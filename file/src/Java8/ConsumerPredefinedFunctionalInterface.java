package Java8;

import java.util.function.Consumer;

public class ConsumerPredefinedFunctionalInterface {

	public static void main(String[] args) {
		
		Consumer<String> c = s->System.out.println(s);
		c.accept("durga");
		c.accept("satish");
		
	}
}
/*
   Predicate<T> =====> boolean ===> test method
   Funtion<T,R> =====> Return type ===> apply method
   Consumer<T>  =====> void  =====> accept
 
 
*/