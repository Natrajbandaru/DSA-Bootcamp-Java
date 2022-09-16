package B5Patterns;

public class pattern6 {
	
//    *  
//   * *  
//  * * *  
// * * * *  
//* * * * *  
	
	public static void pattern(int n) {
		
		for(int row=1;row<=n;row++) {
			int spaces=n-row;
			for(int spac=1;spac<=spaces;spac++) {
				System.out.print(" ");
			}
			for(int col=1;col<=row;col++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}
	
	public static void main(String[] args) {
		
		pattern(5);
	}

}
