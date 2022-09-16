package C3MergeSort;

import java.util.Arrays;

public class MergeSort2 {

	public static int[] dividemerge(int[] arr) {
		
		int mid=arr.length/2;
		
		if(arr.length==1) {
			return arr;
		}
		 
		int[] left = dividemerge(Arrays.copyOfRange(arr, 0, mid));
		int[] right = dividemerge(Arrays.copyOfRange(arr, mid, arr.length));
		
		return sortmerge(left,right);
		
	}
	
	private static int[] sortmerge(int[] first, int[] secound) {
       
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
	   int[] arr= {5,4,3,2,1};
	   
	   int[] dividemerge = dividemerge(arr);
	   System.out.println(Arrays.toString(dividemerge));
   
	}

}
