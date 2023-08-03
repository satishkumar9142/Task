package Logical_Exercise_4;

public class SumAverageRunningInt4_1 {
	public static void main(String[] args) {
		final int LOWERBOUND =1;
		final int UPPERBOUND =100;
	//==============for loop ========================	
		int sum =0;
		for(int number =LOWERBOUND;number<=UPPERBOUND;number++) {
			sum += number;
		}
		double avg = (double)sum /UPPERBOUND;
		System.out.println(sum);
		System.out.println(avg);
		
	// =============while =========================
		int number = LOWERBOUND;
		int sumWhile = 0;
		
		while(number <= UPPERBOUND) {
			sumWhile += number;
			number++;
		}
		double avgWhile =(double)sumWhile/UPPERBOUND;
		System.out.println(sumWhile);
		System.out.println(avgWhile);
		
	// ============= do while ==========================
		
		number = LOWERBOUND;
		int sumdoWhile = 0;
		do {
			sumdoWhile += number;
			number++;
		}
		while(number <= UPPERBOUND) ;
		
		double avgdoWhile =(double)sumWhile/UPPERBOUND;
		System.out.println(sumdoWhile);
		System.out.println(avgdoWhile);
	//===============Recurssion =============================	
		int sumrecurssion = SUM(LOWERBOUND,0);
		double avgrecurssion = (double) sumrecurssion /UPPERBOUND;
		System.out.println(sumrecurssion);
		System.out.println(avgrecurssion);
		
		
	// ============ SUM OF EVEN, ODD AND ABSOLUTE DIFFERENCE BETWEEN THEM===========
		int sumOfOddNumber = 0;
		int sumOfEvenNumber =0 ;
		int absDiff;
		for(int num = LOWERBOUND;num<UPPERBOUND;num++) {
			if(num%2==0) sumOfEvenNumber += num;
			else sumOfOddNumber += num;
		}
		System.out.println(sumOfEvenNumber);
		System.out.println(sumOfOddNumber);
		absDiff = sumOfEvenNumber> sumOfOddNumber ? sumOfEvenNumber-sumOfOddNumber : sumOfOddNumber-sumOfEvenNumber;
		System.out.println(absDiff);
	}
//===============================================================
	public static int SUM(int a,int sum) {
		if(a == 101) {
			return sum;
		}
		sum += a;
		return SUM(a+1, sum);
	}
}
