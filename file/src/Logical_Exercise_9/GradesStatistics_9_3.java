package Logical_Exercise_9;

import java.util.Scanner;

public class GradesStatistics_9_3 {
	public static void main(String[] args) {
		 int NUM_STUDENTS;
		 int [] students;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the number of students ");
		 NUM_STUDENTS = sc.nextInt();
		 students = new int[NUM_STUDENTS];
		 
		 int sum =0;
		 int min = Integer.MAX_VALUE;
		 int max = Integer.MIN_VALUE;
		 for(int index =0;index<students.length;index++) {
			 System.out.println("Enter the grade for student " +(index+1) +" : ");
			 students[index] = sc.nextInt();
			 sum += students[index];
			 if(min > students[index]) {
				 min = students[index];
			 }
			 if(max < students[index]) {
				 max = students[index];
			 }
		 }
		 double avg = (double) sum/NUM_STUDENTS;
		 System.out.printf("The average is: %.2f%n", avg );
		 System.out.println("The minimum is : " + min);
		 System.out.println("The maximum is : " + max);
		 
		 
		 sc.close();
	}
}
