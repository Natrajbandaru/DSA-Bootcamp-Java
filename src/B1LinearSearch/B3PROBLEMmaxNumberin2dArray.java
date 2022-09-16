package B1LinearSearch;

import java.util.Arrays;
import java.util.Scanner;

public class B3PROBLEMmaxNumberin2dArray {

	public static int MaximumNumber(int[][] arr) {
		int max=arr[0][0];
		int[] index=new int[2];
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
			   if(arr[row][col]>=max) {
				   max=arr[row][col];
			   }
			}
		}
		return max;
	}
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int[][] arr=new int[3][2];
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
		      	   arr[row][col]=sc.nextInt();
			}
		}
		
		int maximum = MaximumNumber(arr);
		for(int[] s:arr) {
			System.out.println(Arrays.toString(s));
		}
		System.out.println("The Answer is: "+maximum);
	}
}
