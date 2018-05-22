// Julio Collado
// pg 315 #10 Stock Profit
// CSC-161-03
// 3/6/18

import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.*;
import java.util.Random;

public class StockProfit
{
	public static void main(String[] args) throws IOException
	{
		Scanner keyboard = new Scanner(System.in);

		final double COMMISSION_RATE = 0.05;

		int numberOfShares;
		double purchasePrice;
		double purchaseCommission;
		double salePrice;
		double saleCommission;
		double profit;

		do {
			System.out.print("\n\nEnter the number of shares (must be greater than zero) : ");
			numberOfShares = keyboard.nextInt();
		} while(numberOfShares <= 0);
		

		do {
			System.out.print("Enter the purchase price per share (must be greater than zero) : ");
			purchasePrice = keyboard.nextDouble();
		} while(purchasePrice <= 0);
		


		purchaseCommission = COMMISSION_RATE * (numberOfShares * purchasePrice);

		do {
			System.out.print("Enter the sale price per share (must be greater than zero) : ");
			salePrice = keyboard.nextDouble();
		} while(salePrice <= 0);

		saleCommission = COMMISSION_RATE * (numberOfShares * salePrice);

		profit = calculateProfit(numberOfShares,purchasePrice,purchaseCommission,salePrice,saleCommission);
		
		profitOrLoss(profit);	
	}

	public static double calculateProfit(int ns, double pp, double pc, double sp, double sc) {
		double profit;

		profit = ((ns * sp) - sc) - ((ns * pp) + pc);

		return profit;
	}

	public static void profitOrLoss (double profit) {
		if (profit > 0) {
			System.out.printf("The sale of the stock $%4.2f", profit);
			System.out.print(" resulted in a profit.\n\n");
		}
		else {
			System.out.printf("The sale of the stock -$%4.2f", profit * (-1));
			System.out.print(" resulted in a loss.\n\n");
		}
	}
}

