package Logical_Exercise_10;


public class print_10_4 {
	
	public static void print(int[] array) {
		System.out.print("[");
		for(int index =0;index<array.length-1;index++) {
			System.out.print(array[index] + ", ");
		}
		System.out.print(array[array.length-1]+"]");
	}
	
	public static void main(String[] args) {
		int [] array = {1,2,3,4,5,6,7};
		print(array);
	}
}
