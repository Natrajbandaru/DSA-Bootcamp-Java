package C5SubsetSubsequenceStringQuestions;

public class A1RemoveingAElement {
	
	// It well skip a character return present inb arguments
	public static String subsequence(String changed,String orgenal) {
		
		if(orgenal.isEmpty()) {
			return changed;
		}
		 char b=orgenal.charAt(0);
		if(b=='a') {
			return subsequence(changed,orgenal.substring(1));
		}
		else {
			return subsequence(changed+b,orgenal.substring(1));
		}
	}
	
	// It well skip one chatracter in body
	public static String subsequenceinbody(String orgenal) {
		 
		if(orgenal.isEmpty()) {
			return "";
		}
		 
		
		char b=orgenal.charAt(0);
		if(b=='a') {
			return subsequenceinbody(orgenal.substring(1));
		}
		else {
			return  b+subsequenceinbody(orgenal.substring(1));
		}
	}
	
	//It well skip String insted of one 
	public static String removeapple(String orgenal) {
		if(orgenal.isEmpty()) {
			return "";
		}
		 
		
		char b=orgenal.charAt(0);
		if(orgenal.startsWith("apple")) {
			return removeapple(orgenal.substring(5));
		}
		else {
			return b+removeapple(orgenal.substring(1));
		}
	}
	
     //It well skip one insted of skip another  
	public static String skepAppNotapple(String orgenal) {
		if(orgenal.isEmpty()) {
			return "";
		}
		 
		
		char b=orgenal.charAt(0);
		if(orgenal.startsWith("app") && !orgenal.startsWith("apple")) {
			return skepAppNotapple(orgenal.substring(3));
		}
		else {
			return b+skepAppNotapple(orgenal.substring(1));
		}
	}
	
	

	public static void main(String[] args) {
		System.out.println(skepAppNotapple("ssappdledd"));
	}

}
