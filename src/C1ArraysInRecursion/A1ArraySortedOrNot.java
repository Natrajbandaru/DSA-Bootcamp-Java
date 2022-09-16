package C1ArraysInRecursion;

public class A1ArraySortedOrNot {

	public static boolean sorted(int[] arr ,int index ) {
	 
		if(index == arr.length-1) {
			return true;
		}
		boolean s= arr[index]<arr[index+1] && sorted(arr,index+1);
 		return  s;
 	}
  
 	public static void main(String[] args) {
		int[] arr= {3,9,5,7,8};
		System.out.println(sorted(arr,0));

	}

}
