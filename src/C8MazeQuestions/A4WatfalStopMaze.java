package C8MazeQuestions;

public class A4WatfalStopMaze {
	//Q 114
	 public static void pathRestrections(String p,boolean[][] maze,int r ,int c) {
		 
		 if(r==maze.length-1 && c==maze[0].length-1) {
		//if(r==2 && c==2) {
			 System.out.println(p);
			 return;
		 }
		 
		 if(!maze[r][c]) {
			 return;
		 }
		 
		 if(r<maze.length-1) {
			 pathRestrections(p+"D",maze,r+1,c);
		 }
		 if(c<maze[0].length-1) {
			 pathRestrections(p+"R",maze,r,c+1);
		 }
	 }

	//*************************** 
 public static void pathRestrecti(String p,boolean[][] maze,int r ,int c) {
		 
		 if(r==2 && c==2) {//where to stop
		//if(r==2 && c==2) {
			 System.out.println(p);
			 return;
		 }
		 
		 if(!maze[r][c]) {// Condition for not execute
			 return;
		 }
		 
		 if(r<2) {
			 pathRestrections(p+"D",maze,r+1,c);
		 }
		 if(c<2) {
			 pathRestrections(p+"R",maze,r,c+1);
		 }
	 }

	 

	public static void main(String[] args) {
		
		boolean[][] board={ 
				{true, true, true},
				{true, false, true},
				{true, true, true},
		};
		pathRestrections("", board, 0, 0);
	}

}
