package Logical_Exercise_13;


public class Factorial_Recusive_13_1 {
	public static void main(String[] args) {
		int n = 4;
		System.out.println("factorial of "+ n +" is :" + factorial(n));
	}
	public static int factorial(int n) {
		 return (n == 0) ? 1 : n*factorial(n-1);
	}

}
