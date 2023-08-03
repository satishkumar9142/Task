package Logical_Exercise_12;

import java.util.Scanner;

public class FibonacciInt_12_10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		if(num < 46)
		System.out.println("f("+num+") = "+fibonacci(1, 1, 2, num, 0));
		else
		System.out.println("f("+num+") is out of the range of int");
		
		sc.close();
	}
	public static int fibonacci(int f0, int f1,int f2, int num,int count) {
		if(num == 0)return f0;
		if(num == 1)return f1;
		if(count >= num-2) {
			return f2;
		}
		f0 = f1;
		f1 = f2;
		f2 = f1 +f0;
		count++;
		return fibonacci(f0, f1, f2, num, count);
		
		
	}
}
