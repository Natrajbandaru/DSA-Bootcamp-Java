package Arrays;
import java.util.*;

public class reverseAarray {
	public static int[] reverse(int[] arr) {
		int low=0,high=arr.length-1;
		while(low<high) {
			int temp=arr[low];
			arr[low]=arr[high];
			arr[high]=temp;
			low++;
			high--;
		}
		//System.out.println(Arrays.toString(arr));
		return arr;
	}
	
	
	public static void main(String[] args) {
		
		int[] s= {2,4,6,1,9};
		int[] reverse = reverse(s);
		System.out.println(Arrays.toString(reverse));
		
		
	}

}
