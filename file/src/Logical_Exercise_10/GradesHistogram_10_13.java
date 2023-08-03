package Logical_Exercise_10;


public class GradesHistogram_10_13 {
	public static void PrintVertically(int [] array, String [] StringArray) {
		for(int i =0;i<array.length;i++) {
			System.out.print(StringArray[i]);
			for(int j =0;j<array[i];j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void PrintHorizontally(int [] array, String [] StringArray) {
		for(int i =0;i<array.length;i++) {
			for(int j =0;j<array[i];j++) {
				System.out.println("* ");
			}
			System.out.println(StringArray[i]);		
		}
	}

	public static void main(String[] args) {
		int [] array = {3,3,0,0,1,5,0,0,1,2};
		String [] StringArray = {" 0 -  9: ","10 - 19: ","20 - 29: ","30 - 39: ","40 - 49: ","50 - 59: ","60 - 69: ","70 - 79: ","80 - 89: ","90 -100: "};

			PrintVertically(array, StringArray);
//		PrintHorizontally(array, StringArray);
	}

}
