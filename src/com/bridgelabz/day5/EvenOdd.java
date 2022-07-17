package com.bridgelabz.day5;

import java.util.Scanner;

/**
 * 
 * @author LENOVO
 *
 */
public class EvenOdd {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * input a number from user
		 * checking whether the number is even and odd
		 */
		System.out.println("Enter a number");
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		if (x % 2 == 0)
			System.out.println(x + " is Even");
		else
			System.out.println(x + " is Odd");
		sc.close();
	}

}