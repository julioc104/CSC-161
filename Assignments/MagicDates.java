// Julio Collado
// pg 184 problem #2 Magic Dates, This program determines if a date entered is considered a "magic date" or not.
// CSC-161-03
// 2/1/2018

import java.util.Scanner;
import javax.swing.JOptionPane;

public class MagicDates
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		int month;
		int day;
		int year;

		int magicDate;

		System.out.print("Enter the month: ");
		month = keyboard.nextInt();

		System.out.print("Enter the day: ");
		day = keyboard.nextInt();

		System.out.print("Enter the year (in two digit form): ");
		year = keyboard.nextInt();

		magicDate = month * day;

		if(magicDate == year) {
			System.out.println("The date is magic.");
		}
		else {
			System.out.println("The date is not magic.");
		}

	}

}



/*
Ask the user to enter a month, a day, and a 2 digit year

if month * day == year
display message

if not
display message 
*/