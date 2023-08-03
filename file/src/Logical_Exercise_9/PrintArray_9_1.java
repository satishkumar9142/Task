package Logical_Exercise_9;

import java.util.Scanner;

public class PrintArray_9_1 {
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
		 System.out.print("The values are: [");
		 for(int index =0;index<items.length-1;index++) {
			 System.out.print(items[index]+", ");
		 }
		 System.out.print(items[items.length-1] +"]");
		 sc.close();
	}
}
