package D2RecursionProblems;

public class A2RotationBinarySearch {
	
	public static void binarysearch(int arr[],int target,int low,int high){
			
		int mid=(low+high)/2;
		if(arr[mid]==target) {
			System.out.println(mid);
			return ;
		}
		if(target < arr[mid]) {
			if(target<arr[mid]) {
				binarysearch(arr,target,low,mid-1);
			}else {
				binarysearch(arr,target,mid+1,high);
			}
		}
		else {
			if(target<arr[mid]) {
				binarysearch(arr,target,mid+1,high);
			}else {
				binarysearch(arr,target,low,mid-1);
			}
		}
		
	}

	public static void main(String[] args) {
		 
         int[] arr= {8,9,5,6,7};
         binarysearch(arr,9,0,arr.length);
	}

}
