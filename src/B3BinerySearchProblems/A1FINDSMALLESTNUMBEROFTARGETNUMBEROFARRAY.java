package B3BinerySearchProblems;

public class A1FINDSMALLESTNUMBEROFTARGETNUMBEROFARRAY {
	
	public static int binerysearch(int[] arr,int target) {
		int low=0,high=arr.length-1;
	 
		while(low<=high) {
			int mid=low+(high-low)/2;
		 
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
		return low;
		
	}
	
	public static void main(String[] args) {
		
		//int[] arr= {2,4,5,10,15,20};
		int[] arr= {2,3,5,9,14,16,18};
		int target=17;
		int binerysearch = binerysearch(arr,target);
		 
		System.out.println(binerysearch);
	}

}
