package C6SubStringQuestion;

import java.util.ArrayList;

public class A1Telephone {
	
	
	
	public static void seqtel(String process,String unprocess) {
		
		if(unprocess.isEmpty()) {
			System.out.println(process);
			return ;
		}
		
		int digit=unprocess.charAt(0)-'0';
		 
		
		for(int i=(digit-1)*3;i<digit*3;i++) {
			char ch=(char)('a'+i);
			seqtel(process+ch,unprocess.substring(1));
		}
		
	}
	
	public static ArrayList<String> telephone(String process,String unprocess) {
		ArrayList<String> list=new ArrayList<>();
		if(unprocess.isEmpty()) {
			 list.add(process);
			return list;
		}
		
		int digit=unprocess.charAt(0)-'0';
		
		for(int i=(digit-1)*3;i<digit*3;i++) {
			char ch=(char)('a'+i);
			ArrayList<String> list1=telephone(process+ch,unprocess.substring(1));
			list.addAll(list1);
		}
		return list;
		
	}
	
	public static  int telephonecount(String process,String unprocess) {
		 
		if(unprocess.isEmpty()) {
			return 1;
		}
		
 		int digit=unprocess.charAt(0)-'0';
		int count=0;
		for(int i=(digit-1)*3;i<digit*3;i++) {
			char ch=(char)('a'+i);
			count =count + telephonecount(process+ch,unprocess.substring(1));	
		}
		return count;
	}

	public static void main(String[] args) {
	System.out.println(telephonecount("", "12"));
	}

}
