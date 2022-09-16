package Practice;
import java.util.*;
public class sorting {
	
	public static void swap(int[] arr,int i,int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	public static void bubbolsort(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length-i;j++) {
				
				if(arr[j]<arr[j-1]) {
					swap(arr,j,j-1); 
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}
 

	public static void main(String[] args) {
		  int[] arr= {7,6,2,5};
		  bubbolsort(arr);
		 
	  }
}
