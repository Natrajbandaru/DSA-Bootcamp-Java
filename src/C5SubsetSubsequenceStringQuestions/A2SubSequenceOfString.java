package C5SubsetSubsequenceStringQuestions;

import java.util.ArrayList;

public class A2SubSequenceOfString {

	 




	//i/p abc
	//o/p a ab bc b ac c abc
	public static void subsequence(String newone,String org) {

		if(org.isEmpty()) {
			System.out.println(newone);
			return ;
		}
		char a=org.charAt(0);
		subsequence(a+newone, org.substring(1));
		subsequence(newone, org.substring(1));

	}

	public static ArrayList<String>  UseingArrayList(String newone,String org) {

		ArrayList<String> list=new ArrayList<>();

		if(org.isEmpty()) {
			//System.out.println(newone);
			list.add(newone);
			return list;
		}
		char a=org.charAt(0);

		ArrayList<String> newones= UseingArrayList(a+newone, org.substring(1));
		ArrayList<String> orginal=	UseingArrayList(newone, org.substring(1));

		newones.addAll(orginal);
		return newones;

	}




	public static void main(String[] args) {

		System.out.println(UseingArrayList("", "abc"));
	}

}
