package B4Sorting;

import java.util.Arrays;

public class BubbolSort {
	
	public static void bubbolsort(int[] arr) {
		 
		for(int i=0;i<arr.length;i++) {
			for(int j=1;j<arr.length-i;j++) {
				if(arr[j]<arr[j-1]) {
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
					 
				}
			}
			 
		}
		
		System.out.println(Arrays.toString(arr));
	}
	
	
	public static void main(String[] args) {
		
		int[] a= {7,6,2,5};
		bubbolsort(a);
	}

}
