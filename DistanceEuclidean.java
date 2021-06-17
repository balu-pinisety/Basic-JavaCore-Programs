package com.basicPrograms;

/**
 * @author BALU
 * Program for Calculating Euclidean Distance
 */
public class DistanceEuclidean {

	/**
	 * Asking user to enter Cartesian point
	 * @param x, y
	 */
	public static void main(String[] args) {
		// Welcome Message
		System.out.println("Calculating Euclidean Distance\n");
		// Asking user to print values
		System.out.println("Enter the value of x in cartesian point:");
		int x=Utility.getUserInteger();
		System.out.println("Enter the value of y in cartesian point:");
		int y=Utility.getUserInteger();
		// Calling method to calculate Distance
		Eucl_dist(x,y);
	}
	
	/**
	 * @param x, y
	 * Calculating Distance
	 */
	private static void Eucl_dist(int x,int y) {
		float dist=(float) Math.sqrt((x*x)+(y*y));
		System.out.println("Euclidean Distance of ("+x+","+y+") is "+dist);
	}
}
