package LoopsQuestions;

public class fibonici {

	public static void main(String[] args) {
		int n=7,a=0,b=1,t=2;
		
		while(t<=n) {
			
			int temp=b;
			b=a+b;
		    a=temp;
			t++;
		}
		System.out.println(b);

	}

}
