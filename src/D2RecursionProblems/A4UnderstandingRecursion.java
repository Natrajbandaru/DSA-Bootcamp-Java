package D2RecursionProblems;

public class A4UnderstandingRecursion {

	public static int count(int count) {
		int c=1;
		c++;

		int countnum=1; 
		if(count==10) {

			return c;
		}
		return countnum+count(count+1);

	}
	 
	public static void main(String[] args) {
		System.out.println(count(1));
	}

}
