package D2RecursionProblems;

public class A3Sorting {
    
	public static int[] sorting(int[] arr,int r,int c) {
		
		if(r==1) {
			return arr;
		}
		
	    
		if(c<r) {
			if(arr[r]>arr[c]) {
				int temp=arr[r];
				arr[r]=arr[c];
				arr[c]=temp;
			}
			sorting(arr,r,c+1);
		}
		else {
			sorting(arr,r+1,0);
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		 int[] arr= {2,1,3,6,5};
		 System.out.println(sorting(arr,arr.length,0));

	}

}
