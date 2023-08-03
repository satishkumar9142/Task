package Logical_Exercise_15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.BiPredicate;

public class Prime_Factors_15_3 {
	public static boolean isProductOfPrimeFactors(int aPosInt) {
		BiPredicate<Integer, Integer> pre = (a,b) -> a%b==0;
		int mul =1;
		for(int div =1;div<=aPosInt/2;div++) {
			if(pre.test(aPosInt, div) && isPrime(div)) {
				mul *= div;
			}
		}
		if(mul == aPosInt)return true;
		return false;
	}
	
	public static boolean isPrime(int aPosInt) {
		BiPredicate<Integer, Integer> pre = (a,b) -> a%b==0;
		for(int div =2;div<=aPosInt/2;div++) {
			if(pre.test(aPosInt, div))return false;
		} 
		return true;
	}
	public static void print(int upperBound) {
		List<Integer> primeList = new ArrayList<>();
		for(int num = 1;num<=upperBound;num++) {
			if(isProductOfPrimeFactors(num)) {
				primeList.add(num);
			}
		}
		System.out.println("These numbers are equal to the product of prime factors: ");
		primeList.stream().forEach(System.out::println);
		System.out.println("[" +primeList.size() +" numbers found (" +(((double)primeList.size()*100)/upperBound) +"%)]");
	}
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the upper bound: ");
		int upperBound = sc.nextInt();
		print(upperBound);
		
		sc.close();
	}
}
