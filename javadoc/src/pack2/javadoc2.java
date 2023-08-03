package pack2;
/**
 * 
 * This is a class
 *
 */
public class javadoc2 {
	/**
	 *  @param args These are arguments supplied to the command line
	 * 
	 */
	public static void main(String[] args) {
		System.out.println("I am main method");
	} 
	/**
	 * Hello this is a method
	 * @param i  This is the first number to add
	 * @param j  this is the second number to add
	 * @return Sum of two numbers as an integer
	 * @throws Exception if i is 0
	 * @deprecated This method is deprecated please use + Operator
	 */
	public int add(int i, int j) throws Exception {
		if(i == 0) {
			throw new Exception();
		}
		int c =0;
		c = i+j;
		return c;
	}
}
