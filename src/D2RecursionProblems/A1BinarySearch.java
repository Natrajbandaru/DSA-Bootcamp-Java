package D2RecursionProblems;

public class A1BinarySearch {
	
	public static void binarysearch(int arr[],int target,int low,int high) {
		 
		int mid=(low+high)/2;
		if(low>=high) {
			System.out.println("-1");
			return;
		}
		if(arr[mid]==target) {
			System.out.println(mid);
			return;
		} 

		if(arr[mid]<target) {
			binarysearch(arr,target,mid+1,high);
		}else if(arr[mid]>target) {
			binarysearch(arr,target,low,mid-1);
		}

		 
		 
	}
	
	public static void main(String[] args) {
		int[] arr= {2,4,6,7};
		binarysearch(arr,8,0,arr.length);
	}

}
