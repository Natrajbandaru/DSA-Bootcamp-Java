package B8UnderstandingRecursion;

public class B2PrintingbyReturnStartement {

	
	public static int fact(int n) {

		if(n==1) {
			return n;
		}

		return n*fact(n-1);

	}

	public static void  main(String[] args) {
		System.out.println(fact(5));
	}

}
