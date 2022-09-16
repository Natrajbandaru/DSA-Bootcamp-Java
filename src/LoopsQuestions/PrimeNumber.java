package LoopsQuestions;

public class PrimeNumber {
	public static boolean primenumber(int n) {
       boolean ans=true;
     //  int m=n/2;
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				ans= false;
				
			}
		}
		return ans;  	
	}
	public static void main(String[] args) {
		 boolean ans=primenumber(4);
		 if(ans==true) {
			 System.out.println("primeNumber");
		 }
		 else {
			 System.out.println("Not a prime Number");
		 }
	}

}
