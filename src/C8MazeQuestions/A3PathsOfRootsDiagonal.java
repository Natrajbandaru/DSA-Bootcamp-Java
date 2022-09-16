package C8MazeQuestions;

public class A3PathsOfRootsDiagonal {
	//113)
	public static void diagonal(String p,int r, int c) {
		if(r==1 && c==1) {
			System.out.print(p);
			System.out.print("  ");
			return;
		}
		if(r>1 && c>1) {
			diagonal(p+"D",r-1,c-1);
			
		}
		if(r>1) {
			diagonal(p+"V",r-1,c);
			
		}
		if(c>1) {
			diagonal(p+"H",r,c-1);
			
		}
		
	}
	
	public static void main(String[] args) {
		diagonal("",3,3);
	}

}
