package com.bridgelabz.day5;

import java.util.Scanner;

/**
 * 
 * @author LENOVO
 *
 */
public class QuotientAndRemainder {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * taking Dividend from user.
		 * taking divisor from user.
		 * calculating Quotient and Remainder.
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Divident ");
		int dividend = scanner.nextInt();
		System.out.println("Enter the Divisor ");
		int divisor = scanner.nextInt();

		int quotient = dividend / divisor;
		int remainder = dividend % divisor;
		System.out.println("The Quotient is = " + quotient);
		System.out.println("The Remainder is = " + remainder);
		scanner.close();
	}
}