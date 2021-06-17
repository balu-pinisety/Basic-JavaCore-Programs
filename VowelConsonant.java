package com.basicPrograms;

/**
 * @author BALU
 * Program to Check Whether an Alphabet is Vowel or Consonant
 */
public class VowelConsonant {

	/**
	 * Asking the user to enter the Alphabet
	 * Checking whether the given alphabet is Vowel or Consonant
	 * @param ch
	 */
	public static void main(String[] args) {
		// Displaying the Welcome message
		System.out.println("Checking whether the alphabet is Vowel or Consonant");
		// Asking the user to enter the Alphabet
		System.out.println("Enter the alphabet: ");
		char ch=Utility.getUserChar();
		// Checking whether the given alphabet is Vowel or Consonant
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
			System.out.println("The given alphabet '"+ch+"' is a Vowel");
		} else {
			System.out.println("The given alphabet '"+ch+"' is a Consonant");
		}
	}
}
