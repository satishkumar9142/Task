package Logical_Exercise_5;

import java.util.Scanner;

public class IncomeTaxCalculator5_5 {
	public static void main(String[] args) {
		final double TAX_RATE_ABOVE_20K = 0.1;
		final double TAX_RATE_ABOVE_40K = 0.2;
		final double TAX_RATE_ABOVE_60K = 0.3;

		int taxableIncome;
		double taxPayable = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the taxable income: ");
		taxableIncome = sc.nextInt();

		if(taxableIncome > 60000) {
			taxPayable += (taxableIncome-60000)*TAX_RATE_ABOVE_60K + 20000*TAX_RATE_ABOVE_40K + 20000 *TAX_RATE_ABOVE_20K;
		}
		else if(taxableIncome > 40000){
			taxPayable += (taxableIncome-40000)*TAX_RATE_ABOVE_40K + 20000*TAX_RATE_ABOVE_20K;	
		}
		else if(taxableIncome > 20000){
			taxPayable += (taxableIncome-20000)*TAX_RATE_ABOVE_20K;	
		}
		
		System.out.printf("The income tax payable is : $%.2f%n", taxPayable);
		sc.close();
	}
}
