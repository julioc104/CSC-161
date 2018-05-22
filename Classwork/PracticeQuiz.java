// Julio Collado
// practice quiz
// CSC-161-03
// 3/27/18

import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.*;
import java.util.Random;

public class PracticeQuiz
{
	public static void main(String[] args) throws IOException
	{
		String SKU = "";
		int quantity = 0;
		double cost = 0.0;
		double price = 0.0;
		double profit = 0.0;

		// summary variable

		int SKUcnt = 0;
		double totCost = 0.0;
		double totProfit = 0.0;

		PrintWriter reportFile = new PrintWriter("profitreport.txt");

		Scanner keyboard = new Scanner(System.in);

		displayHeading(reportFile);
		do {
			SKU = getSKU(keyboard);
			quantity = getQuantity(keyboard);
			cost = getCost(keyboard);
			price = getPrice(keyboard);
			profit = quantity * (price - cost);

			SKUcnt++;
			totCost += (cost * quantity);
			totProfit += profit;

			//System.out.println("Test Quantity: " + getQuantity(keyboard));

			displaySKU(reportFile,SKU,quantity,cost,price,profit);
			// absorb extra carridge return before SKU due to mixed type input
			keyboard.nextLine();
		} while(done(keyboard) == 'N');
		displaySummary(reportFile,SKUcnt,totCost,totProfit);

		reportFile.close();
	} //end main

	public static char done (Scanner kbd) {
		char inChar = ' ';
		String inStr = " ";
		do {
			System.out.print("Have you finished entering items? (Y)es or (N)o ");
			inStr = kbd.nextLine();
			inChar = inStr.toUpperCase().charAt(0);

		} while(!((inChar == 'Y') || (inChar == 'N')));

		return inChar;
	}	// end done

	public static void displayHeading(PrintWriter output) {
		output.println();
		output.println();

		String fStr = "%5s     %4s     %8s    %9s    %9s";
		String oStr = String.format(fStr,"SKU","Quant","Cost","Price","Profit");

		output.println(oStr);
		output.println();
	}	// end displayHeading

	public static void displaySKU (PrintWriter output, String s, int q, double c, double p, double pr) {
		String fStr = "%5s     %4d     %6.2f    %7.2f    %7.2f";
		String oStr = String.format(fStr,s,q,c,p,pr);

		output.println(oStr);

	} // end displaySKU

	public static void displaySummary (PrintWriter output, int tSku, double tCost, Double tProfit) {
		String oStr = String.format("The total SKU count is %4d",tSku);
		output.println();
		output.println();
		output.println(oStr);

		oStr = String.format("The total cost is      %7.2f",tCost);
		output.println(oStr);

		oStr = String.format("The total Profit is    %7.2f",tProfit);
		output.println(oStr);
	} // end displaySummary

	public static String getSKU (Scanner kbd) {
		String retValue = "";

		do {
			System.out.print("Enter SKU: ");
			retValue = kbd.nextLine();
			if(retValue.equals(""))
				System.out.println("SKU must be non-blank");
		} while(retValue.equals(""));

		return retValue;
	}	// end getSku
 

	public static int getQuantity(Scanner kbd) {
		int retValue = 0;

		do {
			System.out.print("Enter Quantity: ");
			retValue = kbd.nextInt();
			if(retValue < 0)
				System.out.println("Quantity cannot be less than zero");
		} while(retValue < 0);

		return retValue;
	} // end getQuantity

	public static double getCost(Scanner kbd) {
		double retValue = 0.0;

		do {
			System.out.print("Enter Cost: ");
			retValue = kbd.nextDouble();
			if(!(retValue > 0.0))
				System.out.println("Cost must be greater than zero");
		} while(!(retValue > 0.0));

		return retValue;
	} // end getCost

	public static double getPrice(Scanner kbd) {
		double retValue = 0.0;

		do {
			System.out.print("Enter Price: ");
			retValue = kbd.nextDouble();
			if(!(retValue > 0.0))
				System.out.println("Price must be greater than zero");
		} while(!(retValue > 0.0));

		return retValue;
	}	// end getPrice

}

