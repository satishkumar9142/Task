package Logical_Exercise_11;

import java.util.Arrays;

public class Arithmetic_11_1 {
	public static void main(String[] args) {
		int operand1, operand2;
	    char theOperator;
	    
	    if (args.length != 3) {
	        System.err.println("Usage: java Arithmetic int1 int2 op");
	        return;
	      }
	    
	    operand1 = Integer.parseInt(args[0]);
	    operand2 = Integer.parseInt(args[1]);
	    theOperator = args[2].charAt(0);
	    
	    System.out.print(args[0] + args[2] + args[1] + "=");
	    
	    switch(theOperator) {
	      case ('-'): System.out.println(operand1 - operand2); break;
	      case ('+'): System.out.println(operand1 + operand2); break;
	      case ('*'): System.out.println(operand1 * operand2); break;
	      case ('/'): System.out.println(operand1 / operand2); break;
	      default:
	        System.err.println("Error: invalid operator!"); 
	    }
	    System.out.println("args is: "+Arrays.toString(args));
	    System.out.println("args.length is:" + args.length);
	    System.out.println("args[0]:" + args[0]);
	    System.out.println("args[1]:" + args[1]);
	    System.out.println("args[2]:" + args[2]);
	    System.out.println("args[0].length():" + args[0].length());
	    System.out.println("args[1].length():" + args[1].length());
	    System.out.println("args[2].length():" + args[2].length());
	    
	}
}	
