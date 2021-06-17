package com.basicPrograms;

/**
 * @author BALU
 * Program to find Quadratic Roots
 */
public class QuadraticRoots {

	/**
	 * Asking user to print values
	 * Calling method to find Quadratic roots
	 * @param a, b, c
	 */
	public static void main(String[] args) {
		// Welcome message
		System.out.println("Calculating Quadratic Roots of Equation");
		// Asking user to print values
		System.out.println("Enter the value of 'a' in Qudratic equation:");
		int a=Utility.getUserInteger();
		System.out.println("Enter the value of 'b' in Qudratic equation:");
		int b=Utility.getUserInteger();
		System.out.println("Enter the value of 'c' in Qudratic equation:");
		int c=Utility.getUserInteger();
		System.out.println("The roots of the equation "+a+"x^2+"+b+"x+"+c+" are ");
		quadraticRoots(a,b,c);
	}
	
	/**
	 * Calculating Delta and Quadratic roots
	 * @param a, b, c
	 */
	private static void quadraticRoots(int a,int b,int c) {
		int Delta = b*b-4*a*c;
		// Checking for Delta Value
		if (Delta>=0)
		{	
			float Root1= (float) (-b+Math.sqrt(Delta))/(2*a);
			float Root2= (float) (-b-Math.sqrt(Delta))/(2*a);
			System.out.println("Root 1: "+Root1+" & Root 2: "+Root2);
		}
		else
		{
			System.out.println("Imaginary, Since Delta is <0");
		}
	}
}
