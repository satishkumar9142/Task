package Logical_Exercise_7;

public class Factorial {
	public static void main(String[] args) {
		int Uptofac = 20;
		int factorial = 1;
		for(int number =1;number<=Uptofac;number++)
			factorial *= number;
		
	      System.out.println("The Factorial of " + Uptofac + " is " + factorial);
	}
}
