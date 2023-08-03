package Logical_Exercise_12;

public class Print_Patterns_12_4 {
	public static void main(String[] args) {
	int size = 6;
	
	//================(a)==================================
			System.out.println("=================(a)=====================");
			for(int row =size;row >= 1;row--) {
				for(int col = 1;col < 2*size;col++) {
					System.out.print((row + col >= size + 1) && (row >= col - size + 1)? "# " :"  ");
				}
				System.out.println();
			}
	
	//================(b)==================================
			System.out.println("=================(b)=====================");
			for(int row =1;row <= size;row++) {
				for(int col = 1;col < 2*size;col++) {
					System.out.print((row + col >= size + 1) && (row >= col - size + 1)? "# " :"  ");
				}
				System.out.println();
			}
	// ================(c)==================================
			System.out.println("=================(c)=====================");
			for(int row =0;row <= size;row++) {
				for(int col = 1;col < 2*size;col++) {
					System.out.print((row + col >= size + 1) && (row >= col - size + 1)? "# " :"  ");
				}
				System.out.println();
			}
			for(int row =size-1;row >= 1;row--) {
				for(int col = 1;col < 2*size-1;col++) {
					System.out.print((row + col >= size + 1) && (row >= col - size + 1)? "# " :"  ");
				}
				System.out.println();
			}
			size =8;
	// ================(d)===================================
			System.out.println("=================(d)=====================");
			for(int row =1;row<=size;row++) {
				for(int col =1;col<=row;col++) {
					System.out.print(col + " ");
				}
				System.out.println();
			}
	// ================(e)===================================
			System.out.println("=================(e)=====================");
			for(int row =1;row<=size;row++) {
				for(int col=1;col<=size;col++) {
					System.out.print(col>=row? col-row+1 + " ":"  ");
				}
				System.out.println();
			}
			
	// ================(f)===================================
			System.out.println("=================(f)=====================");
			for(int row =1;row<=size;row++) {
				for(int col=size;col>=1;col--) {
					System.out.print(row>=col? col + " ":"  ");
				}
				System.out.println();
			}
	// ================(g)===================================
			System.out.println("=================(g)=====================");
			for(int row =size;row>=1;row--) {
				for(int col=row;col>=1;col--) {
					System.out.print(col + " ");
				}
				System.out.println();
			}
	// ================(h)===================================
			System.out.println("=================(h)=====================");
			for(int row =1;row <= size;row++) {
				for(int col = 1;col <=size;col++) {
					System.out.print((row + col >= size + 1) && (row >= col - size + 1)? row+col-size+ " " :"  ");
				}
				for(int col = size+1;col <=2*size;col++) {
					System.out.print((row + col >= size + 1) && (row >= col - size + 1)? size+row-col+ " " :"  ");
				}
				System.out.println();
			}
	// ================(i)===================================
			System.out.println("=================(i)=====================");
			for(int row =size;row >= 1;row--) {
				for(int col = 1;col <=size;col++) {
					System.out.print((row + col >= size + 1) && (row >= col - size + 1)? row+col-size+ " " :"  ");
				}
				for(int col = size+1;col <=2*size;col++) {
					System.out.print((row + col >= size + 1) && (row >= col - size + 1)? size+row-col+ " " :"  ");
				}
				System.out.println();
			}
	// ================(j)===================================
			System.out.println("=================(j)=====================");
			for(int row =1;row <= size;row++) {
				for(int col = 1;col <=size;col++) {
					System.out.print(col<=row? col + " ": "  ");
				}
				
				for(int col = size+1;col <2*size;col++) {
					System.out.print(col>=2*size-row?2*size-col+" ": "  ");
				}
				System.out.println();
			}
	// ================(k)===================================
			System.out.println("=================(k)=====================");
			for(int row =size;row >= 1;row--) {
				for(int col = 1;col <=size;col++) {
					System.out.print(col<=row? col + " ": "  ");
				}
				for(int col = size+1;col <2*size;col++) {
					System.out.print(col>=2*size-row?2*size-col+" ": "  ");
				}
				System.out.println();
			}
   // ================(l)===================================
			System.out.println("=================(l)=====================");
			int countL=0;
			int countR=0;
			for(int row =1;row <= size;row++) {
				countL = row;
				for(int col = size;col >=1;col--) {
					System.out.print(col<=row?  countL++ +" ": "  ");
					countL = countL > 9 ? 0 : countL;
				}
				int count = countR;
				for(int col = size+1;col <2*size;col++) {
					count = count>9?0:count;
					countR = countR>9?0:countR;
					System.out.print(row>=col-size+1? count-- +" ": "  ");
					count = count == -1? 9:count;
				}
				System.out.println();
				countR +=2;
			}
			
	}
}
