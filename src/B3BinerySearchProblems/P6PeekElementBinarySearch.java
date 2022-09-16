package B3BinerySearchProblems;

public class P6PeekElementBinarySearch {
	public static int binerysearch(int[] arr,int target,int low,int high) {
		 
		while(low<=high) {
			int mid=(low+high)/2;
		 	
			if(arr[mid]==target) {
				return mid;
			}
			
			if(target < arr[mid]) {
				high=mid-1;
			}
			else if(target > arr[mid]){
				low=mid+1;
			}
			if(target >arr[mid]) {
				high=mid-1;
			}
			else if(target < arr[mid]) {
				low=mid+1;
			}
		}
		
		return -1;
	}

	public static int peakelement(int[] arr) {	 
		int low=0,high=arr.length-1;
		while(low<=high) {
			int mid=(low+high)/2;
			if(low==high) {
				return mid;
			}	
			if(arr[mid]>arr[mid+1]) {
				high=mid;
			}
			else if(arr[mid]<arr[mid+1]) {
				low=mid+1;
				 
			}
		}
		return -1;
	}
	public static void main(String[] args) {
		int[] arr= {4,2,3,6,5,3,1};
		int peakelement = peakelement(arr);
        int target=3;
		int binerysearch = binerysearch(arr,target,0,peakelement);
		if(binerysearch==-1) {
			int binerysearch2 = binerysearch(arr,target,peakelement+1,arr.length-1);
			System.out.println(binerysearch2);
		}else {
			System.out.println(binerysearch);
		}
		

	}
}
