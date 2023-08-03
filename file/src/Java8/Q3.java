package Java8;

interface Interface {
	public void add(int a, int b);
}

//class Demo1 implements Interface{
//
//	@Override
//	public void add(int a, int b) {
//		System.out.println("The Sum is = " + (a + b));
//	}	
//}

public class Q3 {
	public static void main(String[] args) {
//		Interface i  = new Demo1();
		Interface i = (a, b) -> System.out.println("The Sum is = " + (a + b));
		i.add(15, 15);
		i.add(10, 15);
		i.add(12, 13);
		i.add(15, 11);
	}
}
