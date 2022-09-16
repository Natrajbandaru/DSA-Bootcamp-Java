package B7MFD2;

public class A2PrimeNumbersUptoN {
	
	 
		 
		public static boolean primenumber(int n) {
			if(n<2) {
				return false;
			}
			boolean ans=true;
			int d=2;
			while(d*d<=n) {
				System.out.println(d*d);
				 if(n%d==0) {
					 ans= false; 
				 }
				 d++;
			}
				
			return ans;
		}

	public static void main(String[] args) {
	 int a= 10;
	 System.out.println(primenumber(10));
//	 for(int i=1;i<=a;i++) {
//		 boolean primenumber = primenumber(i);
//		 if(primenumber==true) {
//			 System.out.println(i);
//		 }
//		 
//	 }
	}

}
