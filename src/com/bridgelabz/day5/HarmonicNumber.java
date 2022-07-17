package com.bridgelabz.day5;

import java.util.Scanner;
/**
 * 
 * @author LENOVO
 *
 */
public class HarmonicNumber {
/**
 * 
 * @param args
 */
	public static void main(String[] args) {
		/**
		 * initialize Harmonic number is 1
		 * raking the range for Harmonic number
		 * calculate the value
		 */
		double harmonicNumber = 1;
		System.out.println("Enter the Number ");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		for (int i = 1; i < n; i++) {
			harmonicNumber = (double) (harmonicNumber + (double) 1 / (i + 1));
		}
		System.out.println("Harmonic Value of " + n + " is " + harmonicNumber);
		scanner.close();
	}
}
