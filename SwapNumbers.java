package com.basicPrograms;

/**
 * @author BALU
 * Program for Swapping of 2 numbers with out using other variable
 */
public class SwapNumbers {
	
	/**
	 * Asking the user to give two numbers
	 * Swapping the numbers using addition
	 * @param x, y
	 */
	public static void main(String[] args) {
		//Displaying Welcome Message
		System.out.println("Swapping of 2 numbers with out other variable");
		//Asking User for First number
		System.out.println("Enter the number 'X': ");
		int x=Utility.getUserInteger();
		//Asking User for Second number
		System.out.println("Enter the number 'Y': ");
		int y=Utility.getUserInteger();
		//Swapping numbers with out using temp variable
		System.out.println("Value of X: "+x+" & Y: "+y+" before swaping");
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("Value of X: "+x+" & Y: "+y+" after swaping");
	}

}
