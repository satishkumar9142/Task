package Java8;

interface B {

//	public static void m1() {
//		System.out.println("Interface static method");
//	}
	public static void main(String[] args) {
		System.out.println("Interface Main method ");
	}
}

//public class StaticMethod implements B {
//    public static void main(String[] args) {
//	   B.m1(); 
//	   m1();
//	   StaticMethod.m1();
//	   StaticMethod s = new StaticMethod();
//	   s.m1();
//	}
//}

/*
 * By default not implements to static Method Class. main method can also execute
 * from interface.
 * 
 * 
 * from 1.8 version inside interface
 * 
 * without affecting implemention classes if you want to interface then default
 * method will come in java8 (extending interface functionality) ==> Default
 * methods
 * 
 * 
 * by default static method not implements inside the class when we are implementing.
 */