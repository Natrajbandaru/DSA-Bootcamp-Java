package Recursion;

public class C5ReverseAnumber {
	
	static int  sum=0;

	public static void rev(int n) {
		 if(n==0) {
			return;
		}
		sum=sum*10+(n%10);
		
		rev (n/10);
		//System.out.println(sum);
	}
	
	
	public static void main(String[] args) {
		rev(324);
		System.out.println(sum);
		}
}
