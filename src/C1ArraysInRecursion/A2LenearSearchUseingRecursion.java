package C1ArraysInRecursion;

public class A2LenearSearchUseingRecursion {
	//Finding target Index Useing LS
	
	public static int lenearsearch(int[] arr,int target,int index) {
		if(index==arr.length-1) {
			return -1;
		}
		
		if(arr[index]==target) {
			return index;
		}
		
		return lenearsearch(arr,target,index+1);
	}
	
	//Its Present Or Not
//	public static boolean lenearsearch2(int[] arr,int target,int index) {
//		if(index==arr.length) {
//			return false;
//		}
//		
////		if(arr[index]==target) {
////			return true;
////		}
//		                              //Its Return Statement
//		return arr[index]==target || lenearsearch2(arr,target,index+1); 
//	}

 
	//Finding target Index Useing LS inReverse Order
//	public static int lenearsearch3(int[] arr,int target,int index) {
//		if(index==-1) {
//			return -1;
//		}
//
//		if(arr[index]==target) {
//			return index;
//		}
//
//		return lenearsearch3(arr,target,index-1);
//	}

	 public static void main(String[] args) {
		 int[] arr= {3,4,5,7,8};
		// System.out.println(lenearsearch3(arr,8,arr.length-1));
		 System.out.println(lenearsearch(arr,4,0));
	 }
}
