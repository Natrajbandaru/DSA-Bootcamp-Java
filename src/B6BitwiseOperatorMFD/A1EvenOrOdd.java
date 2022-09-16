package B6BitwiseOperatorMFD;

public class A1EvenOrOdd {
	
	//0 1 1 1     :7
	//0 0 0 1     and Operator (If any number is &(and) with 1 
	                           //it can get that number)
	     // 1    //odd Number
	
	public static boolean EvenOrOdd(int n) {
		
		if((n&1)==1) {
			return false;
		}else {
			return true;
		}
	}
	public static void main(String[] args) {
		System.out.println(EvenOrOdd(7));
		
		
		//Binery Representation
	    System.out.println(Integer.toBinaryString(6));
	}

}
