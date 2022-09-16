package B3BinerySearchProblems;

public class P5PeekElementOfIncresingDecresing {
	public static int binerysearch(int[] arr) {
		int low=0,high=arr.length-1;
		int ans=0;
		 
		while(low<=high) {
			int mid=low+(high-low)/2;
		//	System.out.println(mid);
			if(low==high) {
				ans=low;
				break;
			}
			if(arr[mid]<arr[mid+1]) {
				low=mid+1;
			}
			else if(arr[mid]>arr[mid+1]) {
				high=mid;
			}
			
		}
  
		return ans;
	}
	public static void main(String[] args) {
		int[] arr= {2,3,5,6,7,8,9,1,0};
		System.out.println(binerysearch(arr));
	}
}
