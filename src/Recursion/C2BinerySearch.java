package Recursion;

public class C2BinerySearch {
	public static int search(int[] arr,int target,int l,int h) {
 		int mid=(l+h)/2;
		if(l>h) {
			return -1;
		}
		if(arr[mid]==target) {
			return mid;
		}
		if(arr[mid]>target) {
			 return search(arr,target,l,mid-1);
		}
		else {
			return search(arr,target,mid+1,h);
		}
	}

	public static void main(String[] args) {
		 int[] a= {1,3,4,88,99};
		 int target=3;
		System.out.println( search(a,target,0,a.length-1));

	}

}
