package Logical_Exercise_10;

import java.util.Arrays;

public class reverse_10_11 {
	
	public static void reverse(int[] array) {
		  for(int index =0;index<array.length/2;index++) {
			  int temp = array[index];
			  array[index] = array[array.length-1-index];
			  array[array.length-1-index] = temp;
		  }	
		}
	
	public static void main(String[] args) {
	 	int [] array = {1,2,3,4};
	 	System.out.print("the reverse of "+Arrays.toString(array) + " is "); 
	 	reverse(array);
	 	System.out.println(Arrays.toString(array));
	}
	
}
