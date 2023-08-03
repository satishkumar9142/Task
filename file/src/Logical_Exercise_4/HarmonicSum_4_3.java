package Logical_Exercise_4;

public class HarmonicSum_4_3 {
	public static void main(String[] args) {
		final int MAX_DENOMINATOR = 50000;  // Use a more meaningful name instead of n
	    double sumL2R = 0.0;         // Sum from left-to-right
	    double sumR2L = 0.0;         // Sum from right-to-left
	    double absDiff;              // Absolute difference between the two sums
	   
	    for (int denominator = 1; denominator <= MAX_DENOMINATOR; ++denominator) {
	        sumL2R += (double)1/denominator;
	        sumR2L += (double)1/(MAX_DENOMINATOR-denominator+1);
	      } 
	    System.out.println(sumL2R);
	    System.out.println(sumR2L);
	    absDiff = sumL2R>sumR2L ? sumL2R-sumR2L : sumR2L - sumL2R;
	    System.out.println(absDiff);

	}
}
