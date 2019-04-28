package javaFundementals;

import java.util.ArrayList;
import java.util.List;

public class ArraylistDemo {

	public static void main(String[] args) {
		
		ArrayList<String> myAnimals = new ArrayList<String>();

		myAnimals.add("Deer");
		myAnimals.add("Lemur");
		myAnimals.add("Leopard");
		myAnimals.add("Squirrel");
		myAnimals.add("Chipmunk");
		
		for(String word: myAnimals) {
		System.out.println("Liam has a " + word + "!");
		}
		
	ArrayList<String> umBrella = new ArrayList<String>();
	umBrella.add("true");
	umBrella.add("false");
	umBrella.add("false");
	umBrella.add("true");
	umBrella.add("false");
	
	if (umBrella.contains("true")) {
		System.out.println("Bring an Umbrella!");
	}
	if (umBrella.contains("false")) {
		System.out.println("No rain today, enjoy the sun!");
	}
	List<Integer> myNumber = new ArrayList<Integer>();
	
	//Create a list  1,23,9,77,922,6,32,63,14,5
	myNumber.add(1);
	myNumber.add(23);
	myNumber.add(9);
	myNumber.add(77);
	myNumber.add(922);
	myNumber.add(6);
	myNumber.add(32);
	myNumber.add(63);
	myNumber.add(14);
	myNumber.add(5);
	
	if(myNumber.contains(23)) {
		System.out.println("23 is in our collection");
	}else {
		System.out.println("23 Not in our collection");
	}
	
	if(myNumber.contains(77)) {
		System.out.println("77 is in our collection");
	}else {
		System.out.println("77 Not in our collection");
	}
	if(myNumber.contains(15)) {
		System.out.println("15 is not our collection");
	}else {
		System.out.println("15 Not in our collection");
	}
	
	// Remove 23,32,922,6
	
	myNumber.remove((Integer)(23));
	
	
	
	
}
}	


