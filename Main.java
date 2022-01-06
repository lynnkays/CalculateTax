/*******************************************************************
* CalculateTax.java
*
*<Takes in user input and calculates the tax amount of the purchase and
the total in three different formats>
*******************************************************************/

//Add import line here to use the Scanner class
import java.text.DecimalFormat;
import java.util.*;


public class Main {
	public static void main(String[] args)
	{
	//Declare a scanner object here to be used for input
	Scanner s = new Scanner (System.in);
	
	String input;  //read in user input as a string
	double price = 0;  //price of purchase item
	int qty = 0;       //number of items purchased
	double tax = 0;   //tax rate as a decimal value 
	
	
	System.out.print("Price of purchased item:  ");  
	input = s.nextLine();

	// Convert string to double and store in price variable
	price = Double.parseDouble (input);
	
	System.out.print("Quantity:  "); 
	input = s.nextLine();

	// Convert string to integer and store in qty variable
	qty = Integer.parseInt(input);

	System.out.print("Tax Rate (As a decimal):  "); 
	input = s.nextLine();

	// Convert string to double and store in tax variable
	tax = Double.parseDouble (input);
	tax = tax * (price * qty);
	
	// Displays the tax amount 
	System.out.printf("Total Tax Amount = $%.2f\n", tax);
	
	// Displays final amount
	System.out.println("Total purchase order = $" + ((tax + (price * qty) )));
	
	// Display the final amount with decimals using printf
	System.out.printf("Total purchase order =  $%.2f\n", tax + (price * qty));
	
	// Display the final amount with decimals using String.format
	String output = String.format("Total purchase order = $%.2f\n", tax + ( price * qty));
	System.out.printf(output);
	} 
}