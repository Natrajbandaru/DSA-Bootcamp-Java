package Practice;

public class Solution {
    
    public static int peak(int[] arr){
        
//        int low=0,high=arr.length-1;
////        System.out.println(high+" l");
//        while(low<=high){
//        //	System.out.println(high+" in");
//        	int mid=low+(high-low)/2;
//        	System.out.println(mid);
//             
//            if(mid<high && arr[mid]>arr[mid+1]){
//            	 System.out.println(arr[mid]+"lop");
//                return mid;
//            }
//             if(mid> low && arr[mid]<arr[mid-1]){
//            	 System.out.println(arr[mid-1]+"pp");
//                return mid-1;
//            }
//             
//            if(arr[mid]<=arr[low]){
//                high=mid-1;
//            }
//            else {
//            	low=mid+1;
//            }
//        }
//      
//        return -1;
    	 int start = 0;
         int end = arr.length - 1;
         while (start <= end) {
             int mid = start + (end - start) / 2;
             // 4 cases over here
             if (mid < end && arr[mid] > arr[mid + 1]) {
                 return mid;
             }
             if (mid > start && arr[mid] < arr[mid - 1]) {
                 return mid-1;
             }

             // if elements at middle, start, end are equal then just skip the duplicates
             if (arr[mid] == arr[start] && arr[mid] == arr[end]) {
                 // skip the duplicates
                 // NOTE: what if these elements at start and end were the pivot??
                 // check if start is pivot
                 if (start < end && arr[start] > arr[start + 1]) {
                     return start;
                 }
                 start++;

                 // check whether end is pivot
                 if (end > start && arr[end] < arr[end - 1]) {
                     return end - 1;
                 }
                 end--;
             }
             // left side is sorted, so pivot should be in right
             else if(arr[start] < arr[mid] || (arr[start] == arr[mid] && arr[mid] > arr[end])) {
                 start = mid + 1;
             } else {
                 end = mid - 1;
             }
         }
         return -1;
    }
    public static boolean binerysearch(int[] arr,int target,int low,int high){
        boolean ans=false;
        while(low<=high){
             int mid=(low+high)/2;
         
            if(target<arr[mid]){
                 high=mid-1;
            }
            else if(target>arr[mid]){
             low=mid+1;
            }
            else{
                ans=true;
                break;
            }
        
        }
       
         return ans;
    }
        
 
    public static boolean search(int[] nums, int target) {
        
        int pivot=peak(nums);
        int low=0,high=nums.length-1;
        boolean ans2=false;
       boolean ans= binerysearch(nums,target,low,pivot);
       System.out.println(ans +"kl");
        ans2=ans;
        if(ans==false){
             boolean ans1= binerysearch(nums,target,pivot+1,high);
             System.out.println(ans1 +"kwl");

             ans2=ans1;
        }
        return ans2;
    }  
    
    
    public static void main(String[] args) {
    //	int[] arr= {1,0,1,1,1};
    	int[] arr= {1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,1,1,1,1};
    			
    	System.out.println(search(arr,2));
    }
}