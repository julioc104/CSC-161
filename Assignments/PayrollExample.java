// Julio Collado
// payroll assignment pg 488 #2
// CSC-161-03
// 4/20/18

import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.*;
import java.util.Random;

public class PayrollExample
{
	public static void main(String[] args) throws IOException
	{
		Payroll payroll = new Payroll();
		Scanner keyboard = new Scanner(System.in);

		int hours;
		double payRate;
		double wages;
		int employeeID;

		for (int i = 0; i < 7; i++) {
			System.out.println("Employee #" + (i + 1));
			hours = returnHours(keyboard);
			payroll.setHours(i, hours);
			payRate = returnPayRate(keyboard);
			payroll.setPayRate(i, payRate);
			employeeID = payroll.getEmployeeId(i);
			wages = payroll.calculateGrossPay(employeeID);
			payroll.setWages(i, wages);
		}
		displayEmployeeWages(payroll);
	}

	public static int returnHours (Scanner kbd) {
		int hrs;
		do {
			System.out.print("\t\tHours: ");
			hrs = kbd.nextInt();
		} while (hrs < 0);	
		return hrs;	
	}
	public static double returnPayRate (Scanner kbd) {
		double rate;
		do {
			System.out.print("\t\tPay Rate: ");
			rate = kbd.nextDouble();
		} while (rate < 6.00);
		return rate;		
	}

	public static void displayEmployeeWages (Payroll pr) {
		System.out.println();
		for (int i = 0; i < 7; i++) {
			System.out.print("Employee ID: " + pr.getEmployeeId(i));
			System.out.println("\tGross Wages: " + pr.getWages(i));
		}
		System.out.println();
	}
}