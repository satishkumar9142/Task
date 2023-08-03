package Logical_Exercise_4;

public class Fibonacci_4_6 {
	public static void main(String[] args) {

		int n = 3;          // The index n for F(n), starting from n=3, as n=1 and n=2 are pre-defined
		int fn = 1;             // F(n) to be computed
		int fnMinus1 = 1;   // F(n-1), init to F(2)
		int fnMinus2 = 1;   // F(n-2), init to F(1)
		int nMax = 20;      // maximum n, inclusive
		int sum = fnMinus1 + fnMinus2;  // Need sum to compute average
		double average;	
		System.out.println("The first " + nMax + " Fibonacci numbers are:");
		System.out.print(fnMinus1 + " " + fnMinus2 + " ");
		
		while(n <= nMax) {
			fn = fnMinus1 + fnMinus2;
			sum += fn;
			n++;
			fnMinus2 =fnMinus1;
			fnMinus1 = fn;
			System.out.print(fn+ " ");
		}
		average = (double)sum/nMax;
		System.out.println();
		System.out.println("The average is " + average);
		
// ============================== Tribonacci numbers ========================
		
		int firstNumber=1 , secondNumber = 1,thirdNumber =2;
		int count =4;
		int result = firstNumber + secondNumber + thirdNumber;
		System.out.println("The first " + nMax + " Tribonacci numbers are:");
		System.out.print(firstNumber + " " + secondNumber + " " + thirdNumber + " ");
		
		while(count <= nMax) {
			System.out.print(result + " ");
			firstNumber = secondNumber;
			secondNumber = thirdNumber;
			thirdNumber = result;
			result = firstNumber + secondNumber + thirdNumber;
			count++;	
		}
	}
}
