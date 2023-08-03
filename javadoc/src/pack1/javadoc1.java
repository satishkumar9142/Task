package pack1;

/**
 * This class is to demonstrate what javadoc is and how it is used in java industry
 * This is <i>italic</i> word<p>this is a new paragraph</p>
 * {@link #div(int, int)} can be used. then we will find quotient.
 * {@link #add(int, int)} can be used. then we will find the addition.
 * @author rajsatish
 * @version 0.1
 * @since 2002
 * @see <a href="https://docs.oracle.com/en/java/javase/14/docs/api/index.html" target="_blank">Java Docs</a>
 */
public class javadoc1 {
	/**
	 * @deprecated This is inside method
	 * @param a This is first integer number
	 * @param b This is Second integer number
	 * @return (a/b) This is the quotient number.
	 * @throws ArithmeticException if b is equal to 0.<p>
	 * {@code
	 * 		 List list = new ArrayList<>();
	 * 		for(int i =0;i<10;i++){
	 * 			list.add(i);
	 * }
	 * 			}
	 * 
	 */
	public int div(int a, int b) {
		if(b == 0) {
			throw new ArithmeticException();
		}
//		System.out.println("This quotient is: " + a/ b);
		return (a/b);
	}
	/**
	 * 
	 * @param a This is first integer
	 * @param b This is second integer
	 * @return (a+b) This is the addition of a and b
	 */
	public int add(int a, int b) {
		return (a+b);
	}
	/**
	 * 
	 * @param i  is a first number
	 * @param j  is a Second number
	 * @return c  is remainder.
	 */
	public double remainder(double i, double j) {
		double c;
		c = i%j;
		return (c);
	}
	/**
	 * @param args This is a main method
	 */
	public static void main(String[] args) {
//		System.out.println("This is from main method");
	}

}
