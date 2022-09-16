package B2BinarySearch;

public class BinarySearchACENDINGORDERUseingForloop {
	
	 public static int binerysearch(int[] arr,int target ) {
		   
		   int low=0,high=arr.length-1;
			 
			while(low<=high) {
				int mid=(low+high)/2;
			 
	 
				if(target<arr[mid]) {
					high=mid-1;
				}
				else if(target>arr[mid]) {
					low=mid+1;
				}
				else {
					 return mid;
				}
			}
			return -1;
		   
	   }
	
	public static void main(String[] args) {
		
		int[] arr= {2,4,6,7,9,10};
		int target=10;
		int binerysearch = binerysearch(arr,target);
		System.out.println(binerysearch);
	}

}
