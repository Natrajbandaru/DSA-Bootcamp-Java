package B5CyclicSortProblems;

public class A1MissingNumberUseingCyclic {
	
	public static int cyclicsort(int[] arr) {
		int i=0;
		while(i<arr.length) {
			int correctindex =arr[i];
			if(arr[i]<arr.length && arr[i] != arr[correctindex]) {
				swap(arr,i,correctindex);
			}else {
				i++;
			}
		}
		
		for(int j=0;j<arr.length;j++) {
			if(arr[j]!=j) {
				return j;
			}
		}
		return -1;
	}
	
	private static void swap(int[] arr, int i, int correctindex) {
		
		 int temp=arr[i];
		 arr[i]=arr[correctindex];
		 arr[correctindex]=temp;
	}

	public static void main(String[] args) {
		//int[] arr= {4,3,2,7,8,2,3,1,0};
		int[] arr= {0,1,2,4};
		System.out.println(cyclicsort(arr));
		
	}

}
