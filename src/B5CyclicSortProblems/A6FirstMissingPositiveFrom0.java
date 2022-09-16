package B5CyclicSortProblems;
import java.util.*;
public class A6FirstMissingPositiveFrom0 {
	//Input arr1=[3,4,-1,1] and arr2=[1,2,0]
	
	public static int firstmissingpositive0(int[] arr) {
		
		int i=0;
		while(i<arr.length) {
		 
			int rightindex=arr[i]-1;
			if(arr[i]>0 && arr[i] != arr[rightindex]) {
				swap(arr,i,rightindex);
			}
			else {
				i++;
			}
			
		}
		System.out.println(Arrays.toString(arr));
		for(int index=0;index<arr.length;index++) {
			if(arr[index]!= index+1) {
				return index+1;   
			}
		}
		return -1;
	}
	private static void swap(int[] arr, int i, int rightindex) {
		int temp=arr[i];
		arr[i]=arr[rightindex];
		arr[rightindex]=temp;
	}
	public static void main(String[] args) {
		 int[] arr= {1,2,0};
		 
		 System.out.println(firstmissingpositive0(arr));
	}

}
