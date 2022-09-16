package B5Patterns;

public class pattern5 {
	
//	1  
//	1 2  
//	1 2 3  
//	1 2 3 4  
//	1 2 3 4 5  
//	1 2 3 4  
//	1 2 3  
//	1 2  
//	1  
	
	public static void pattern(int n) {
		 for(int row=1;row<=n*2;row++) {
			 int colupto=1;
			 if(row>=n) {
				 colupto=(2*n-row);
			 }else {
				 colupto=row;
			 }
			 for(int col=1;col<=colupto;col++) {
				 System.out.print(col+" ");
			 }
			 System.out.println(" ");
		 }
	}
	
	public static void main(String[] args) {
		pattern(5);
	}

}
