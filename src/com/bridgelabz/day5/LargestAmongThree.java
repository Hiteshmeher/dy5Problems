package com.bridgelabz.day5;

import java.util.Scanner;

/**
 * 
 * @author LENOVO
 *
 */
public class LargestAmongThree {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * taking three numbers from user 
		 * calculating which number is greater
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number a = ");
		int a = scanner.nextInt();
		System.out.println("Enter second number b = ");
		int b = scanner.nextInt();
		System.out.println("Enter third number c = ");
		int c = scanner.nextInt();

		if (a > b && a > c) {
			System.out.println("Largest number is a = " + a);
		} else if (b > a && b > c) {
			System.out.println("Largest number is b = " + b);
		} else {
			System.out.println("Largest number is c = " + c);
		}
		scanner.close();
	}

}