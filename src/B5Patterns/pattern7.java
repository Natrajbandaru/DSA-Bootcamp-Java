package B5Patterns;

public class pattern7 {
	public static void pattern(int n) {
		for(int row=1;row<=n*2;row++) {
			int colgo=1;
			if(row>=n) {
				colgo=(2*n)-row;
			}else {
				colgo=row;
			}
			for(int col=1;col<=colgo;col++) {
				 System.out.print("*"+" ");
			}
			System.out.println(" ");
		}
		
	}

	public static void main(String[] args) {
		pattern(4);
	}
}
