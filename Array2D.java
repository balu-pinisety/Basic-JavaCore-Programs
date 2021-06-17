package com.basicPrograms;
/**
 * @author BALU
 * Program to print 2 dimensional Array
 */
public class Array2D {
	
	/**
	 * Asking user for enter no.of Rows and Columns
	 * Calling function to print array values
	 * @param m,n
	 */
	public static void main(String[] args) {
		// Displaying Welcome Message
		System.out.println("Progam for 2 Dimensional array");
		// Asking user for enter no.of Rows and Columns
		System.out.println("Enter the no.of Rows: ");
		int m=Utility.getUserInteger();
		System.out.println("Enter the no.of Columns: ");
		int n=Utility.getUserInteger();
		// Calling function to print array values
		array2D(m,n);
	}
	
	/**
	 * Pints the 2Dimensional array
	 * @param m,n
	 */
	public static void array2D(int m,int n) {
		// creating the 2D array
		int[][] arr = new int [m][n];
		int k=1;
		for(int i=0; i < m; i++)
		{
			for(int j=0; j < n; j++)
			{
				arr[i][j]=k;
				//Printing the 2D array
				System.out.print("arr[" + i + "][" + j + "]="+ arr[i][j] + "  ");
				k++;
			}
			System.out.println();
		}
	}
}
