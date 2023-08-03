package Logical_Exercise_4;

public class Product1ToN_4_2 {

	public static void main(String[] args) {
		int product = 1;     
		final int LOWERBOUND = 1;
		final int UPPERBOUND = 10;
		
	// ============= USing For Loop ===============		
		for(int number = LOWERBOUND;number<=UPPERBOUND;number++) {
			product *= number;
		}
		System.out.println(product);
	// ==============Using While Loop ==============
		product =1;
		int number =1;
		while(number  <= UPPERBOUND) {
			product *= number;
			number++;
		}
		System.out.println(product);
		
    // ==============Using do While Loop ==============
		product =1;
		number =1;
		do {
			product *= number;
			number++;
		}
		while(number  <= UPPERBOUND) ;
		System.out.println(product);
	}

}
