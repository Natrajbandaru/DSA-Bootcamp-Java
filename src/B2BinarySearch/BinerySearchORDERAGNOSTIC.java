package B2BinarySearch;

public class BinerySearchORDERAGNOSTIC {
	
	public static void Oderegnosticbinarysearch(int[] arr,int target) {
		int low=0,high=arr.length-1;
		boolean asic=false;
		int ans=0;
		if(arr[low]<arr[high]) {
			asic=true;
		}
		while(low<=high) {
			int mid=low+(high-low)/2;
			
			if(target==arr[mid]) {
				ans=mid;
			}
			
			if(asic) {
				if(target<arr[mid]) {
					high=mid-1;
				}
				else {
					low=mid+1;
				}
			}
			else {
				if(target>arr[mid]) {
					high=mid-1;
				}
				else {
					low=mid+1;
				}
			}
		}
		System.out.println(ans);
	}
	public static void main(String[] args) {
		
		//int[] as= {2,5,67,89,90};
		int[] as= {90,89,60,30};
		
		Oderegnosticbinarysearch(as,60);
		
	}

}
