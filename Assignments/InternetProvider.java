// Julio Collado
// Internet Service Provider pg 188 #13, This program calculates the monnthly bill corresponding to the package the user has chosen.
// CSC-161-03
// 2/13/18

import java.util.Scanner;
import javax.swing.JOptionPane;

public class InternetProvider
{
	public static void main(String[] args)
	{
		char internetPackage;
		int hours = 0;
		double totalCharges;

		String input;				// holds temporary string

		Scanner keyboard = new Scanner(System.in);

		System.out.print("\n\n\nEnter the letter corresponding to the package you purchased: ");
		input = keyboard.nextLine();
 		// takes in input as a string
		internetPackage = input.charAt(0); // looks at the first position in the string only

		     //  true					false						
		if (internetPackage != 'C' && internetPackage != 'c') {
			System.out.print("Enter the number of hours that were used: ");
			hours = keyboard.nextInt();
		}		

		totalCharges = calculatingCosts(internetPackage,hours);			// calls method passes two variables

		System.out.printf("Your Monthly Bill is $%5.2f\n\n\n",totalCharges);
		
	}

	public static double calculatingCosts(char packageLetter, int hours) {
		final double PACKAGE_A_STANDARD_PRICE = 9.95;
		final double PACKAGE_B_STANDARD_PRICE = 13.95;
		final double PACKAGE_C_STANDARD_PRICE = 19.95;
		double additionalCosts = 0;
		double monthlyBill = 0;

		if (packageLetter == 'A' || packageLetter == 'a') {
			monthlyBill = PACKAGE_A_STANDARD_PRICE;
			if (hours > 10) {
				additionalCosts = (hours - 10) * 2;
				monthlyBill += additionalCosts;		// monthlyBill = monthlyBill + additionalCosts
			}
		}

		if (packageLetter == 'B' || packageLetter == 'b') {
			monthlyBill = PACKAGE_B_STANDARD_PRICE;
			if (hours > 20) {
				additionalCosts = hours - 20;
				monthlyBill += additionalCosts;
			}
		}
		if (packageLetter == 'C' || packageLetter == 'c') {
			monthlyBill = PACKAGE_C_STANDARD_PRICE;
		}
	return monthlyBill;
	}
}




/*
Ask user to enter the letter of the package they entered. (A B or C)
ask user to input the number of hours that were used


Package A: 
			
			if hours > 10
			additional hours = hours - 10
			additionalCosts = additional hours * $2 

			monthlyBill = standardCosts + additionalCosts

	repeat process for package B & C if needed

display montlyBill
*/