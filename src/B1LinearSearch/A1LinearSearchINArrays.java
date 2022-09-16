package B1LinearSearch;

public class A1LinearSearchINArrays {
	
	public static int lennearSearch(int[] arr, int target) {
		 
		int ans=-1;
		if(arr.length==0) {
			return -2;
		}
		for(int index=0;index<arr.length;index++) {
		 
			int a=arr[index];
			if(a==target) {
	            ans= index;
			}
		}
		return ans;
	}
	
	
	public static void main(String[] atrgs) {
		
		int[] arr= {2,3,1,6,8,4,0};
		int lennearSearch = lennearSearch(arr,10);
		System.out.println(lennearSearch);
		
	}

}
