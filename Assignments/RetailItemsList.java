// Julio Collado
// pg 397 problem 4.
// CSC-161-03
// 4/4/18

import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.*;
import java.util.Random;

public class RetailItemsList
{
	public static void main(String[] args) throws IOException
	{
		File fn = new File("itemsList.txt");
		Scanner infile = new Scanner (fn);

		PrintWriter output = new PrintWriter("itemsTable.txt");

		RetailItem item = new RetailItem();

		displayHeading(output);

		while (infile.hasNext()) {
			fillItem(infile,item);
			displayItem(item,output);
		}

		infile.close();
		output.close();
	}

	public static void fillItem (Scanner indata, RetailItem i) {
		i.setDescription(indata.nextLine());
		i.setUnitsOnHand(indata.nextInt());
		i.setPrice(indata.nextDouble());
		indata.nextLine();		// absorb extra carriage return
	}

	public static void displayHeading (PrintWriter outputFile) {
		String outStr = String.format("%-15s  %-4s    %-8s","Description","Quantity","Price");

		outputFile.println(outStr);
		outputFile.println("-----------------------------------");
	}

	public static void displayItem (RetailItem i, PrintWriter outputFile) {
		String outStr = String.format("%-15s  %4d      %6.2f\n",i.getDescription(),i.getUnitsOnHand(),i.getPrice());
		outputFile.println(outStr);
	}
}

