package Arrays;

public class maxlengthQuestion {

	public static void main(String[] args) {
		int[] arr= {3,65,6,1,2,98};
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		System.out.println(max);
	}

}