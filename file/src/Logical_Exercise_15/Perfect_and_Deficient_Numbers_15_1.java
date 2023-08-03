package Logical_Exercise_15;

import java.util.ArrayList;

import java.util.List;
import java.util.Scanner;
import java.util.function.BiPredicate;

public class Perfect_and_Deficient_Numbers_15_1 {
	public static boolean isPerfect(int aPosInt) {
		BiPredicate<Integer, Integer> pre = (a,b)->a%b == 0;
		int sum =0;
		for(int i=1;i<=aPosInt/2;i++) {
			if(pre.test(aPosInt, i))
				sum += i;
		}
		return sum == aPosInt;
	}
	public static boolean isDeficient(int aPosInt) {
		BiPredicate<Integer, Integer> pre = (a,b)->a%b == 0;
		int sum =0;
		for(int i=1;i<=aPosInt/2;i++) {
			if(pre.test(aPosInt, i))
				sum += i;
		}
		return sum < aPosInt;
	}
	public static void print(int upper) {

		List<Integer> PerfectNumber = new ArrayList<>();
		List<Integer> deficientNumber = new ArrayList<>();
		List<Integer> neitherPerfectorDeficient = new ArrayList<>();
		for(int number = 1;number<=upper;number++) {
			if(isPerfect( number )) 
				PerfectNumber.add( number );
			else if(isDeficient( number )) 
				deficientNumber.add(number);
			else 
				neitherPerfectorDeficient.add(number);
		}
		
		System.out.println("These number are perfect: ");
		System.out.println(PerfectNumber);
		System.out.println("[" + PerfectNumber.size()+ " perfect number found ("+ ((double)PerfectNumber.size()*100)/upper + "%)]");
		System.out.println("These number are neither deficient nor perfect: ");
		System.out.println(neitherPerfectorDeficient);
		System.out.println("[" + neitherPerfectorDeficient.size()+ " number found ("+ ((double)neitherPerfectorDeficient.size()*100)/upper + "%)]");
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the upper bound: ");
		int upper = sc.nextInt();
		print(upper);
		sc.close();

	}
}
