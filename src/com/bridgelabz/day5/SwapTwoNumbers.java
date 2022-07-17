package com.bridgelabz.day5;

import java.util.Scanner;
/**
 * 
 * @author LENOVO
 *
 */
public class SwapTwoNumbers {
/**
 * 
 * @param args
 */
	public static void main(String[] args) {
		/**
		 * taking two numbers from user
		 * swapping two numbers
		 */
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number a = ");
		int a = scanner.nextInt();
		System.out.println("Enter second number b =  ");
		int b = scanner.nextInt();

		System.out.println("Before Swap ");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("After Swap ");
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		scanner.close();
	}

}