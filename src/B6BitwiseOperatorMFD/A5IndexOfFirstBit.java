package B6BitwiseOperatorMFD;

public class A5IndexOfFirstBit {
	
	public static int indexofbit(int a) {
		
		int n=10110110;
		int ans=(n & (-n)); //It gives index of first number Right most set bit
		System.out.println(ans);
		return a;
	}

	
	public static void main(String[] args) {
		indexofbit(3);
	}
}
