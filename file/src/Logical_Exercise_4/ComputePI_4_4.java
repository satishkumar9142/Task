package Logical_Exercise_4;

public class ComputePI_4_4 {
	public static void main(String[] args) {
		double sum = 0.0;
		int MAX_DENOMINATOR = 100000000;   
		for (int denominator = 1; denominator <= MAX_DENOMINATOR; denominator += 2){
			if (denominator % 4 == 1) {
				sum +=(double) 1/ denominator;
			}if (denominator % 4 == 3) {
				sum -= (double) 1/ denominator;
			} 
		}
		System.out.println(4*sum);
		System.out.println((sum/Math.PI)*100);
		System.out.println(Math.PI);
	} 
}
