/**
 * 
 */

/**
 * Write a program to print the sum of two numbers without using + operator. Other operators have to be used. 
 * All the comments in the program will be placed on the Right-Hand-Side.
 * @author Sahil Khurana <sahilkhurana369@gmail.com>
 *
 */

import java.util.Scanner;													// This will import the Scanner class
public class Assignment1_2_Sum_Of_Integers      {							// Proper naming conventions is used for Class Declaration
       public static void main(String[] args) {								// Main methods Starts				
              int a,b,c;													// Three Integers(Variable) Declaration a,b and c
              Scanner sc=new Scanner(System.in);							// Initialize the scanner to get input from User
              System.out.println("Enter the first number");					// This will print out the argument and ends the line
              a=sc.nextInt();												// Read input of a as integer from the User
              System.out.println("Enter the second number");				// This will print out the argument and ends the line
              b=sc.nextInt();												// Read input of b as integer from the User
				while(a--!=0)												// While loop Expression to check the value of a till it become 0 and Adding the value in b.				{
				{
					b++;
				}
			System.out.println("Addition of two numbers is : "+b);			// Printing the Sum of two Integers 
       }																	// Main methods Closed
}																			// Class closed
