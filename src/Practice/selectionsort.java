package Practice;

import java.util.Arrays;

public class selectionsort {
	public static int intmaxnum(int[] arr,int low,int high) {
		int max=arr[0];
		int indexmax=0;
		for(int i=low;i<=high;i++) {
			if(arr[i]>max) {
				max=arr[i];
				indexmax= i;
			}
		}
		 return indexmax;
	}
	
	public static void selectionsort(int[] arr) {
		
		for(int i=0;i<arr.length;i++) {
		 
				int intmaxnum = intmaxnum(arr,0,arr.length-i-1);
				swap(arr,intmaxnum,arr.length-i-1);
		 
		}
		System.out.println(Arrays.toString(arr));
		
	}
	
	private static void swap(int[] arr, int i, int intmaxnum) {

		int temp=arr[i];
		arr[i]=arr[intmaxnum];
		arr[intmaxnum]=temp;
		
	}

	public static void main(String[] args) {
		  int[] arr= {7,2,8,5};
		  selectionsort(arr);
		 
	  }
}
