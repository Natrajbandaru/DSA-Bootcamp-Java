package B2BinarySearch;

public class BinarySearchDesendingORDER {
	public static int desending(int[] arr,int target) {
		int low=0,high=arr.length-1;
		 int ans=-1;
		while(low<=high) {
			int mid=(low+high)/2;
		 
			if(arr[mid]<target) {
				low=mid+1;
			}
			else if(arr[mid]<target) {
				high=mid-1;
			}
			else {
				ans=mid;
				break;
			}
		}
		return ans;
	}

	public static void main(String[] args) {
		int[] arr= {18,20,21,30,36};
		int target=36;
		int binerysearch = desending(arr,target);
		System.out.println(binerysearch);
	}

}
