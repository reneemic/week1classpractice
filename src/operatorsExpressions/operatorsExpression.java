package operatorsExpressions;

import java.util.Scanner;

public class operatorsExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner input = new Scanner(System.in);
		
	// Has 40 dollars.
	int cashOnHand = 40;
	// Diapers are 8 dollars
	int diaperCost = 8;
	// Can purchase this many diapers.
	System.out.println("Travon can buy " + (cashOnHand / diaperCost) + " diapers");
			
	int sugar = 7;
	int alreadyHas = 2;
	System.out.println("Lisa needs to put in " + (sugar - alreadyHas) + " more cups of sugar");
	
	int friends = 3;
	int perPerson = 13;
	System.out.println ("The total bill was " + (friends * perPerson) + " dollars");
	
	int had = 29;
	int ending = 41;
	System.out.println("Trevon recieved "  + (ending - had) + " dollars for cleaning the attic");
	
	int julia = 47;
	int pranav = 30;		
	System.out.println("Pranav ran " + (julia - pranav) + " miles");
	
	int envelopes = 3;
	int cash = 12;
	System.out.println("You can buy " + (cash / envelopes) + " envelopes");
	
	 double salad = 5.12;
	 double norachai = 27.10;
	 System.out.println ("Norachai had " + (salad + norachai) + " before buying a salad");
	
	}

}
