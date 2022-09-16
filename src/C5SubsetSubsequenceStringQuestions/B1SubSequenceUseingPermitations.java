package C5SubsetSubsequenceStringQuestions;

import java.util.ArrayList;

public class B1SubSequenceUseingPermitations {
	
	 


	public static void permitation(String process,String unprocess) {
		
		if(unprocess.isEmpty()) {
			System.out.println(process);
			return;
		}
		
		char ch=unprocess.charAt(0);
	 
		for(int i=0;i<=process.length();i++) {
 			String first=process.substring(0,i);
 			String secound=process.substring(i,process.length());
 			permitation(first + ch + secound,unprocess.substring(1));
			
		}
	}
 
	public static ArrayList<String> permitationarray(String process,String unprocess) {
        
		ArrayList<String> list=new ArrayList<>();
		if(unprocess.isEmpty()) {
			 list.add(process);
			return list;
		}

		char ch=unprocess.charAt(0);

		for(int i=0;i<=process.length();i++) {
			String first=process.substring(0,i);
			String secound=process.substring(i,process.length());
			 ArrayList<String> list1 = permitationarray(first + ch + secound,unprocess.substring(1));
			 list.addAll(list1);
		}
		
		return list;
		 
	}
	

	public static void main(String[] args) {
		 
		System.out.println(permitationarray("","abc"));
	}

}
