package Recursion;

public class A1NumberPrinting {
	
	public static void numbers(int n) {
		
		if(n==0) {
			return;
		}
		System.out.println(n);
		numbers(n-1);
		System.out.println(n);
		
	}
//	public static void numbers(int n,int c) {
//	 
//		if(c==n) {
//			return;
//		}
//		System.out.println(n);
//		numbers(n,n+1);
//		System.out.println(n);
//		
//	}
	public static void main(String[] args) {
		numbers(5);
	}

}
