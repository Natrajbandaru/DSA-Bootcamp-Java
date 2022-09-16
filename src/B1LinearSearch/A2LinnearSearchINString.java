package B1LinearSearch;

public class A2LinnearSearchINString {
	
	public static boolean LeanearSearch(String  name, char target) {
		
		for(int index=0;index<name.length();index++) {
			if(name.charAt(index)==target) {
				
				return true;
			}
		}
		
		return false;
	}
	

    public static void main(String[] args) {
    	 
    	System.out.println(LeanearSearch("Natraj",'z'));
    	
    	
    }

}
