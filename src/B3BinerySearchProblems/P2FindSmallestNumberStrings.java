package B3BinerySearchProblems;

public class P2FindSmallestNumberStrings {
  
	public static int String(String str,char target) {
		int low=0,high=str.length()-1;
		
 
		while(low<=high) {
			int mid=low+(high-low)/2;
		 
			if(target<str.charAt(mid)) {
				high=mid-1;
			}
			else if(target>str.charAt(mid)) {
				low=mid+1;
			}
			else {
				return mid;
			}
			 
		}
		return high;
	}
	public static void main(String[] args) {
		
		System.out.println(String("acdfil",'o'));
	}
	
}
