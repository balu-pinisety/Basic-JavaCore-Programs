package com.basicPrograms;
/**
 * @author BALU
 * Program for printing the table for powers of 2 by taking user number (<31)
 */
public class PowersOf2 {
	
	//Variable
	private static int number;
	
	public static void main(String[] args) {
		System.out.println("Printing the table for Powers of 2");
		//Calling method for user input 
		userInputNumber();
		//Calling method to print table of pwers of 2
		powersOf2();
	}
	
	/**
	 * Asking user for the number and asks again if it is greatr than 31
	 * @param number
	 */
	private static void userInputNumber() {
		//Asking user for the number
		System.out.println("Enter the number(<31) to print powers of 2: ");
		number=Utility.getUserInteger();
		//Checking whether the number is negative or greater than 31
		if (number<0 || number>31) {
			System.out.println("The number must neither negative nor greater than 31");
			userInputNumber();
		}
	}		
		
	/**
	 * Computing the powers of 2 and printing the table of the values
	 */
	private static void powersOf2() {
		System.out.println("the table for powers of 2: ");
		for(int i=0;i<=number;i++) {
			int val= (int) Utility.getPowerDouble(2, i);
			System.out.println("2^"+i+" = "+val);	
		}
	}
}
