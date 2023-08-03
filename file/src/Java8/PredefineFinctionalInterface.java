package Java8;

import java.util.function.IntPredicate;
import java.util.function.Predicate;

public class PredefineFinctionalInterface {
	public static void main(String[] args) {

		Predicate<Integer> pre = i -> i % 2 == 0;
		System.out.println(pre.test(12));
		
		Predicate<String> pre1 = s -> s.length() > 5;
		System.out.println(pre1.test("svh"));
		
		String [] s1 = {"Nag", "Chiranjeevi","Venkatesth","Balaiah","Sunny","Katrina"};
		Predicate<String> p1 = s ->s.length()%2==0;
		for(String s2 : s1) {
			System.out.println(s2 + " length is less than or greater than 5 or not "+p1.test(s2));
		}
		
		int [] x = {0,5,10,15,20,25,30,35};
		IntPredicate p2 = i->i%2==0|| i>10;  //predicate<Intege> to IntPredicate
		Predicate<Integer> p3 = i->i>10;
		
		for(int x1 : x) {
			System.out.println(x1 + " " + p2.test(x1));
//			p2.or(p3).test(x1);
//			p2.and(p3).test(x1);
			
		}
	}

}

/*
 * Predefine Functional Interfaces ================================
 * 
 * Predicate === only one abstract method 
 * Function 
 * Consumer 
 * Supplier
 * 
 * Two argument predefined functional interfaces:
 * ===============================================
 * 
 * BiPredicate 
 * BiFunction
 * BiConsumer
 * 
 * 
 * primitive Functional interfaces
 * =============================================== 
 * IntPredicate 
 * IntFunction
 * IntConsumer
 * 
 * =============================================
 * 
 * 
 * 
 * 
 */
