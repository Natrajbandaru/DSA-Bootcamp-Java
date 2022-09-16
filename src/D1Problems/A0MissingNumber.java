package D1Problems;

import java.util.Arrays;

public class A0MissingNumber {
	
	 public static int missingNumber(int[] nums) {
		 int totalnums=0;
		 int sum=0;
		for(int i=0;i<nums.length;i++) {
			totalnums=totalnums+nums[i];
			sum=sum+i;
		}
	    sum=sum+nums.length;
		 
		sum=sum-totalnums;
		System.out.println(sum);
	 
		 return 1;
	 }

	public static void main(String[] args) {
		int[] nums = {9,6,4,2,3,5,7,0,1};
		missingNumber(nums);
		

	}

}
