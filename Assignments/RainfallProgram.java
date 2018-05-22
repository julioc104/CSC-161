// Julio Collado
// problem #1 page 488 Rainfall class
// CSC-161-03
// 4/12/2018

import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.*;
import java.util.Random;

public class RainfallProgram
{
	public static void main(String[] args) throws IOException
	{
		Rainfall yearOne = new Rainfall();

		yearOne.fillArray();
		displayRainfall(yearOne);
	}

	public static void displayRainfall (Rainfall year) {
		String maxMonth;
		String leastMonth;


		System.out.print("\n\nThe total rainfall for this year is: ");
		System.out.printf("%5.2f ",year.yearlyTotalRainfall());	

		System.out.print("\n\nThe average monthly rainfall is: ");
		System.out.printf("%5.2f ",year.averageMonthlyRainfall());

		maxMonth = checkMonth(year.mostRain() + 1);
		System.out.println("\n\nThe month with the most rain is " + maxMonth + ". The value is " + year.mostRainValue());
		leastMonth = checkMonth(year.leastRain() + 1);
		System.out.println("\nThe month with the least rain is " + leastMonth + ". The value for that month is " + year.leastRainValue() + "\n");

	}
	public static String checkMonth (int month) {
		String retValue = "";

		switch (month) {
			case 1 :
				retValue = "January";
				break;
			case 2 :
				retValue = "February";
				break;
			case 3 :
				retValue = "March";
				break;
			case 4 :
				retValue = "April";
				break;
			case 5 :
				retValue = "May";
				break;
			case 6 :
				retValue = "June";
				break;
			case 7 :
				retValue = "July";
				break;
			case 8 :
				retValue = "August";
				break;
			case 9 :
				retValue = "September";
				break;
			case 10 :
				retValue = "October";
				break;
			case 11 :
				retValue = "November";
				break;
			default :
				retValue = "December";
				break;
		}
		return retValue;
	}
}