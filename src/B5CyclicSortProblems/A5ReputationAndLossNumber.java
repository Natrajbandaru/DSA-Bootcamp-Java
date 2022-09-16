package B5CyclicSortProblems;import java.util.*;

public class A5ReputationAndLossNumber {
	
	public static void main(int[] arr) {
		int i=0;
		while(i<arr.length) {
			int rightindex=arr[i]-1;
			if(arr[i] != arr[rightindex]) {
				swap(arr,i,rightindex);
			}
			else {
				i++;
			}
		}
		List<Integer> list= new ArrayList<>();
		for(int index=0;index<arr.length;index++) {
			if(arr[index] != index+1) {
				list.add(index);
				list.add(arr[index]+1);
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
		int[] arr= {1,2,2,4};
		main(arr);
	}

}
