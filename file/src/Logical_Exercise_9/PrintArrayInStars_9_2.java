package Logical_Exercise_9;

import java.util.Scanner;

public class PrintArrayInStars_9_2 {
	public static void main(String[] args) {
		 int NUM_ITEMS;
		 int [] items;
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter the number of items ");
		 NUM_ITEMS = sc.nextInt();
		 
		 System.out.println("Enter the value of all items (separated by space): ");
		 items = new int[NUM_ITEMS];
		 if(items.length>0)
		 for(int index =0;index<items.length;index++) {
			 items[index] = sc.nextInt();
		 }
		 for(int index =0;index<items.length;index++) {
			 System.out.print(index+": ");
			 for(int j =1;j<=items[index];j++)
			 System.out.print("*");
			 System.out.println("("+items[index]+")");
		 }
		 
		 sc.close();
	}
}
