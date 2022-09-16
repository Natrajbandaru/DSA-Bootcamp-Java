package B7MFD2;

public class A3SquereRootOfNumber {
 
//	    public static int mySqrt(int x) {
//	        int low=1,high=x;
//	        int ans=0;
//	        int mid=0;
//	        while(low<high){
//	              
//	             mid=low+(high-low)/2;
//	            if(mid*mid==x){
//	                return mid;
//	            }
//	            if(mid*mid>x){
//	                 high=mid-1;
//	              }else{
//	                  low=mid+1;
//	              }
//	        
//	        }
//	        return high;
//	    }
// 
	
	public static int mysqrt(int x) {
		 int l = 1;
	        int r = x;
	        
	        if(x==0) return 0;
	        while(l<=r){
	            int mid = (l+r)/2;
	            
	            if(mid == x/mid ){
	                return mid;
	            }
	            
	            if(x/mid>mid){
	                l = mid+1;
	            }
	            
	            else{
	                r = mid-1;
	            }
	        }
	        
	        return r;
	}
	public static void main(String[] args) {
		System.out.println(mysqrt(2));
	}

}
