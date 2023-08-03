package Logical_Exercise_12;

public class Trigonometric_Series_12_6 {
	
	public static double sin(double x, int numTerms) {
		double sum =0.0;
		for(int i =1;i<=numTerms;i+=4) {
			sum += Math.pow(x, i)/factorial(i);
			sum -= Math.pow(x, i+2)/factorial(i+2);
		}
		return sum;
	}  
	public static double cos(double x, int numTerms) {
		double sum =1.0;
		for(int i =2;i<=numTerms;i+=4) {
			sum -= Math.pow(x, i)/factorial(i);
			sum += Math.pow(x, i+2)/factorial(i+2);
		}
		return sum;
	}
	public static double factorial(int x) {
		if(x == 1)
			return x;
		return x* factorial(x-1);
	}
	public static void main(String[] args) {
		double sin = sin(0.52, 10);
		double cos = cos(0.52, 10);
		System.out.println(sin);
		System.out.println(Math.sin(0.52));
		System.out.println(cos);
		System.out.println(Math.cos(0.52));
	}
}
