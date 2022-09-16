package C8MazeQuestions;

public class B2MazeBacktrackingExecuting {

public static void mazeAllSides(String process,boolean[][] maze,int r,int c) {
		
		if(r==maze.length-1 && c==maze[0].length-1) {
			System.out.println(process);
			return;
		}
		
		if(!maze[r][c]) {
			return;
		}
		
		maze[r][c]=false;
		
		if(r<maze.length-1) {
			mazeAllSides(process+"D", maze, r+1, c);
		}
		
		if(c<maze[0].length-1) {
			mazeAllSides(process+"R", maze, r, c+1);
		}
		if(r>0) {
			mazeAllSides(process+"U", maze, r-1, c);
		}
		if(c>0) {
			mazeAllSides(process+"L", maze, r, c-1);
		}
		
		 
		maze[r][c]=true;
		
	}

	public static void main(String[] args) {
		boolean[][] maze= {{true,true,true},
				{true,true,true},
				{true,true,true}
		}; 
		
		mazeAllSides("",maze,0,0);
      
	}

}
