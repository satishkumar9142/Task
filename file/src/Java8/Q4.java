package Java8;

interface A {
	public int squareIt(int n);
}

//class Demo2 implements A{
//	@Override
//	public int squareIt(int n) {
//		int a = n*n;
//		return a;
//	}
//}
public class Q4 {
	public static void main(String[] args) {
		A i = n -> n * n; // for square of two number using functional interface and lambda expression
		System.out.println(i.squareIt(4));
		System.out.println(i.squareIt(6));
	}
}
