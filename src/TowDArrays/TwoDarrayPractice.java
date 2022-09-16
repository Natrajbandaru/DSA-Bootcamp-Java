package TowDArrays;
import java.util.*;
public class TwoDarrayPractice {

	public static void main(String[] args) {
		int[][] arr1=new int[3][4];
		System.out.println(arr1.length);
		Scanner in=new Scanner(System.in);
		
		
		int[][] arr=new int[3][2];
		//inserting values in array
		//Row loop 
		//INPUT
		for(int row=0;row<arr.length;row++) {
			//For Each Coloum in Every Row	
			for(int col=0;col<arr[row].length;col++) {
				arr[row][col]=in.nextInt();
			}
		}
		
		//OUT PUT
		for(int row=0;row<arr.length;row++) {
			//For Each Coloum in Every Row	
			for(int col=0;col<arr[row].length;col++) {
				System.out.print(arr[row][col]+" ");
			}
			System.out.println(" ");
		}
		//OUT PUT
		for(int row=0;row<arr.length;row++) {
		System.out.println(Arrays.toString(arr[row]));
		}
	}
}
