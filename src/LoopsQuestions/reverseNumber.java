package LoopsQuestions;

import java.util.Scanner;

public class reverseNumber {

	public static void main(String[] args) {
		
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		
		while(n>0) {
			int a=n%10;
		    System.out.print(a);
			n=n/10;
		}
	}
}
