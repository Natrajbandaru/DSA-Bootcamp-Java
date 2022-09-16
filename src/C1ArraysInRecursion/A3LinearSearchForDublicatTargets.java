package C1ArraysInRecursion;

import java.util.*;

public class A3LinearSearchForDublicatTargets {
	//Linear search for dublicate LIST OUT SIDE THE METHOD
	
//    static ArrayList<Integer> list=new ArrayList<Integer>();
//	public static ArrayList linearSearch(int[] arr,int target,int index) {
//		
//		if(index==arr.length) {
//		//	list.add(-1);
//			return list;
//		}
//		if(target==arr[index]) {
//			list.add(index);
//		}
//		
//		return linearSearch(arr, target, index+1);
// 
//	}
	
	//Linear search for dublicate LIST IN SIDE THE ARRGUMENTS
     
	public static ArrayList linearSearch2(int[] arr,int target,int index,ArrayList<Integer> list) {
 
		if(index==arr.length) {

			return list;
		}
		if(target==arr[index]) {
			list.add(index);
		}
 		return linearSearch2(arr, target, index+1,list);
	}

	public static void main(String[] args) {
		 int[] arr= {3,4,8,7,8};
		 ArrayList<Integer> list=new ArrayList<>();
		 System.out.println(linearSearch2(arr,8, 0,list));
 	}

}
