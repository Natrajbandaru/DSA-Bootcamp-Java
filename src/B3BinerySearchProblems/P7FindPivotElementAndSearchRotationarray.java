package B3BinerySearchProblems;

public class P7FindPivotElementAndSearchRotationarray {
	
	 public static int search(int[] nums, int target) {
		 
		  int pivot=findpivot(nums);
		  int low=0,high=pivot;
		  
		 int binerysearch = binerysearch(nums,target,low,high);
		 if(binerysearch==-1) {
			 low=pivot+1;
			 high=nums.length-1;
			 int binerysearch1 = binerysearch(nums,target,low,high);
			 return binerysearch1;
		 }
		 else {
			 return binerysearch;
		 }
	        
	 }
	 public static int binerysearch(int[] nums,int target,int low,int high ) {
		 
		 
			while(low<=high) {
				int mid=(low+high)/2;
			 
	 
				if(target<nums[mid]) {
					high=mid-1;
				}
				else if(target>nums[mid]) {
					low=mid+1;
				}
				else {
					 return mid;
				}
			}
			return -1;
		   
	   }
	

	public static int findpivot(int[] arr) {
		
		int low=0,high=arr.length-1;
		
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(mid<high && arr[mid]>arr[mid+1]  ) {
				 
				return mid;
			}
			if(mid>low && arr[mid]<arr[mid-1]) {
				 
				return mid-1;
			}
			if(arr[low]<arr[mid]) {
				low=mid+1;
			}
			else if(arr[low]>arr[mid]){	 
				high=mid-1;
			}
			
		}
		return -1;
	}
 
	
	public static void main(String[] args) {
		
      int[] arr= {2,3,5,8,9,1};
	//	int[] arr= {9,10,11,12,15,3,4,5,6,7,8};
	//	int[] arr= {5,1,3};
	//	int[] arr= {1,0,1,1,1};
		int findpivot = search(arr,2);
		System.out.println(findpivot);
	}
	
	
}
