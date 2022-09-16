package B6BitwiseOperatorMFD;

public class A3LuckestNumber {
	
	public static void ithbit(int n) {
		int base=5;
		int ans=0;
		 
		while(n>0) {
		 
			int a=n&1;
		  // a well last digit 0 and 1 and 1 for 6 
		    n=n>>1; 
		 // i/p=6 n well move from 0110 and 110 and 11 and 1 and 0 it is greater than
			ans=ans+a*base;
			base=base*5;
			 
			System.out.println(base);
		}
	 
	     
		 
	}
	
	public static void main(String[] args) {
		ithbit(6);
	}

}
