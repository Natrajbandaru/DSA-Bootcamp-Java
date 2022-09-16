package B6BitwiseOperatorMFD;

public class A6NumbersOfBits {
	
public static int numberOfBits(int n) {
		
		int count =0;
		while(n>0) {
			 count++;
			// System.out.println(n);
			  n=n-(n & -n); //It gives index of first number Right 
			               //most set bit
			   
		}
	//	System.out.println(count);
		
		return count;
	}
     
	
	public static void main(String[] args) {
		
		System.out.println(numberOfBits(6));
	}

}
