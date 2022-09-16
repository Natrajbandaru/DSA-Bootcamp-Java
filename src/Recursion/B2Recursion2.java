package Recursion;

public class B2Recursion2 {
//	public static void fun(int n) {
//		if(n>=4) {
//			System.out.println(n+"r");
//			return;
//		}
//		System.out.println(n);
//		fun(n+2);
//		System.out.println(n +"a");
//		fun(n+1);
//		System.out.println(n+"P");
//	 
//	}
	
	public static void fun(int n) {
		if(n>=4) {
			System.out.println(n+"r");
			return;
		}
		System.out.println(n);
		fun(n+2);
		System.out.println(n +"a");
		fun(n+1);
		System.out.println(n+"P");
	 
	}

	public static void main(String[] args) {
		fun(1);
	}
}
