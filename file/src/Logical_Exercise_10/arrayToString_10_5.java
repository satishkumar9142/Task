package Logical_Exercise_10;

public class arrayToString_10_5 {
	public static void main(String[] args) {
		int [] array = {10,20,30,40,50,60,70};
		System.out.println(arrayToString(array));
	}
	public static String arrayToString(int[] array) {
		String toString ="[";
		for(int index =0;index<array.length-1;index++) {
			toString += array[index]+", ";
		}
		toString += array[array.length-1]+ "]";
		return toString;
	}
}
