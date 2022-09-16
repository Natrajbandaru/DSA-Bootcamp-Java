package C8MazeQuestions;

public class A1CountRootsAtoB {
	
	//Q 111
	public static int roots(int row,int col) {
		
		if(row==1 || col==1) {
			return 1;
		}
		
        int left=roots(row-1,col);
        int right=roots(row,col-1);
        
        return left+right;
	}

	public static void main(String[] args) {
		
		System.out.println(roots(3,3));
	}
}
