package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {

	public static void main(String[] args) {
		int[][] arr=new int[3][3];
		Scanner sc=new Scanner(System.in);
		
		
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
				arr[row][col]=sc.nextInt();
			}
		}
		
		for(int row=0;row<arr.length;row++) {
			for(int col=0;col<arr[row].length;col++) {
			     System.out.print(arr[row][0]+" ");
			}
			System.out.println(" ");
		}

	}

}
