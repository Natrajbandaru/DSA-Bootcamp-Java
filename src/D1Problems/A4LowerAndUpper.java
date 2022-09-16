package D1Problems;

public class A4LowerAndUpper {
	
	public static int Binarysearch(int[] arr,int target) {
		int low=0, high=arr.length-1;
		int lower=0,higher=0,ans=0;
	 
		
		while(low<=high) {
			int mid=(low+high)/2;
			if(target<arr[mid]) {
				high=mid-1;
			}
			else if(target>arr[mid]) {
				low=mid+1;
			}
			else {
				 return high;
			}
		}
		return low;
	}

	public static void main(String[] args) {
		 
	int[] arr= {1,1,4,5,5,9};
	System.out.println(Binarysearch(arr,1));
	
	}

}
