package Recursion;

public class B3RecursinReverse {
	
	public static void funrev(int n) {
		if(n==1) {
			System.out.println(n);
			return;
		}
		 
		funrev(n-1);
		System.out.println(n);
	}
	
	public static void fun(int n) {
		if(n==1) {
			System.out.println(n);
			return;
		}
		System.out.println(n);
		fun(n-1);
		 
	}
	public static void funBoth(int n) {
		if(n==0) {
			//System.out.println(n);
			return;
		}
		System.out.println(n);
		funBoth(n-1);
		System.out.println(n);
		 
	}
	
	public static void main(String[] args) {
		funBoth(5);
	}

}
