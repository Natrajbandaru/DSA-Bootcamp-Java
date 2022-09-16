package B5CyclicSortProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class A2MissingNumbersUseingCyclic {
	
	public static void missinginTow(int[] arr) {
		int[] ans=new int[2];
		int i=0;
		while(i<arr.length) {
		    int rightindex=arr[i]-1;
		    int index=arr[rightindex];
		    
		    if(arr[rightindex] != arr[i] ) {
		    	
		    	swap(arr,i,rightindex);
		    }
		    else {
		    	i++;
		    }
		}
		System.out.println(Arrays.toString(arr));
//		int c=0;
//		for(int j=0;j<arr.length;j++) {
//			if(arr[j] != j+1) {
//				 System.out.println(j+1);
//			}
//		}
		
		List<Integer> ans1=new ArrayList<>();
		for(int index=0;index<arr.length;index++) {
			if(arr[index] != index+1) {
				ans1.add(index+1);
			}
			
		}
		
		
	//	System.out.println(ans1);
		
	}
	private static void swap(int[] arr, int i, int correctindex) {
		
		 int temp=arr[i];
		 arr[i]=arr[correctindex];
		 arr[correctindex]=temp;
		 System.out.println(Arrays.toString(arr));
	}
	
	public static void main(String[] args) {
		int[] arr= {4,3,2,7,8,2,3,1};
		missinginTow(arr);
		
		
	}
}
