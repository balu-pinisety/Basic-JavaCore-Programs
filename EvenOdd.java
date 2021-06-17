package com.basicPrograms;
/**
 * @author BALU
 * Program to find given number is Even or Odd
 */
public class EvenOdd {
	/**
	 * Asking the user for number
	 * Checking whether then the number is Even or Odd
	 * @param number
	 */
	public static void main(String[] args) {
		// Displaying Welcome Message
		System.out.println("Checking whether the number is Even or Odd");
		// Asking user for the number
		System.out.println("Enter the number: ");
		int number=Utility.getUserInteger();
		// Checking whether then the number is Even or Odd
		if(Utility.getRemainder(number, 2)==0) {
			System.out.println(number+" is a Even Number");
		} else {
			System.out.println(number+" is an Odd Number");
		}
	}
}
