package D1Problems;
import java.util.*;
public class A1MideanOfArray {
	
	
	public static double  findMedianSortedArrays(int[] num1,int[] num2) {
		int[] newarr= new int[num1.length+num2.length];
		
		for(int i=0;i<num1.length;i++) {
			newarr[i]=num1[i];
		}
		int c=0;
		for(int i=num1.length;i<newarr.length;i++) {	 
			newarr[i]=num2[c];
			c++;
		}
	 
		Arrays.sort(newarr);
		double median = median(newarr);
	    return median;
	}
	

	public static double median(int[] arr) {
		int low=0,high=arr.length;
		int mid=(low+high)/2;
		int total=1;
		double fa=1;
		if(high%2==0) {
			  
			total=arr[mid]+arr[mid-1];
		 
			  fa=total/2.0;
 
		}else {
			total=arr[mid];
			fa=total;
		}
	 return fa;
		 
		
	}
	
	public static void main(String[] args) {
		 int[] arr= {1,2,3,4};
		 int[] arr1= {5,6,7,8};
		 double arrnew= findMedianSortedArrays(arr,arr1);
		System.out.println(arrnew);
	}

}
