package Logical_Exercise_10;

import java.util.Arrays;
import java.util.Scanner;

public class GradesStatistics_10_12 {
	
	public static int[] grades;
	
	public static void main(String[] args) {
		readGrades();
		System.out.println("The grades are: ");
	      print(grades);
	      System.out.printf("The average is : %.2f%n" , average(grades));
	      System.out.printf("The median is :  %.2f%n" , median(grades));
	      System.out.println("The minimum is :" + min(grades));
	      System.out.println("The maximum is :" + max(grades));
	      System.out.printf("The standard deviation is : %.2f%n", stdDev(grades));
	}

	public static double stdDev(int[] array) {
	 	int sum = 0;
	 	for(int number : array) {
	 		sum += number;
	 	}
	 	double mean = (double)sum/array.length;
	 	double stdDev = 0.0;
	 	for(int i=0;i<array.length;i++) {
	 		stdDev += Math.pow((array[i]-mean), 2);
	 	}
	 	stdDev = stdDev/4;
	 	return Math.sqrt(stdDev);
	}

	public static int max(int[] array) {
		int max = Integer.MIN_VALUE;
		for(int number : array) {
			if(number > max) {
				max = number;
			}
		}
		return max;	
	}

	public static int min(int[] array) {
		int min = Integer.MAX_VALUE;
		for(int number : array) {
			if(number < min) {
				min = number;
			}
		}
		return min;	
	}

	public static double median(int[] array) {
		Arrays.sort(array);
		if(array.length%2 !=0) {
			return (double)array[array.length/2];
		}
		else {
			int l = array.length/2;
			return (double)(array[l]+array[l-1])/2;	
		}
		
	}

	public static double average(int[] array) {
		int sum = 0;
		for(int number : array)
			sum += number;
		 return (double)sum/array.length;
	}

	public static void print(int[] array) {
		System.out.println(Arrays.toString(array));
		
	}

	public static void readGrades() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students: ");
		int number = sc.nextInt();
		grades = new int[number];
		for(int index =0;index<grades.length;index++) {
			System.out.println("Enter the grade for student " +(index+1) + " : ");
			grades[index] = sc.nextInt();
		}
		sc.close();
	}
}
