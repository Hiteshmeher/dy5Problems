package com.bridgelabz.day5;

import java.util.Scanner;

/**
 * 
 * @author LENOVO
 *
 */
public class FlipCoin {
	/**
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		/**
		 * taking the number of times for coin to be flipped as x.
		 * initializing heads count and tails count as 0.
		 * calculating the counts for both heads and tails.
		 * printing the number of times head and tail occurs.
		 * calculating the percentage of heads and tails.
		 * 
		 */
		int x, headscount = 0, tailscount = 0;
		double heads, tails;
		System.out.print("Enter the number of times you want to flip the coin\n ");
		Scanner n = new Scanner(System.in);
		x = n.nextInt();
		for (int i = 0; i < x; i++) {
			double random = Math.random();
			if (random < 0.5)
				tailscount++;
			else
				headscount++;
		}
		System.out.println("Number of times Head occures " + headscount);
		System.out.println("Number of times Tail occures " + tailscount);

		heads = headscount / (double) x * 100;
		tails = tailscount / (double) x * 100;
		
		System.out.println("\n<<<<< Calculating Percentage >>>>>");
		System.out.println("Percentage of heads -> " + heads + " %");
		System.out.println("Percentage of tails -> " + tails + " %");
		n.close();
	}
}