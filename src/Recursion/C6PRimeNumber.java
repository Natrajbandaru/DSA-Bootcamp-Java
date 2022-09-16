package Recursion;

public class C6PRimeNumber {
	public static void checkprime(int n) {
		
	}
	public static void prime(int n) {
		if(n<2) {
			return;
		}
		if(n%(n-1)==0) {
			
		}
		
		prime(n-1);
		 
		 
	}
	
	
	public static void main(String[] args) {
		prime(6);
//		boolean s=false;
//		int n=9;
//		for(int i=2;i<n;i++) {
//			if(n%2==0) {
//				s=false;
//			}
//			else {
//				s=true;
//			}
//		}
//		if(s==false) {
//			System.out.println("Not a prime");
//		}
//		else {
//			System.out.println("Prime");
//		}
		
		
	}

}
