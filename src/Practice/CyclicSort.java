package Practice;

import java.util.Arrays;

public class CyclicSort {
	
	public static void cyclicsort(int[] arr) {
		
		int i=0;
		//int high=arr.length-1;
		
		while(i<arr.length-1) {
			int corectindex=arr[i]-1;
			int index=arr[i];
			
			if(index != arr[corectindex]) {
				swap(arr,corectindex,i);
			}else {
				i++;
			}
		}
//		int i=0;
//		while(i<arr.length-1) {
//			int correctindex=arr[i]-1;
//			int index=arr[i];
//			if( index != arr[correctindex]) {
//				swap(arr,correctindex,i);
//			}
//			else {
//				i++;
//			}
//			
//		}
		System.out.println(Arrays.toString(arr));
	}
	
//	 int i=0;
//     while(i<nums.length-1){
//         int correctindex=nums[i]-1;
//         int index=nums[i];
//         
//         if(index != nums[correctindex]){
//             int temp=nums[correctindex];
//             nums[correctindex]=nums[i];
//             nums[i]=temp;
//         }else{
//   
//                   i++;
//         }

	private static void  swap(int[] arr, int i, int correctindex) {
		 int temp=arr[i];
		 arr[i]=arr[correctindex];
		 arr[correctindex]=temp;
		
		// System.out.println(Arrays.toString(arr));
	}

	public static void main(String[] args) {
		 int[] arr= {2,1,3,4};
		 cyclicsort(arr);

	}

}
