package B8UnderstandingRecursion;

public class A4UnderstandingBuloanRetern {
	
	 
	
	public static boolean check(int n,int i) {	
		boolean s=n<i && check1(5,7);
		return s;
	}
 

	private static boolean check1(int n,int i) {
		boolean s=n<i && check2(6,7);
		return s;
	}


	private static boolean check2(int n,int i) {
		boolean s=(n<i);
		return s;
	}


	public static void main(String[] args) {
	 System.out.println(check(4,6));

	}

}
