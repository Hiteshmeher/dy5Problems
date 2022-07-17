package com.bridgelabz.day5;

import java.util.Scanner;
/**
 * 
 * @author LENOVO
 *
 */
public class PowerOfTwo {
/**
 * 
 * @param args
 */
	public static void main(String[] args) {
		/**
		 * initialize power is 1
		 * taking the power of 2 as n
		 * calculating 2^n and returns its value
		 */
		int power = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter power of 2 ");
		int n = sc.nextInt();
		int i = 1;
		while (i <= n) {
			if (0 <= n && n <= 31)
				power = 2 * power;
			i++;
		}
		System.out.println("2 ^ " +(i-1)+ " is "+power);
		sc.close();
	}
}