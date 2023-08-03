package Logical_Exercise_5;

import java.util.Scanner;

public class IncomeTaxCalculatorWithSentinel_5_6 {
	public static void main(String[] args) {
		final int SENTINEL = -1;
		final double TAX_RATE_ABOVE_20K = 0.1;
		final double TAX_RATE_ABOVE_40K = 0.2;
		final double TAX_RATE_ABOVE_60K = 0.3;
		int taxableIncome = 0;
		double taxPayable = 0;

		Scanner sc = new Scanner(System.in);
		

		while (taxableIncome != SENTINEL) {
			System.out.print("Enter the taxable income (or -1 to end): $");
			taxableIncome = sc.nextInt();
			if(taxableIncome > 60000) {
				taxPayable = (taxableIncome-60000)*TAX_RATE_ABOVE_60K + 20000*TAX_RATE_ABOVE_40K + 20000 *TAX_RATE_ABOVE_20K;
			}
			else if(taxableIncome > 40000){
				taxPayable = (taxableIncome-40000)*TAX_RATE_ABOVE_40K + 20000*TAX_RATE_ABOVE_20K;	
			}
			else if(taxableIncome > 20000){
				taxPayable = (taxableIncome-20000)*TAX_RATE_ABOVE_20K;	
			}
			
			System.out.println("The income tax payable is: "+ taxPayable);
		}
		System.out.println("bye!");
		
		sc.close();

	}
}
