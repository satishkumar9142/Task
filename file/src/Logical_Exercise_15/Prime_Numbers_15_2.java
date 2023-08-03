package Logical_Exercise_15;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;
import java.util.function.BiPredicate;

public class Prime_Numbers_15_2 {
	
	public static boolean prime(int num) {
		BiPredicate<Integer, Integer> pre = (a,b) -> a%b==0;
		for(int div =2;div<=num/2;div++) {
			if(pre.test(num, div))return false;
		}
		return true;
	}
	
	public static void print(int upperBound) {
		List<Integer> primeList = new ArrayList<>();
		for(int num = 1;num<=upperBound;num++) {
			if(prime(num)) {
				primeList.add(num);
			}
		}
		primeList.stream().forEach(System.out::println);
		System.out.println("[" +primeList.size() +" primes found (" +(((double)primeList.size()*100)/upperBound) +"%)]");
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the upper bound: ");
		int upperBound = sc.nextInt();
		print(upperBound);
		
		sc.close();
	}
}
