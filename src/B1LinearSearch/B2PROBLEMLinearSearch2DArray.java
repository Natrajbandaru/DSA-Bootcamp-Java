package B1LinearSearch;

import java.util.*;

public class B2PROBLEMLinearSearch2DArray {
	public static int[] lenerarsearch(int[][] arr,int target) {
		int[] index=new int[2];
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
			   if(arr[row][col]==target) {
				   index[0]=row+1;
				   index[1]=col+1;
				 //  return new int[] {row,col};
			   }
			}
		}
		if(index[0]==0) {
			 index[0]=-1;
			 index[1]=-1;
		}
		return index;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int[][] arr=new int[3][2];
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
		      	   arr[row][col]=sc.nextInt();
			}
		}
		
		int[] lenerarsearch = lenerarsearch(arr,8);
		for(int[] s:arr) {
			System.out.println(Arrays.toString(s));
		}
		System.out.println("The Answer is: "+Arrays.toString(lenerarsearch));
	}
}
