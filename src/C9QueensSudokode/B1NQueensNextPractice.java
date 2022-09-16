package C9QueensSudokode;

public class B1NQueensNextPractice {

	public static int nqueen(boolean[][] chess,int row) {
		if(row==chess.length) {
			print(chess);
			System.out.println();
		   return 1;
		}
		
		int count=0;
		for(int col=0;col<chess.length;col++) {
			if(istrue(chess,row,col)) {
				chess[row][col]=true;
				count= count+nqueen(chess,row+1);
				chess[row][col]=false;
			}			
		}
		return count;
	}
	
	private static boolean istrue(boolean[][] chess, int row, int col) {
		 
		for(int i=0;i<row; i++) {
			if(chess[i][col]) {
				return false;
			}
		}
		int diagonalleft=Math.min(row, col);
		for(int i=1;i<=diagonalleft;i++) {
			if(chess[row-i][col-i]) {
				return false;
			}
		}
		
		int diagonalright=Math.min(row, chess.length-col-1);
		for(int i=1;i<=diagonalright;i++) {
			if(chess[row-i][col+i]) {
				return false;
			}
		}
		
		return true;
	}

	 

	private static void print(boolean[][] chess) {
		 
		for(boolean[] i:chess) {
			for(boolean j:i) {
				if(j) {
					System.out.print("Q");
				}
				else {
					System.out.print("X");
				}
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		int n=4;
		boolean[][] board=new boolean[n][n];
		System.out.println(nqueen(board, 0));

	}

}
