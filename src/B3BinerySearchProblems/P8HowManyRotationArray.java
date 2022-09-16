package B3BinerySearchProblems;

public class P8HowManyRotationArray {
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
			if(arr[low]<=arr[mid]) {
				low=mid+1;
			}
			else if(arr[low]>=arr[mid]){	 
				high=mid-1;
			}
			
		}
		return -1;
	}
     
     public static void main(String[] args) {
 		
          int[] arr= {9,2,3,5,8 };
    	//	int[] arr= {9,10,11,12,15,3,4,5,6,7,8};
    	//	int[] arr= {5,1,3};
    	//	int[] arr= {0};
    		int findpivot = findpivot(arr);
    		System.out.println(findpivot+1);
    	}
    	
}
