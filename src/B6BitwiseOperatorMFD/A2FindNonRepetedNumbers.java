package B6BitwiseOperatorMFD;

public class A2FindNonRepetedNumbers {
	
//	public static  int add(int[] arr) {
//		int i=0;
//		for(int n:arr) {
//			i=i+n;
//		}
//		return i;
//	}
    public static int NonRepetedNum(int[] arr) {
    	int i=0;
    	for(int n: arr) {
    		// i^=n;
    		i=i^n;
    		System.out.println(i);
    	}
    	return i;
    }
	public static void main(String[] args) {
		// int[] a= {-2,3,2,4,-5,5,-4};
		// System.out.println(add(a));
		
//		 int[] a= {2,3,4,1,2,1,3,6,4};
//		 System.out.println(NonRepetedNum(a));
		System.out.println(1^1);
	}

}
