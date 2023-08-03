package Logical_Exercise_5;

import java.util.Scanner;

public class PensionContributionCalculatorWithSentinel_5_8 {
	public static void main(String[] args) {
		final int SENTINEL =-1;
		final double EMPLOYEE_RATE_55_AND_BELOW = 0.2;
		final double EMPLOYER_RATE_55_AND_BELOW = 0.17;
		final double EMPLOYEE_RATE_55_TO_60 = 0.13;
		final double EMPLOYER_RATE_55_TO_60 = 0.13;
		final double EMPLOYEE_RATE_60_TO_65 = 0.075;
		final double EMPLOYER_RATE_60_TO_65 = 0.09;
		final double EMPLOYEE_RATE_65_ABOVE = 0.05;
		final double EMPLOYER_RATE_65_ABOVE = 0.075;

		int salary, age;
		double employeeContribution, employerContribution, totalContribution;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the monthly salary (or -1 to end): $");
		salary = sc.nextInt();
		
		while(salary != SENTINEL) {
			System.out.println("Enter the age: ");
			age = sc.nextInt();
			if (age <= 55) {  
				employeeContribution =  EMPLOYEE_RATE_55_AND_BELOW*salary;
				employerContribution =  EMPLOYER_RATE_55_AND_BELOW *salary;
				totalContribution    = employeeContribution + employerContribution;

			} else if (age <= 60) {  
				employeeContribution =  EMPLOYEE_RATE_55_TO_60*salary;
				employerContribution =  EMPLOYER_RATE_55_TO_60 *salary;
				totalContribution    =  employeeContribution + employerContribution;

			} else if (age <= 65) {
				employeeContribution =  EMPLOYEE_RATE_60_TO_65*salary;
				employerContribution =  EMPLOYER_RATE_60_TO_65*salary;
				totalContribution    =  employeeContribution + employerContribution;

			} else {     
				employeeContribution =  EMPLOYEE_RATE_65_ABOVE*salary;
				employerContribution =  EMPLOYER_RATE_65_ABOVE*salary;
				totalContribution    =  employeeContribution + employerContribution;   
			}
			System.out.printf("The employee's contribution is: $ %.2f%n", employeeContribution);
			System.out.printf("The employer's contribution is: $ %.2f%n", employerContribution);
			System.out.printf("The total contribution is: $ %.2f%n", totalContribution);
			
			System.out.println("Enter the monthly salary (or -1 to end): $");
			salary = sc.nextInt();
			
		}
		System.out.println("bye!");
		
		sc.close();
	}
}
