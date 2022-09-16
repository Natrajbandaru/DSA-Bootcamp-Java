package C4QuckSort;

import java.util.Arrays;

public class QuckSort {
	//After first itteration
	       // low     end   p  start      high
	       //  3   2   1    4   5      7   6
	public static void quicksort(int[] arr,int low,int high) {
		
		
		if(low>=high) {
			return;
		}
		
		
		int start=low;
		int end=high;
		int mid=(low+high)/2;
		int pivot=arr[mid];
		
		while(start<=end) {
			
			while(arr[start]<pivot) {
				start++;
			}
			while(arr[end]>pivot) {
				end--;
			}
		//	if(!(arr[start]<pivot && arr[end]>pivot)) {
			if(start<=end) {
				int temp=arr[start];
				arr[start]=arr[end];
				arr[end]=temp;
				
				start++;
				end--;
			}	
		}
		//no=w pivot is correct index sort two halfs
		quicksort(arr,low,end);
		quicksort(arr,start,high);
		
	}
	
	public static void main(String[] args) {
	  
		int[] arr= {5,4,6,2,1};
		quicksort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
		
	}

}
