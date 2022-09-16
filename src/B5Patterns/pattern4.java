package B5Patterns;

public class pattern4 {
 
//	*  
//	* *  
//	* * *  
//	* * * *  
//	* * * * * *  
//	* * * * *  
//	* * * *  
//	* * *  
//	* *  
//	*  
	
	public static void pattern(int n) {
		 for(int row=1;row<=n*2;row++) {
			 int colupto=1;
			 if(row>=n) {
				 colupto=(2*n-row)+1;
			 }else {
				 colupto=row;
			 }
			 for(int col=1;col<=colupto;col++) {
				 System.out.print("*"+" ");
			 }
			 System.out.println(" ");
		 }
	}
	
	public static void main(String[] args) {
		pattern(5);
	}
}
