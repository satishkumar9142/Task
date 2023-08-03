package Logical_Exercise_12;

public class Matrices_12_2 {
	
	public static void printInt(int[][] m) {
		for(int i =0;i<m.length;i++) {
			for(int j =0;j<m[0].length;j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void printDouble(double[][] m) {
		for(int i =0;i<m.length;i++) {
			for(int j =0;j<m[0].length;j++) {
				System.out.print(m[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static boolean haveSameDimensionInt(int[][] m1, int[][] m2) {
		int m1Row = m1.length;
		int m1Col = m1[0].length;
		int m2Row = m2.length;
		int m2Col = m2[0].length;
		return (m1Row==m2Row)&&(m1Col ==  m2Col);
	} 
	public static boolean haveSameDimensionDouble(double[][] m1, double[][] m2) {
		int m1Row = m1.length;
		int m1Col = m1[0].length;
		int m2Row = m2.length;
		int m2Col = m2[0].length;
		return (m1Row==m2Row)&&(m1Col ==  m2Col);
	}
	public static int[][] addInt(int[][] m1, int[][] m2){
		int [][] m3 = new int[m1.length][m1[0].length];
		if(haveSameDimensionInt(m1, m2)) {
			for(int i =0;i<m1.length;i++) {
				for(int j =0;j<m1[0].length;j++) {
					m3[i][j] = m1[i][j] + m2[i][j];
				}
			}
		}
		return m3;
		
	}
	public static double[][] addDouble(double[][] m1, double[][] m2){
		double [][] m3 = new double[m1.length][m1[0].length];
		if(haveSameDimensionDouble(m1, m2)) {
			for(int i =0;i<m1.length;i++) {
				for(int j =0;j<m1[0].length;j++) {
					m3[i][j] = m1[i][j] + m2[i][j];
				}
			}
		}
		return m3;
	}
	public static int[][] subtractInt(int[][] m1, int[][] m2){
		int [][] m3 = new int[m1.length][m1[0].length];
		if(haveSameDimensionInt(m1, m2)) {
			for(int i =0;i<m1.length;i++) {
				for(int j =0;j<m1[0].length;j++) {
					m3[i][j] = m1[i][j] - m2[i][j];
				}
			}
		}
		return m3;
	}
	public static double[][] subtractDouble(double[][] m1, double[][] m2){
		double [][] m3 = new double[m1.length][m1[0].length];
		if(haveSameDimensionDouble(m1, m2)) {
			for(int i =0;i<m1.length;i++) {
				for(int j =0;j<m1[0].length;j++) {
					m3[i][j] = m1[i][j] - m2[i][j];
				}
			}
		}
		return m3;
	}
	public static int[][] multiplyInt(int[][] m1, int[][] m2){
		int [][] m3 = new int[m1.length][m1[0].length];
		if(haveSameDimensionInt(m1, m2)) {
			for(int i =0;i<m1.length;i++) {
				for(int j =0;j<m1[0].length;j++) {
					m3[i][j] = m1[i][j] * m2[i][j];
				}
			}
		}
		return m3;
	}
	public static double[][] multiplyDouble(double[][] m1, double[][] m2){
		double [][] m3 = new double[m1.length][m1[0].length];
		if(haveSameDimensionDouble(m1, m2)) {
			for(int i =0;i<m1.length;i++) {
				for(int j =0;j<m1[0].length;j++) {
					m3[i][j] = m1[i][j] * m2[i][j];
				}
			}
		}
		return m3;
	}
	public static void main(String[] args) {
		int [][] m1 = {{1,2,3},{4,5,6},{7,8,9}};
		int [][] m2 = {{1,2,3},{4,5,6},{7,8,9}};
		double [][] dm1 = {{1.0,2.0,3.0},{4.0,5.0,6.0},{7.0,8.0,9.0}};
		double [][] dm2 = {{1.0,2.0,3.0},{4.0,5.0,6.0},{7.0,8.0,9.0}};
		printInt(m1);
	//	printInt(m2);
		printDouble(dm1);
	//	printDouble(dm2);
		System.out.println("HaveSame Dimension of Int matrix : " +haveSameDimensionInt(m1, m2));
		System.out.println("HaveSame Dimension of Double matrix : " +haveSameDimensionDouble(dm1, dm2));
		
		System.out.println("===========print Intadd================");
		int [][] intadd = addInt(m1, m2);
		printInt(intadd);
		System.out.println("===========print Doubleadd===============");
		double [][] DOubleadd = addDouble(dm1, dm2);
		printDouble(DOubleadd);
		System.out.println("==========print Intsubtract================");
		int [][] intsubtract = subtractInt(m1, m2);
		printInt(intsubtract);
		System.out.println("===========print Doubleadd================");
		double [][] DOubleSubtract = subtractDouble(dm1, dm2);
		printDouble(DOubleSubtract);
		System.out.println("===========print IntMultiply================");
		int [][] intMultiply = multiplyInt(m1, m2);
		printInt(intMultiply);
		System.out.println("===========print DoubleMultiply================");
		double [][] DOubleMultiply = multiplyDouble(dm1, dm2);
		printDouble(DOubleMultiply);
	}
}
