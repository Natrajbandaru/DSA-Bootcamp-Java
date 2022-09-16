package B8UnderstandingRecursion;

//public static int sum(int n) {
//	if(n==n%10) {
//		return n;
//	}
//	int i=(n%10)+sum(n/10);
//	return  n%10+sum(n/10);
//}
public class A3UnderstandingReturnValue {
	
	
	public static int sum(int n) {	
		int i=n%10+sum1(n/10);
		return i;
	}
 

	private static int sum1(int n) {
		int i=n%10+sum2(n/10);
		return i;
	}


	private static int sum2(int n) {
		int i=n%10;
		return i;
	}


	public static void main(String[] args) {
	   System.out.println(sum(634));
	}

}
