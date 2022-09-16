package C3MergeSort;

import java.util.Arrays;

public class MergeSort {
	
	public static int[] merge(int[] arr) {
		
		int mid=arr.length/2;
   		System.out.println(mid);
		System.out.println(arr.length+"L");
		 System.out.println(Arrays.toString(arr));
		if(arr.length==1) {
			return arr;
		}
		 int[] left = merge(Arrays.copyOfRange(arr, 0, mid));
		 System.out.println(Arrays.toString(left));
		 int[] right = merge(Arrays.copyOfRange(arr, mid, arr.length));
		 System.out.println(Arrays.toString(right));
		
		
		return sort(left,right);
	}

	private static int[] sort(int[] first, int[] secound) {
//		 System.out.println(Arrays.toString(first));
//		 System.out.println(Arrays.toString(secound));
		 int[] arr=new int[first.length+secound.length];
		 
		 int i=0;
		 int j=0;
		 int k=0;
		 while(i<first.length && j<secound.length) {
			 if(first[i]<secound[j]) {
				 arr[k]=first[i];
				 i++;
			 }else {
				 arr[k]=secound[j];
				 j++;
			 }
			 
			 k++;
		 }
		 //IF the array is not complited
		 //Copey the remaining array
 		 while(i<first.length) {
			 arr[k]=first[i];
			 i++;
			 k++;
		 }
		 while(j<secound.length) {
			 arr[k]=secound[j];
			 j++;
			 k++;
		 }
		return arr;
	}

	public static void main(String[] args) {
		 int[] arr= {5,4,3,2,1,8};
		 System.out.println(Arrays.toString(merge(arr)));

	}

}
