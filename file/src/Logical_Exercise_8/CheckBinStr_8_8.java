package Logical_Exercise_8;

import java.util.Scanner;
import java.util.function.Predicate;

public class CheckBinStr_8_8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String inStr = sc.next();	
		
	      int inStrLen = inStr.length();
	      char inChar;     
	      boolean isValid; 
	      
	      isValid = true;
	      Predicate<Character> pre = i-> (i=='0'||i=='1');
	      for(int i =0;i<inStrLen;i++) {
	    	  inChar = inStr.charAt(i);
	    	  if(!(pre.test(inChar))) {
	    		  isValid = false;
	    		  break;
	    	  }
	      }
	      System.out.println(isValid ? inStr + " is a binary string" : inStr+" is NOT a binary String");
	      
	      sc.close();
	      
	}
}
