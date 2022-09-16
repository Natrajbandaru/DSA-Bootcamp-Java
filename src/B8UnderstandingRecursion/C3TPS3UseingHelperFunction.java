 package B8UnderstandingRecursion;

public class C3TPS3UseingHelperFunction {

	static int rev2(int n) {
		int digits=(int)(Math.log10(n))+1;
	 
		 int helper = helper(n,digits);
		 return helper;
	}

	private static int helper(int n, int digits) {
		//System.out.println(n);
		 if(n%10==n) {
			 return n;
		 }
		 int rem=n%10;
		 return  rem*(int)Math.pow(10, digits-1)+helper(n/10,digits-1);
	}

	public static void main(String[] args) {
		System.out.println(rev2(123));
		  
	}

}
