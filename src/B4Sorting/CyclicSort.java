package B4Sorting;
import java.util.*;
public class CyclicSort {
	public static int cyclicSort(int[] arr) {
		
		int i=0;
		while(i<arr.length) {
			int correctindex=arr[i];
		//	System.out.println(correctindex);
			int index=arr[i];
			if(correctindex < arr.length-1 && index != arr[correctindex]) {
				swap(arr,correctindex,i);
			}
			else {
				i++;
			}
			
		}
		System.out.println(Arrays.toString(arr));
		 int ans=0;
//	     for(int z=0;z<arr.length;z++){
//	    	 System.out.println(z);
//	            int rightindex=arr[z];
//	             if(arr[rightindex]< arr.length-1 &&z != arr[rightindex]){
//	                  ans=rightindex;
//	             }
//	        
//	        } 
		// [0,1]
		for(int j=0;j<arr.length;j++) {
			if(arr[j] !=j) {
				return j;
			} 
		}
		return arr.length;
	}
	
	private static void  swap(int[] arr, int i, int correctindex) {
		 int temp=arr[i];
		 arr[i]=arr[correctindex];
		 arr[correctindex]=temp;
		
		// System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		int[] arr= {0,1};
		System.out.println( cyclicSort(arr));
		
	}

}
