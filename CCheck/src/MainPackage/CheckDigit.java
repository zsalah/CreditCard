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
	private static Scanner user_input;
	
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
			
			return true;
		
		}
		
		else {
			
			return false;
		}
		
	}
	
	public static void main(String[] args) {
		
		user_input = new Scanner(System.in);
		
		System.out.println("Type CCard # to Check its First Sum [second dight from the right]: ");
		CheckDigit.integer = user_input.next();
		
		int firstSum1 = CheckDigit.evenDigits(integer);
		int secondSum2 = CheckDigit.oddDigits(integer);
		int totalSum = CheckDigit.sumOfBothSums();
		boolean booleanCheck = CheckDigit.creditCardValidation();
		
		System.out.println("The First sum is: " + firstSum1);
		
		System.out.println("The Second sum is: " + secondSum2);
		
		System.out.println("The Total sum is: " + totalSum);
		
		System.out.println("Card Validation is " + booleanCheck);
		
		
		
		
	}
	
}
	