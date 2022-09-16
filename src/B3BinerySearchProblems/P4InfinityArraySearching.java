package B3BinerySearchProblems;

public class P4InfinityArraySearching {
	
	public static int search(int[] arr,int target,int low,int high) {
		   
		  
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
		int[] arr= {2,5,6,18,20,22,34,55,56,78,90,93,94,96,98};
		int low=0,high=1;
		int target=78;
		while(target>arr[high]) {
			int temp=high+1;
			high=high+(high-low+1)*2;
			//System.out.println(high);
			low=temp;
		}
		
		int search = search(arr,target,low,high);
		System.out.println(search);
		   

	}

}
