package javaFundementals;

import java.util.ArrayList;

public class Arrays {

	public static void main(String[] args) {
		ArrayList<String> giantWords = new ArrayList<String>();
		giantWords.add("fee");
		giantWords.add("fie");
		giantWords.add("foe");
		System.out.println(giantWords);
		System.out.println("my list has " + giantWords.size() + " elements");
		 
		giantWords.add("fum");
		System.out.println(giantWords);
		System.out.println("my list has " + giantWords.size() + " elements");
		
		giantWords.add("frick");
		System.out.println(giantWords);
		System.out.println("my list has " + giantWords.size() + " elements");
	}

}
