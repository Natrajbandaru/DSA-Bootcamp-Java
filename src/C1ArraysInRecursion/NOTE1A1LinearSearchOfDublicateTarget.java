package C1ArraysInRecursion;

import java.util.ArrayList;

//Lenaear search of dublicate Traget in return body in function 
public class NOTE1A1LinearSearchOfDublicateTarget {


	public static ArrayList linearSearch2(int[] arr,int target,int index) {
		ArrayList<Integer> list =new ArrayList<>();
		//	if(index>arr.length) {
		//		list.add(-1);
		//	}

		if(index==arr.length) {
			//	list.add(-1);
			return list;
		}
		if(target==arr[index]) {
			list.add(index);
		}
		ArrayList linearSearchAllElements = linearSearch2(arr, target, index+1);
		System.out.println(linearSearchAllElements);
		list.addAll(linearSearchAllElements);
		return  list;

	}
	public static void main(String[] args) {
		 int[] arr= {3,4,8,7,8};
		 ArrayList<Integer> list=new ArrayList<>();
		 System.out.println(linearSearch2(arr,8, 0));
	}
}
