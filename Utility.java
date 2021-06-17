package com.basicPrograms;
import java.util.Scanner;
/**
 * @author BALU
 * Program for making utility of repeating functions or equations
 */
public class Utility {
	/**
	 * Scanner which can parse primitive types and strings
	 */
	private static final Scanner scan = new Scanner(System.in);
	/**
	 * Scanning of User input which is integer type
	 * @return assigned integer value
	 */
	public static int getUserInteger() {
		return scan.nextInt();
	}
	/**
	 * Calling of random function
	 * @return Double type Random value 
	 */
	public static double getRandomDouble() {
		return Math.random();
	}
	
	/**
	 * Calculates the Percentage Value
	 * @param part, whole
	 * @return Double type Percentage value
	 */
	public static double getPercentageDouble (double part,double whole) {
		return part*100/whole;
	}
	
	/**
	 * Calculates the Power of number
	 * @param number, power
	 * @return Double type Power value
	 */
	public static double getPowerDouble(double number, double power) {
		return Math.pow(number,power);
	}
	
	/**
	 * Calculates the Quotient of number
	 * @param dividend, divisor
	 * @return Integer type Quotient value
	 */
	public static int getQuotient(double dividend, double divisor) {
		return (int) (dividend/divisor);
	}
	
	/**
	 * Calculates the Remainder of number
	 * @param dividend, divisor
	 * @return Integer type Remainder value
	 */
	public static int getRemainder(double dividend, double divisor) {
		return (int) (dividend%divisor);
	}
}
