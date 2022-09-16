package B6BitwiseOperatorMFD;

public class A8XORaTob {
	// It is used for find a number of xor 
		// ex: 0^0=0, 0^1=1, 0^1^2=3, 0^1^2^3=0,  0^1^2^3^4=4......
	
		public static int xor(int a) {
			   // 1 is   0 1 
			          // 2 is   1 0
			          // xor is 1 1 =3 
			          
			if(a%4==0) {
				return a;
			}
			if(a%4==1) {
				return 1;
			}
			if(a%4==2) {
				return a+1;
			}
			if(a%4==3) {
				return  0;
			}
			
			return -1;
		}
		
		
		public static void main(String[] args) {
			int from =3;
			int to=9;
			//int ans=xor(to)-xor(from)+1;
			int ans=xor(to)^xor(from-1);
			System.out.println(ans);
			 
			 
		}

}
