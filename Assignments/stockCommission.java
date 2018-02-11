// Julio Collado
// page 107 #15 using scanner class for input
// CSC-161-03
// 1/30/18

import java.util.Scanner;

public class stockCommission
{
	
	public static void main(String[] args)
	{
		Scanner userInput = new Scanner(System.in);

		int stockAmount;
		double percentCommission;
		double pricePerShare;
		double priceWithoutCommission;
		double commissionAmount;
		double totalAmountPrice;

		// Get Data
		System.out.print("Enter the amount of stocks: ");
		stockAmount = userInput.nextInt();

		System.out.print("Enter the price per share: ");
		pricePerShare = userInput.nextDouble();

		System.out.print("Enter the percent commission: ");
		percentCommission = userInput.nextDouble();

		// Calculations
		priceWithoutCommission = stockAmount * pricePerShare; 
		commissionAmount = priceWithoutCommission * percentCommission;
		totalAmountPrice = priceWithoutCommission + commissionAmount;
		
		// display results
		System.out.println("The amount paid for the stock alone (without the commission) : $" + priceWithoutCommission);
		System.out.println("The amount of the commission : $" + commissionAmount);
		System.out.println("The total amount paid (for the stock plus the commission) : $" + totalAmountPrice + "\n");

	} // end main
} // end class


/*
Get the amount of stocks
Get the price per share
Get the percent commission

Calculate the cost of the stock = amount of stocks * price per share
Calculate the commission amount =  cost of stock * percent commission
Calculate the total price = cost of the stock + commission amount

Display the the amount paid without the commission
Display the amount of commission
Display the total amount paid including the commission
*/
