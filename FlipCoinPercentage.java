package com.basicPrograms;
/**
 * @author BALU
 * Program for Flip Coin and printing percentage of Heads and Tails
 */
public class FlipCoinPercentage {
	/**
	 * @param flip: No.of flips by user;
	 * Computing the winning percentage of Heads and Tails by making count
	 */
	public static void main(String[] args) {
		//Displaying Welcome message
		System.out.println("Calculating Winning Percentage of Flip coin");
		//Asking user for no.of Flips
		System.out.println("Enter the number of times to Flip coin: ");
		int flip=Utility.getUserInteger();
		int head = 0,tail = 0;
		for(int i=0; i<flip;i++) {
			//Calling random by utility
			double random = Utility.getRandomDouble();
			if(random<0.5) {
				head++;
			} else {
				tail++;
			}
		}
		System.out.println("Head Count: "+head+" and Tail Count: "+tail);
		//Calculating Winning Percentage
		double headWin=Utility.getPercentageDouble(head,flip);
		double tailWin=Utility.getPercentageDouble(tail,flip);
		//Printing Winning Percentage
		System.out.println("Winning Percentage of Head: "+headWin);
		System.out.println("Winning Percentage of Tail: "+tailWin);
	}
}
