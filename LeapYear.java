package com.basicPrograms;
/**
 * @author BALU
 * Program to check whether given year(4 digit value) is leap year or not
 */
public class LeapYear {
	
	//Variable
	private static int year;
	public static void main(String[] args) {
		//Displaying Welcome message
		System.out.println("Checking given year is leap year or not");
		userInputyear();
		leapYearCheck();
	}
	
	/**
	 * Asking user for the year and asks again if its not 4 digit value
	 * @param year
	 */
	private static void userInputyear() {
		//Asking user for the year 
		System.out.println("Enter the Year(4 digit value):");
		year=Utility.getUserInteger();
		if (year<1000 || year>9999) {
			System.out.println("The year must be of 4 digit value");
			userInputyear();
		}
	}
			
	/**
	 * Checking whether the giver is leap year or not and Printing it
	 */
	private static void leapYearCheck () {
		if (year%4==0 && (year%100!=0 || year%400==0)) {
			System.out.println(year+" is a Leap Year");
		} else {
			System.out.println(year+" is not a Leap Year");
		}
	}
}
