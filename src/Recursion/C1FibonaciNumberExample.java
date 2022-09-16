package Recursion;

public class C1FibonaciNumberExample {
	
	public static int fib(int n) {
		if(n<2) {
			return n;
		}
		System.out.println(n);
		return fib(n-1)+fib(n-2);
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(fib(4));
		
	}
	
}
