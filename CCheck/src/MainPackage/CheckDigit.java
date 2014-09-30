package MainPackage;
/*
 * Author Zulfiqar Salahuddin
 * Check if Credit Card is valid
 * Users input a long number
 * Program turns it into a string
 * for loop iterates over that string and does the neccessary math operations
 * if the total % 10 does not equal last digit of Credit Card Number then 
 * Card is invalid!
 */

import java.util.Scanner;

public class CheckDigit {
	
	static String integer;
	static int sum1 = 0;
	static int sum2 = 0;
	static String valid = " is Valid";
	static String notValid = " is not Valid";
	static int total = 0;
	
	public static int evenDigits(String integer) {
		
		for (int i = integer.length() - 2; i >= 0; i -= 2) {
			
			int getFirstNumbers = 2 * Character.getNumericValue(integer.charAt(i));

			String toString = Integer.toString(getFirstNumbers);
			
			for (int j = 0; j < toString.length(); j++) {
				
				int get_numbers = Character.getNumericValue(toString.charAt(j));
				
				sum1 += get_numbers;
				
			}
		}
		
		total += sum1;
		
		return sum1;
		
	}
	
	public static int oddDigits(String integer) {
		
		for (int j = integer.length() - 1; j >= 0; j -= 2) {
			
			sum2 += Character.getNumericValue(integer.charAt(j));
			
			
		}
		
		total += sum2;
		
		return sum2;
	}
	
	public static int sumOfBothSums() {
		
		return total;
	
	}
	
	public static boolean creditCardValidation() {
		
		if (total % 10 == 0) {
			
			System.out.println("Credit Card #" + integer + notValid);
			
			return false;
		
		}
		
		else {
			
			System.out.println("Credit Card #" + integer + valid);
			
			return true;
		}
		
	}
	
}
	