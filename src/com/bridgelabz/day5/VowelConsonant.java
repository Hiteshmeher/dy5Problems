package com.bridgelabz.day5;

import java.util.Scanner;

/**
 * 
 * @author LENOVO
 *
 */
public class VowelConsonant {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		/**
		 * taking an alphabet from user ( small letter )
		 * checking weather it is Vowel or Consonant
		 */
		System.out.println("Enter a Character as small letter");
		Scanner sc = new Scanner(System.in);
		char x = sc.next().charAt(0);
		if (x == 'a' || x == 'e' || x == 'i' || x == 'o' || x == 'u') {
			System.out.println("Entered Character is Vowel");
		} else {
			System.out.println("Entered Character is Consonant");
		}
		sc.close();
	}
}