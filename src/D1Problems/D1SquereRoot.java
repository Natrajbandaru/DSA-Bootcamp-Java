package D1Problems;

public class D1SquereRoot {
 
	    public static  int mySqrt(int x) {
	        if(x == 0) return 0;
	        long start = 1;
	        long end = x;
	        while(start <= end){
	            long mid = start + (end - start)/2;
	            long square = mid * mid;
	            if(square == x){
	                return (int)mid;
	            }
	            else if(square < x){
	                start = mid + 1;
	            }
	            else{
	                end = mid - 1;
	            }
	        }
	        
	        if(end * end == x){
	            return (int)end - 1;
	        }
	        else{
	            return (int)start - 1;
	        }
	    }
	    
	    public static void main(String[] args) {
	    	System.out.println(mySqrt(9));
	    }
 
}
