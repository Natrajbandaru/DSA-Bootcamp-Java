package B5CyclicSortProblems;

import java.util.Arrays;

public class A3DublicateIndex {
    public static int cyclicSort(int[] arr) {
		
		int i=0;
		while(i<arr.length) {
		   if(i+1 != arr[i]) {
			    int correctindex=arr[i]-1;
				int index=arr[i];
				if( index != arr[correctindex]) {
					swap(arr,i,correctindex);
				}
				else {
			//		System.out.println(arr[i]);
					return arr[i];
					//i++;
				}
		   }
		   else {
			   i++;
		   }
			 
		}
	     System.out.println(Arrays.toString(arr));
		return 1;
	}
    
    private static void  swap(int[] arr, int i, int correctindex) {
		 int temp=arr[i];
		 arr[i]=arr[correctindex];
		 arr[correctindex]=temp;
		
		 
	}


	public static void main(String[] args) {
	//	int[] arr= {3,0,1};
		int[] arr= {3,1,2,4,2};
	//	int[] arr= {4,1,2,7,8,2,7,1};
		System.out.println(cyclicSort(arr));

	}

}
