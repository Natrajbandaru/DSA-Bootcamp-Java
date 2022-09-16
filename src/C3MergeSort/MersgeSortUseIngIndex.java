package C3MergeSort;

import java.util.Arrays;

public class MersgeSortUseIngIndex {
	
	public static void  mergesort(int[] arr,int start,int end) {
         
		if(end-start==1) {
			return ;
		}
		
		int mid=(start+end)/2;
		System.out.println(mid);
		System.out.println(arr[mid]+"   arrmid");
		System.out.println(start+"  start   "+end+"   end");
	 	System.out.println(arr.length+"L");
		 System.out.println(Arrays.toString(arr));
		
	 
		 mergesort(arr,start,mid);
		 mergesort(arr,mid,end);
		 
		 merge(arr,start,mid,end);
		     
	}

	private static void merge(int[] arr, int start, int mid, int end) {
		
		System.out.println(start+"  start1   "+mid+"  mid1  "+end+"   end1");
		int[] mix=new int[end-start];
		
		int i=start;
		int j=mid;
		int k=0;
		
		while(i<mid && j<end) {
			if(arr[i]<arr[j]) {
				mix[k]=arr[i];
				i++;
			}
			else {
				mix[k]=arr[j];
				j++;
			}
			k++;
		}
		
		while(i<mid) {
			mix[k]=arr[i];
			k++;
			i++;
		}
		while(j<end) {
			mix[k]=arr[j];
			k++;
			j++;
		}
		
		System.out.println(Arrays.toString(mix)+"  mix");
		System.out.println(Arrays.toString(arr)+"  arr");
		
		for(int l=0;l<mix.length;l++) {
			arr[start+l]=mix[l];
		}
	}

	public static void main(String[] args) {
		 int[] arr= {5,4,3,2,1};
		    mergesort(arr,0,arr.length);
		   System.out.println(Arrays.toString(arr));
		    // Arrays.toString(dividemerge);

	}

}
