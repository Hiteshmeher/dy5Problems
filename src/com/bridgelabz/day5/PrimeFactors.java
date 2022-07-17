package com.bridgelabz.day5;

import java.util.Scanner;
/**
 * 
 * @author LENOVO
 *
 */
public class PrimeFactors {
/**
 * 
 * @param args
 */
	public static void main(String[] args) {
		/**
		 * input a number from user
		 * calculating its prime factor and printing
		 */
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number ");
		int n = sc.nextInt();
		System.out.println("Prime Factors are ");
		for (int i = 2; i <= n; i++) {
			if (n % i == 0) {
				System.out.print(" " + i);
				n = n / i;
				i = 1;
			}
		}
		sc.close();
	}
}