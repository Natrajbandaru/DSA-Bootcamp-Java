package divideingAndRemander;

public class binary {
	
	public static int binarysearch(int arr[], int n, int k) {
	        int low=0, high=n-1;
	        int mid=(low+high)/2;
	        
	            for(low=0;low<=high;low++){
	            	System.out.println("M");
	               if(k<arr[mid]){
	            	   if(arr[mid]==k) {
	            		   return mid;
	            	   }
	                   high=mid-1;
	               }
	               else{
	            	   if(arr[mid]==k) {
	            		   return mid;
	            	   }
	                   low=mid+1;
	               }
	            }
	        
	         return mid;
	    }
	
	public static void main(String[] args) {
		int[] n= {2,5,7,8};
		
		System.out.println(binarysearch(n,n.length,7));
	}

}
