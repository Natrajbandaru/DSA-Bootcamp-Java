package B6BitwiseOperatorMFD;

import java.util.*;

public class A4NOTENumberOfDigits2A10A8 {
	
	//Formula digits=log (number)  
	                  //(base) 
	
	public static void digits(int n) {
		
		int number=12;//Number to find how many
		int base=2;// Base of Number 2 or 10 or 8 or 16
		int ans=(int)(Math.log(number)/Math.log(base))+1;
		//To get base we need to 
		 System.out.println(ans);
	}
	
	public static void main(String[] args) {
		digits(3);
	}
}
