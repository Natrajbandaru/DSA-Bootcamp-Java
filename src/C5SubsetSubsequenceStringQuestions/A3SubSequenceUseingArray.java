package C5SubsetSubsequenceStringQuestions;
import java.util.*;

public class A3SubSequenceUseingArray {
	
	public static void subarray(String[] arr,String num,int inc) {
//		int[] copyOf1 = Arrays.copyOf(arr, 2);
//		int[] copyOf = Arrays.copyOfRange(arr, 3, arr.length);
//		System.out.println(Arrays.toString(copyOf));
		
		if(arr.length==0) {
			System.out.println(num);
			return;
		}
		
		String as=arr[0];
		subarray(Arrays.copyOfRange(arr, inc, arr.length),as+num,inc+1);
		subarray(Arrays.copyOfRange(arr, inc, arr.length),num,inc+1);
	}
	
	public static void main(String[] args) {
		
		String[] arr= {"a","b","c"};
		subarray(arr,"",0);
		
		
	}

}
