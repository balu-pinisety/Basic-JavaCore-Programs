package com.basicPrograms;
/**
 * @author BALU
 * Program to Find the Largest Among Three Numbers
 */
public class BigOf3Integers {

	/**
	 * Asking user to enter the 3 numbers
	 * Finding the largest number
	 * @param a, b, c
	 */
	public static void main(String[] args) {
		// Displaying Welcome Message
		System.out.println("Program to Find the Largest Among Three Numbers");
		// Asking user to enter the 3 numbers
		System.out.println("Enter the First Number");
		int a=Utility.getUserInteger();
		System.out.println("Enter the Second Number");
		int b=Utility.getUserInteger();
		System.out.println("Enter the Third Number");
		int c=Utility.getUserInteger();
		// Finding the largest number
		if (a>b) {
			if(a>c) {
				System.out.println(a+" is the largest number");
			} else {
				System.out.println(c+" is the largest number");
			}
		} else if (b>c) {
			System.out.println(b+" is the largest number");
		} else {
			System.out.println(c+" is the largest number");
		}
	}

}
