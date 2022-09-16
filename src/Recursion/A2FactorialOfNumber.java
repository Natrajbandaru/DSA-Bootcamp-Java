package Recursion;

public class A2FactorialOfNumber {
	
	public static int fact(int n) {
		
		if(n==1) {
			return n;
		}
		 
		return n*fact(n-1);
		 
	}
	
//	public static  void fact(int n) {
//int s=n*n-1;
//		if(n==1) {
//			System.out.println(s);
//			return ;
//		}
//		 
//		    fact(n-1);
//	}

	public static void main(String[] args) {
		 System.out.println(fact(5));
		//fact(5);

 	}

}
