package D1Problems;

import java.util.Arrays;

public class A31Searching2DArrayBS {
	
	public static boolean binerysearch(int[] arr,int target) {
		int low=0,high=arr.length-1;
		int indecation=0;
		while(low<=high) {
			int mid=(low+high)/2;
			if(target<arr[mid]) {
				high=mid-1;
			}
			else if(target>arr[mid]) {
				low=mid+1;
			}
			else {
				indecation=1;
				break;
			}
		}
		if(indecation==1) {
			return true;
		}
		else {
			return false;
		}
	}
	
	 public static boolean searchMatrix(int[][] matrix, int target) {
         int indication=0;
		 for(int i=0;i<matrix.length;i++) {
			 boolean binerysearch = binerysearch(matrix[i],target);
			 if(binerysearch==true) {
				  indication=1;
				 break;
			 }
            else{
                indication=0;
            }
		 }
       if(indication==1){
           return true;
       }
       else{
           return false;
       }
   }
	
	 public static void main(String[] args) {
		 
		 int[][] arr= {{1,2,3},{4,5,6},{7,8,9}};
		 boolean searchMatrix = searchMatrix(arr,10);
		 System.out.println(searchMatrix);
		 
	 }

}
