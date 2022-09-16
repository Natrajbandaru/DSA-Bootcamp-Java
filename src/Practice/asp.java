package Practice;

import java.util.*;
public class asp {

	public static  void main(String[] args) {
	  
	  int[] nums= {1,2,2,5,3,5};
	  Set<Integer> setnum=new HashSet<>();
       
      for(int i=0;i<nums.length;i++){
          setnum.add(nums[i]);
      }
    //  System.out.println(setnum.size());
       int count=0;
       int[] arr=new int[setnum.size()];
      for(int j:setnum){
          arr[count]=j;
    	//  System.out.println(count);
          count++;
      }
      System.out.println(Arrays.toString(arr));
      System.out.println();
      
      if(arr.length>2) {
    	  System.out.println(arr[arr.length-3]);
      }else {
    	  System.out.println(arr[arr.length-1]);
      }
 
	}
	
	 
}
