package B8UnderstandingRecursion;

//2)Inside the Argument(Return is Mandatory)
public abstract class C2TPS2InsideTheArgument {
	
	//NOTE: HEARE counting is inside the argument
	public static int count(int n,int c) {
		if(n==0) {
		//	System.out.println(c);
			return c;
		}
 
		if(n%10==0) {
			//System.out.println(n);
			return count(n/10,c+1);
		}
	  return count(n/10,c);
		
	}

	public static void main(String[] args) {
		 
		System.out.println(count(201030,0));
	}

}
