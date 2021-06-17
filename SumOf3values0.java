package com.basicPrograms;

/**
 * @author BALU
 * Program to find triplets that make Sum of three Integer adds to ZERO
 */
public class SumOf3values0 {

	/**
	 * Asking user to print no.of values
	 * Calling method to print the values and to find triplets
	 * @param number
	 */
	public static void main(String[] args) {
		// Printing the Welcome message
		System.out.println("Finding triplets that make Sum of three Integer adds to ZERO");
		// Asking user to enter the no.of values
		System.out.println("Enter the no. of Elements(>5): ");
		int number=Utility.getUserInteger();
		// Calling method to print the values and to find triplets
		triplets(number);
	}
	
	/**
	 * Printing the values
	 * @param number
	 */
	private static void triplets(int number) {
		int[]arr=new int[number];
		System.out.println("the values of "+number+" elements are: \n");
		for(int i=0;i<number;i++) {
			int rndm =(int) (Utility.getRandomDouble()*100)-50;
			arr[i]=rndm;
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		// Initializing the count for triplets 
		int count=0;
		// finding the triplets
		for(int a=0;a<(number-2);a++)
			for(int b=1;b<(number-1);b++)
				for(int c=2;c<(number);c++)
					if (arr[a]+arr[b]+arr[c]==0)
					{
						count++;
						System.out.println(count+":"+"{"+arr[a]+","+arr[b]+","+arr[c]+"}");
					}
		System.out.println("Total count of Triplets: "+count);
	}
}
