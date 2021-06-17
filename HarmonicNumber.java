package com.basicPrograms;
/**
 * @author BALU
 * Program to print the Nth Harmonic number and computing its value
 */
public class HarmonicNumber {

	/**
	 * Asking the user for number
	 * Printing the Nth Harmonic number
	 * Computing the Harmonic number value
	 * @param number
	 */
	public static void main(String[] args) {
		//Displaying Welcome Message
		System.out.println("Printing the Nth Harmonic Number\n");
		//Asking User for the number
		System.out.println("Enter the number(>0) to print the Harmonic Value:");
		int number=Utility.getUserInteger();
		double H = 1;
		System.out.print("\nHarmonic number of position "+number+" is  1/1");
		for(int i=2;i<=number;i++)
		{
			System.out.print(" + 1/"+i);
			H=(double) 1/i+H ;
		}
		System.out.println("\nIts value is "+H);
	}
}
