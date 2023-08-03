package Java8;

import java.util.function.Function;
import java.util.function.Predicate;

public class Q1 {
	public static void main(String[] args) {

		Function<Integer, Integer> f = i -> i * i; //

		Predicate<Integer> p = i -> i % 2 == 0;

		System.out.println("Square of 4 is " + f.apply(4));
		System.out.println("Square of 5 is " + f.apply(5));
		System.out.println(p.test(8));
		System.out.println(p.test(9));

	}

// eg1
	public void m1() {
		System.out.println("Hello");
	}
//	() -> System.out.println("Hello");

// eg2

	public void m2(int a, int b) {
		System.out.println(a + b);
	}

//	(a,b) -> System.out.println(a+b);  // compiler automatically take int type

// eg3

	public int m3(int n) {
		return n * n;
	}

//	(int n) -> return n * n;
//	(int n) -> n * n;
//	(n) -> n * n;
//	n->n*n;  

	// eg4

	public int m4(String s) {
		return s.length();
	}

//	(String s)->  return s.length();  // without cully braces return statement not required
//   s -> s.length();

	/*
	 * FI ==> Functional Interface
	 * 
	 * Runnable ==> run() Comparable ==> comapreTo() CompareTo ==> compare()
	 * ActionLisener ==> actionPerfromed() Callable ==> call()
	 * 
	 * There is only one method(Functional method only one method) lambda is used
	 * only for functional Interface.
	 * 
	 * 
	 * n ->return n*n; ===> Invalid return statement inside curly braces n ->{return
	 * n*n;}; ===> valid
	 * n ->{return n*n}; ===> InValid semi-coln is missing. 
	 * n->{n*n;}; ==> Invalid 
	 * n -> n*n; ===> Valid
	 * 
	 * 
	 * 
	 * Functional Interfaces ====================== (Which contains single abstract
	 * method (SAM) and any no of method but 1 abstract method is mandatory.
	 * 
	 * Runnable ==> run() Callable ==> call() Comparable ==> compareTo() CompareTo
	 * ==> compare() ActionListener ==> actionPerformed()
	 * 
	 * @FunctionalInterface // these anotation is used to check the check the
	 * Functional Interface interface interf { public void m1(); ==> abstract method
	 * 
	 * }
	 * 
	 */

	/*
	 * Lambda Expression with Functional Interfaces
	 * =============================================
	 * 
	 * 
	 * 
	 * 
	 */
}
