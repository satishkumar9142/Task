package Logical_Exercise_13;

public class Fibonacci_13_2 {
	public static void main(String[] args) {
		System.out.println(fibonacci(5));
	}
	public static int fibonacci(int n) {
		   if (n == 0) {
		      return 0;
		   } else if (n == 1) {
		      return 1;
		   } else {
		      return fibonacci(n-1) + fibonacci(n-2);
		   }
		}
}
