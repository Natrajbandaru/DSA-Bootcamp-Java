package Recursion;

public class A4CountingOfNumbers {
	
//	public static void count(int n,int c) {
//		if(n==0) {
//			System.out.println(c);
//			return ;
//		}
//		System.out.println(n);
//		int m=n%10;
//		//System.out.println(m);
//		if(m==0) {
//			count(n/10,c+1);
//			System.out.println(n);
//		}
//		count(n/10,c);
//		System.out.println(n);
//		
//	}
	
	public static int count(int n,int c) {
		if(n==0) {
		//	System.out.println(c);
			return c;
		}
 
		if(n%10==0) {
			System.out.println(n);
			return count(n/10,c+1);
		}
	  return count(n/10,c);
		
	}


	public static void main(String[] args) {
		count(2103,0);
		 
         //System.out.println(count(20103,0));

	}

}
