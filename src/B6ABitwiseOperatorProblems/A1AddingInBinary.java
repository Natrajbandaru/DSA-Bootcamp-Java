package B6ABitwiseOperatorProblems;

public class A1AddingInBinary {
	
	public static void addingbinary() {
		int a=10;
		int b=1;
		//Hear 11 and 1 are decimal
		System.out.println(0b11+0b1);
		
		//Binary 1010 and 1011
		System.out.println(0b1010+0b1011);
		
		String bitCount = Integer.toBinaryString(11);
		String bitCount2 = Integer.toBinaryString(2);
		//String bitCount1 = Integer.toBinaryString(11);
		//System.out.println(Integer.toString(0ba, 0bb));
		
		System.out.println(bitCount+bitCount2);
		
	}

	public static void main(String[] args) {
		  
		addingbinary();
	}

}
