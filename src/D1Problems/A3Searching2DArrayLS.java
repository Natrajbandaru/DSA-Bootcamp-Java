package D1Problems;

public class A3Searching2DArrayLS {
	
	 public static boolean searchMatrix(int[][] matrix, int target) {
	        int k=0;
	        
	        for(int i=0;i<matrix.length;i++){
	            for(int j=0;j<matrix[i].length;j++){
	            	 
	                if(matrix[i][j]==target){
	                	 
	                    k=1;
	                    break;
	                }
	                else{
	                    k=0;
	                }
	            }
	            if(k==1){
		             break;
		        }
		       
	        }
	        if(k==1){
	            return true;
	        }
	       else{
	           return false;
	       }
	    }

	public static void main(String[] args) {
		 
		int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		boolean searchMatrix = searchMatrix(arr,6);
		System.out.println(searchMatrix);
	}

}
