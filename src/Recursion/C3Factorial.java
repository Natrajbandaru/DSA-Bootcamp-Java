package Recursion;

public class C3Factorial {

	public static int factorial(int n) {
		if(n<=1) {
			return n;
		}
		int i=n*factorial(n-1);
		return  i;
		
	}

	public static void main(String[] args) {
		int n=5;
		 System.out.println(factorial(n));
	}

}
