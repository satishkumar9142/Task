package Java8;

interface Interf {
	public void m1();
}
//class Demo implements Interf{
//	@Override
//	public void m1() {
//		System.out.println("Hello");	
//	}
//}

public class Q2 {
	public static void main(String[] args) {
//		Demo d = new Demo();
//		Interf d = new Demo();

		Interf d = () -> System.out.println("Hello"); // lambda expression with Functional Interface.
		d.m1();
		d.m1();
		d.m1();
		d.m1();
		d.m1();
		d.m1();
	}
}
/*
 * we can used lambda expression with Functional Interface
 * 
 */