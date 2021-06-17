package com.basicPrograms;

/**
 * @author BALU
 * Program to find Quotients and Remainders of a Number 
 */
public class QuotientRemainder {

	/**
	 * Asking the user do number
	 * Finding the Quotient and Remainder by computing
	 * Printing the values like tabular form
	 * @param number
	 */
	public static void main(String[] args) {
		// Displaying Welcome Message
		System.out.println("Finding the Quotient and Remiander of a number");
		// Asking User for the number
		System.out.println("Enter the number to find Quotient and Remiander");
		int number=Utility.getUserInteger();
		// Finding the Quotient and remainder and printing it
		for(int i=2; i<=number/2+1; i++) {
			int qtnt=Utility.getQuotient(number, i);
			int rmnd=Utility.getRemainder(number, i);
			System.out.println("For "+number+"/"+i+": Quotient = "+qtnt+"; Remainder is "+rmnd+";");
		}
	}
}
