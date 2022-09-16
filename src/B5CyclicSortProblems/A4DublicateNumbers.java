package B5CyclicSortProblems;
import java.util.*;
public class A4DublicateNumbers {
	
	public static void dublicateNumbers(int[] arr) {
		
		int i=0;
		while(i<arr.length) {
 			int rightindex =arr[i]-1;
 			if(arr[i] != arr[rightindex]) {
				swap(arr,i,rightindex);
			}
			else {
				i++;
			}
		}
		System.out.println(Arrays.toString(arr));
		List<Integer> list=new ArrayList<Integer>();
		for(int index=0;index<arr.length;index++) {
			if(arr[index] != index+1) {
			//	System.out.println(arr[index]);
				list.add(arr[index]);
			}
 		}
 		System.out.println(list);
	}
	
	private static void swap(int[] arr, int i, int rightindex) {
		int temp=arr[i];
		arr[i]=arr[rightindex];
		arr[rightindex]=temp;
	}

	public static void main(String[] args) {
		int[] arr= {4,3,2,7,8,2,3,1};
	 		dublicateNumbers(arr);
	}

}
