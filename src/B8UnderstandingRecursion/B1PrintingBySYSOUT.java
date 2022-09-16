package B8UnderstandingRecursion;

public class B1PrintingBySYSOUT {
 
	public static void numbers(int n) {

		if(n<=0) {
			System.out.println(n);
			return ;
		}
		System.out.println(n);
		numbers(n-1) ;
		System.out.println(n);
		numbers(n-2);
		System.out.println(n);

	}

	public static void main(String[] args) {
		numbers(4);

	
	}

}
