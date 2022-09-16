package C8MazeQuestions;

import java.util.Arrays;

public class B3PathsWithIndexArray {

	
	
public static void mazeAllSides(String process,boolean[][] maze,int[][] arr,int r,int c,int step) {
		arr[r][c]=step;
		if(r==maze.length-1 && c==maze[0].length-1) {
			System.out.println(process);
			for(int[] ar :arr ) {
				System.out.println(Arrays.toString(ar));
			}
			System.out.println();
			 
			return;
		}
		
		if(!maze[r][c]) {
			return;
		}
		arr[r][c]=step;
		maze[r][c]=false;
		
		if(r<maze.length-1) {
			mazeAllSides(process+"D", maze,arr, r+1, c,step+1);
		}
		
		if(c<maze[0].length-1) {
			mazeAllSides(process+"R", maze, arr, r, c+1,step+1);
		}
		if(r>0) {
			mazeAllSides(process+"U", maze, arr, r-1, c,step+1);
		}
		if(c>0) {
			mazeAllSides(process+"L", maze,arr, r, c-1,step+1);
		}
		
		 step=0;
		maze[r][c]=true;
		
	}

	public static void main(String[] args) {
		boolean[][] maze= {{true,true,true},
				{true,true,true},
				{true,true,true}
		}; 
		
		int[][] arr=new int[maze.length][maze[0].length];
		
		mazeAllSides("",maze,arr,0,0,0);
      
	}


}
