package Logical_Exercise_5;

import java.util.Scanner;

public class SalesTaxCalculator_5_9 {
	public static void main(String[] args) {
		final double SALES_TAX_RATE = 0.07;
	      final int SENTINEL = -1; 
	      
	      double price, actualPrice, salesTax; 
	      double totalPrice = 0.0, totalActualPrice = 0.0, totalSalesTax = 0.0;  
	      Scanner sc = new Scanner(System.in);
	      System.out.print("Enter the tax-inclusive price in dollars (or -1 to end): ");
	      price =  sc.nextDouble();
	      
	      while (price != SENTINEL) {
	    	  
	    	  salesTax = price*SALES_TAX_RATE;
	    	  actualPrice = price - salesTax;
	    	  System.out.printf("Actual Price is: $ %.2f" , actualPrice);
	    	  System.out.printf(", Sales Tax is: $ %.2f%n",salesTax);
	    	  totalPrice += price;
	    	  totalActualPrice += actualPrice;
	    	  totalSalesTax += salesTax;
	    	  
	    	  System.out.print("Enter the tax-inclusive price in dollars (or -1 to end): ");
	          price =  sc.nextDouble();
	      }
	      System.out.printf("Total Price is: $ %.2f%n",totalPrice);
	      System.out.printf("Total Actual is: $ %.2f%n",totalActualPrice);
	      System.out.printf("Total Sales is: $ %.2f%n",totalSalesTax);
	      
	      sc.close();
	}
}
