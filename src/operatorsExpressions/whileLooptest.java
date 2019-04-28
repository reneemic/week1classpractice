package operatorsExpressions;

import java.util.Scanner;

public class whileLooptest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner input = new Scanner(System.in);

		String responseColor;
		 do {
			   System.out.println("What is your favorite ROYGBIV color?.");
			   System.out.println("Type \"help\" to list options.");
			   responseColor = input.nextLine();
			   if(responseColor.toLowerCase().equals("help")) {
			   System.out.println("Options: red, orange, yellow, green, blue, indigo, violet");
			   }
			 } while(responseColor.equals("help"));
			   input.close();
		 
		  String car = (""); {
		   } if (responseColor.toLowerCase().equals("red")) {
		    car = "a Yugo";
		   } else if (responseColor.toLowerCase().equals("orange")){
		    car = "public transportation";
		   } else if (responseColor.toLowerCase().equals("yellow")) {
		    car = "a VW bus";
		   } else if (responseColor.toLowerCase().equals("green")) {
		     car = "a Lamborghini";
		   } else if (responseColor.toLowerCase().equals("blue")) {
		     car = "a Mitsubishi Eclipse";
		   } else if (responseColor.toLowerCase().equals("indigo")){
	         car = "a rusty bicycle";
	       } else if (responseColor.toLowerCase().equals("violet")){
	         car = "a 1977 Chrysler LeBaron";
		   }
		   {
		   System.out.println(car);
	}   
	}
}   			  
 
			
		

	


