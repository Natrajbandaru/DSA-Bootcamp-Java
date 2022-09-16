package Recursion;

public class C4SUMOFNUMBER {
	public static int product(int n) {
		if(n==n%10) {
			return n;
		}
		int i=(n%10)*product(n/10);
		return   i;
	}
	
	public static int sum(int n) {
		if(n==n%10) {
			return n;
		}
		int i=(n%10)+sum(n/10);
		return  n%10+sum(n/10);
	}
	
	public static void main(String[] args) {
		int n=12342;
		 System.out.println(sum(n));
	}
}
