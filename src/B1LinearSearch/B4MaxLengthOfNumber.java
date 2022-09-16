package B1LinearSearch;

public class B4MaxLengthOfNumber {
	
//METHOD 1	
//	public static void maxlength(int[] arr) {
//		int max=0;
//		
//		for(int num:arr) {
//			String convertnum=Integer.toString(num);
//			int numlength=convertnum.length();
////MAX length of numbers in integer 
////			if(max<numlength) {
////				max=numlength;				
////			}
//			if(numlength%2==0) {
//				max=numlength;	
//			}
//		}
//		System.out.println(max);
//	}
	
//METHOD 2
	public static void maxlengthofIntegerinarray(int[] arr) {
		int evencount=0;
		for(int i=0;i<arr.length;i++) {
			int num=arr[i];
			int ordercount=order(num);
			if(ordercount%2==0) {
				evencount=evencount+1;
			}
		}
		System.out.println(evencount);
	}
	
	public static int order(int num) {
		int number=num;
		int count=0;
		if(number<0) {
			count=count+1;
		}
		if(number==0) {
			count=count+1;
		}
		while(number>0) {
			count=count+1;
			number=number/10;
		}
		return count;
	}
	
	public static void main(String[] args) {
		int[] arr= {234,4567,12,1,12};
		maxlengthofIntegerinarray(arr);
		
	}

}
