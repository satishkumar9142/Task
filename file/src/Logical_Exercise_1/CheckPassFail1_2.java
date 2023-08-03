package Logical_Exercise_1;

import java.util.function.Predicate;

public class CheckPassFail1_2 {
	public static void main(String[] args) {
		int marks =8;
		
		//==============if else ==========================
		 Predicate<Integer> pre = i->i>=10;
		if(pre.test(marks)) 
			System.out.println("Greater than or equal to 49");
		else
			System.out.println("Smaller than 49");
		
		// ================ ternary ========================
		
		System.out.println(marks >=50 ? "marks Greater than or equal to 49" : "Marks Smaller than 49");
		
	}
}
