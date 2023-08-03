package Logical_Exercise_1;

import java.util.function.Predicate;

public class CheckOddEven1_3 {
	public static void main(String[] args) {
	 
	 int number =49;
	 Predicate<Integer> pre = i->i%2==0;
	 
	 if(pre.test(number)) 
		 System.out.println(number + " is Even");
	 else 
		 System.out.println(number + " is Odd");
	 
	 // ternary
	 System.out.println(number%2 ==0 ? number +" is Even" : number + " is Odd");
	}
}
