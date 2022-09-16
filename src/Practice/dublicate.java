package Practice;
import java.util.*;

public class dublicate {
	
	public static boolean containsDuplicate(int[] nums) {
		 Map<Integer,Integer> map=new HashMap<>();
		 
		 for(int i=0;i<=nums.length-1;i++) {
			 
			 if(map.containsKey(nums[i])) {
				 map.put(nums[i], map.get(nums[i])+1);
			 }else {
				 map.put(nums[i], 1);
			 }
		 }
		 
		 for(int j=0;j<nums.length;j++) {
			 if(map.get(nums[j])>1) {
				 return true;
			 }
		 }
		 
		return false;
		 
	}
 
 
    public static void main(String[] args) {
    	int[] arr= {1,2};
    	System.out.println(containsDuplicate(arr));
    }

}
