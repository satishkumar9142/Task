package Logical_Exercise_12;

public class Special_Series_12_8 {
	public static void main(String[] args) {
		double specialseries =specialSeries(0.5, 10);
		System.out.println(specialseries);
	}
	public static double specialSeries(double x, int numTerms) {
		double sum = 0.0;
		for(int i =1;i<=numTerms;i+=2) {
			sum += Math.pow(x, i)*multiply(i, 'U')/multiply(i, 'D');
		}
		return sum;
	}
	public static double multiply(int x,char c) {
		double mul =1.0;
		if(c=='U')
			for(int i =1;i<x;i+=2) 
				mul *= i;
		else 
			for(int i =2;i<=x;i+=2) 
				mul *= i;
			mul *= x;
		return mul;
	}
}
