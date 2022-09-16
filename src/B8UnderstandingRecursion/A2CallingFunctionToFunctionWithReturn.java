package B8UnderstandingRecursion;

public class A2CallingFunctionToFunctionWithReturn {

	public static int fun1(int n) {
		int fun2 = fun2(n);
		return fun2;
	}

	private static int fun2(int n) {
		 int m=n+8;
		return fun3(m);
	}
	
	private static int fun3(int n) {
		 int m=n+8;
		return m;
	}

	public static void main(String[] args) {
		 System.out.println(fun1(3));

	}

}
