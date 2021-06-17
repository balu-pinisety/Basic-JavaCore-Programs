package com.basicPrograms;

/**
 * @author BALU
 * Program to Calculate Windchill using Equation
 */
public class WindChill {
	public static void main(String[] args) {
		// Welcome message
		System.out.println("Calculating WindChill using Equation");
		// Asking user to print values
		System.out.println("Enter the value of temperature 't' (<50) in Fahrenheit");
		int t=Utility.getUserInteger();
		System.out.println("Enter the value of speed 'v' (3<'v'<120) in Fahrenheit");
		int v=Utility.getUserInteger();
		//Calling function to calculate windChill
		windChill(t,v);
	}
	
	/**
	 * Calculating Wind Chill
	 * @param t, v
	 */
	private static void windChill(int t,int v) {
		if(t<50 && v>3 && v<120)
		{
			double w=35.74+0.6215*t+(0.4275*t-35.75)*Math.pow(v,0.16);
			String windchill = String.valueOf(w);
			System.out.println("WindChill is "+windchill);
		}
		else
		{
			System.out.println("Enter the values of temperature and speed in given range");
		}
	}

}
