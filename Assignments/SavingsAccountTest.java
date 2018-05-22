// Julio Collado
// problem #12 Savings account page 400
// CSC-161-03
// 4/10/18

import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.*;
import java.util.Random;

public class SavingsAccountTest
{
	public static void main(String[] args) throws IOException
	{
		double startingBalance;
		double annualInterestRate;
		double depositAmount;
		double withdrawAmount;
		int months;

		Scanner keyboard = new Scanner(System.in);

		System.out.println();

		System.out.print("Enter the starting balance: $");
		startingBalance = keyboard.nextDouble();

		System.out.print("Enter the annual interest rate: ");
		annualInterestRate = keyboard.nextDouble();

		System.out.print("Enter the number of months: ");
		months = keyboard.nextInt();

		SavingsAccount myAccount = new SavingsAccount(startingBalance);

		myAccount.setAnnualInterestRate(annualInterestRate);

		for (int i = 1; i <= months; i++) {
			System.out.print("Enter the amount to deposit for the month " + i + " : $");
			depositAmount = keyboard.nextDouble();
			myAccount.deposit(depositAmount);

			System.out.print("Enter the amount to withdraw for the month " + i + " : $");
			withdrawAmount = keyboard.nextDouble();
			myAccount.withdraw(withdrawAmount);

			myAccount.calculateMonthlyInterest();
		}
		myAccount.displayData();
	}
}

