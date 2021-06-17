package com.basicPrograms;
/**
 * @author BALU
 *Program to find Prime factors of a number
 */
public class PrimeFactors {
	/**
	 * Asking User for the number
	 * Printing the Prime factors of number by computing it
	 * @param number
	 */
	public static void main(String[] args) {
		// Displaying Welcome message
		System.out.println("Finding the Prime Factors of a Number");
		// Asking User for the number
		System.out.println("Enter the number to find prime factors: ");
		int number=Utility.getUserInteger();
		// Printing the Prime factors
		System.out.println("Prime factors for Number "+number+":");
		// Finding the prime factors by computing
		for(int i=2; i<=number; i++) {
			while(Utility.getRemainder(number, i) == 0) {
				System.out.print(i+" ");
				number=Utility.getQuotient(number, i);
			}
		}
	}
}
