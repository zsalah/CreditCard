package MainPackage;
/*
 * Author Zulfiqar Salahuddin
 * Check if Credit Card is valid
 * Users input a long number
 * Program turns it into a string
 * for loop iterates over that string and does the neccessary math operations
 * if the total % 10 does not equal 
 */

import java.util.Scanner;

public class CheckDigit {
	
		public static void main(String[] args) {

		Scanner input_user = new Scanner(System.in);
		String integer;
		
		System.out.println("Enter Credit Card number: ");
		integer = input_user.nextLine();
	
	long sum1=0;
	int sum2=0;
	
	String valid = " is Valid";
	String notValid = " is not Valid";
	
	for (int i = integer.length() -2 ; i >= 0; i-=2  ) {
		
	    	int multiply = 2 * Character.getNumericValue(integer.charAt(i));
	    	
		    	String toString= Integer.toString(multiply);
		    	
			    for (int j = 0; j < toString.length(); j++  ) {
			    	
			    	int get_number = Character.getNumericValue(toString.charAt(j));
		    	
			    	sum1 += get_number;
		    	
			    }
			    
		    }
	    
	   for (int j = integer.length() -1 ; j>=0; j-=2) {
		   
	    	sum2 = sum2 + Character.getNumericValue(integer.charAt(j));
	    	
	    }
	   
	    int total = (int) (sum1+sum2);

	    if (total%10 == 0 ) {
	    	
	    System.out.println("Credit Card #" + integer + valid);
	    
	    }   	  
		
	else {
		
	    System.out.println("Credit Card #" + integer + notValid);

		}
	    
	    System.out.println(total);

	}
}
