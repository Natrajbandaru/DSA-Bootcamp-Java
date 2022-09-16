package B3BinerySearchProblems;

public class P3StartEndLimitOfTarget {
   public static int search(int[] arr,int target,boolean istruesmall) {
	   
	   int low=0,high=arr.length-1;
		 int ans=-1;
		while(low<=high) {
			int mid=(low+high)/2;
 
			if(target<arr[mid]) {
				high=mid-1;
			}
			else if(target>arr[mid]) {
				low=mid+1;
			}
			else {
				 ans=mid;
				 if(istruesmall) {
					 high=mid-1;
				 }
				 else {
					 low=mid+1;
				 }
			}
		}
		return ans;
	   
   }
	
	
	public static void main(String[] args) {
		
		int[] arr= {5,7,7,7,7,8,8,10};
		int target=7;
		int small = search(arr,target,true);
		int end = search(arr,target,false);
		System.out.println(small);
		System.out.println(end);
		
	}

}
