package LoopsQuestions;
import java.util.*;

public class CountingANumbersINInteger {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int v=s.nextInt();
		int count=0;
		while(n>0) {
			int d=n%10;
			if(d==v) {
				count=count+1;
			}
			n=n/10;
		}
		System.out.println(count);
	}

}
