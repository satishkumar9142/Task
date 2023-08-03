package Java8;

public class AnonymousInnerClass {
	public static void main(String[] args) {

		Runnable r = () -> {
			for (int i = 0; i < 10; i++) {
				System.out.println("Child Class");
			}
		};
		Thread t = new Thread(r);
		t.start();
		for (int i = 0; i < 10; i++) {
			System.out.println("Main Thread");
		}
	}
}

//=========================================================
/*
 * Anonymous Inner Class Vs Lambda Expressions
 * ========================================================================= The
 * class which are without name is called Anonymous Class
 * 
 * If Anonymous Inner Class Implements and interface that contains single
 * abstract method then only we can replace that anonymous Inner class with
 * lambda.
 * ============================================================================
 * Anonymous Inner Class can extend a normal class. 
 * Anonymous Inner Class can extend a abstract class.
 * Anonymous Inner Class can implements an interface which contains any number of abstract method.
 * ============================================================================
 * Lambda Expression can implements an interface which contains a single
 * abstract method(FI)
 *
 * Anonymous Inner class is more powerful than Lambda Expression.
 */