package assignment4;

import java.util.Scanner;

public class FizzBuzz {

	
	 public static void main( String[] args)
	    {
	        Scanner keyboard = new Scanner(System.in);

	        int num;

	        System.out.print("Enter a number for printing fizzbuzz:");
	        num = keyboard.nextInt();

	        for (int i = 1; i <= num; i++) {

	            if (i % 3 == 0 && i % 5 == 0)
	                System.out.println("fizz buzz");
	            else if (i % 3 == 0 )
	                System.out.println("fizz");
	            else if (i % 5 == 0)
	                System.out.println("buzz");
	            else
	                System.out.println(i);
	        }
	    }
}
