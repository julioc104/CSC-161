// Julio Collado
// pg 265 #12 Bar Chart
// CSC-161-03
// 3/6/18

import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.*;
import java.util.Random;

public class BarChart
{
	public static void main(String[] args) throws IOException
	{
		Random rNumber = new Random();
		int sales = 0;

		System.out.println("SALES BAR CHART");
		
		for(int store = 1; store < 6; store++) {

			sales = generateSales(rNumber);

			displayBar(sales,store);

			System.out.print(" $" + sales + "\n\n");

		}
	}

	public static int generateSales (Random rand) {
		int retValue = 0;

		do {
			retValue = rand.nextInt(10000);
		} while (retValue < 500);

		return retValue;

	}

	public static void displayBar (int salesIn,int storeIn ) {

		System.out.print("Store " + storeIn + ":");

		for(int i = 1; i <= salesIn/100; i++) {
			System.out.print("* ");
		}

	}
}


