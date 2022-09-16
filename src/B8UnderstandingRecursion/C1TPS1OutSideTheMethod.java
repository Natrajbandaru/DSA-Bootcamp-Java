package B8UnderstandingRecursion;
//Types Of NumberPrinting

//1)Out Side The Method(NO Return Statement)
//2)Inside the Argument(Return is Mandatory)
//3)Useing Helper Function(Return is Mandatory

//1)Out Side The Method
public class C1TPS1OutSideTheMethod {
	
	//NOTE: HEARE Count(c) Side The Method
    static int c=0;
	public static void count(int n ) {
		if(n==0) {
			//	System.out.println(c);
			return ;
		}

		if(n%10==0) {
			//System.out.println(n);
			c++;
			count(n/10);
		}else {
			count(n/10);
		}

	}

	public static void main(String[] args) {
		count(201030);
		System.out.println(c);
	}

}
