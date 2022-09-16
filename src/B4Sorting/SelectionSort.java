package B4Sorting;

import java.util.Arrays;

public class SelectionSort {

public static int  maxnumber(int[] arr,int low,int high) {
		
		int max=arr[0];
		int index=0;
		for(int i=low;i<=high;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		for(int i=low;i<=high;i++) {
			if(arr[i]==max) {
				index=i;
				break;
			}
		}
		return index;
	}
	
	public static void selectionsort(int[] arr) {
		int low=0,high=1;
		for(int i=0;i<arr.length;i++) {
			 
				low=0; 
				high=arr.length-i-1;
				 
				int maxnumberindex = maxnumber(arr,low,high);
				int lownumindex= arr.length-i-1;
				 
			 
				int temp=arr[maxnumberindex];
				arr[maxnumberindex]=arr[lownumindex];
				arr[lownumindex]=temp;
			}
	 
		System.out.println(Arrays.toString(arr));
	}
	
    public static void main(String[] args) {
	int[] arr= {1,0,77,5,56,23};
	 selectionsort(arr);
  }

}
