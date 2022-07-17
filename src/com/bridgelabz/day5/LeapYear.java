package com.bridgelabz.day5;

import java.util.Scanner;

/**
 * 
 * @author LENOVO
 *
 */
public class LeapYear {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * Initializing length is 4
		 * input year from user
		 * checking the year is of 4 digit or not
		 * if year is  4 digits then checking year is leap year or not
		 */
		int length = 4;
		System.out.println("Enter the Year ");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		int yearLength = String.valueOf(year).length();
		if (length == yearLength) {

			if (year % 4 == 0) {
				System.out.println(year + " is a leap year.");
			} else if (year % 400 == 0) {
				System.out.println(year + " is a leap year.");
			} else if (year % 100 == 0) {
				System.out.println(year + " is not a leap year.");
			} else {
				System.out.println(year + " is not a leap year.");
			}
		} else {
			System.out.println("Invalid Input !!!!! \nPlease input 4 digits number as year");
		}
		sc.close();
	}
}