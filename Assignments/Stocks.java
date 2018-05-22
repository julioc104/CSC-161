import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.*;

public class Stocks {
	private String[] symbol = new String[5];
	private double[] price = new double[5];
	private long[] sharesSold = new long[5];
	private char[] initialSE = new char[5];

	public Stocks () {
		for (int idx = 0; idx < symbol.length; idx++) {
			symbol[idx] = "";
			price[idx] = 0.0;
			sharesSold[idx] = 0;
			initialSE[idx] = ' ';
		}
	}

	public void fillAray (Scanner infile) {
		int idx = 0;
		String input = " ";
		while (infile.hasNext()) {
			symbol[idx] = infile.nextLine();
			price[idx] = infile.nextDouble();
			sharesSold[idx] = infile.nextLong();
			infile.nextLine();
			input = infile.nextLine();
			initialSE[idx] = input.charAt(0);
			idx++;
		}
	}

	public void optionOne () {
		System.out.println("\t\t Report File");
		System.out.println();
		System.out.printf("%-7s    %7s   	%6s	 %8s\n\n","Symbol","price","shares sold","Stock Exchange(I)");

    	for (int idx = 0; idx < symbol.length; idx++) {
				System.out.printf("%-7s     %-9.2f      %-9d   		%-4c\n", symbol[idx], price[idx], sharesSold[idx], initialSE[idx]);
    	}
    	System.out.println();
    	System.out.println("-------------------------------------------------------------------------");
	}

	public double optiontwo() {
		String symbolEntered = "";

		symbolEntered = JOptionPane.showInputDialog("Enter the symbol of the stock to find its price : ");

		return findSymbolIndex(symbolEntered);
	}

	public double findSymbolIndex (String symbolEntered) {
		int returnIndx = -1;
		for (int idx = 0; idx < symbol.length; idx++) {
			if (symbol[idx].equalsIgnoreCase(symbolEntered)) {
				returnIndx = idx;
			}
		}

		if (returnIndx == -1) {
			JOptionPane.showMessageDialog(null,"The stock symbol you entered is not valid.");
		}
		// returns -1 when option is invalid
		return getPrice(returnIndx);
	}

	public double getPrice (int index) {
		// special case to handled invalid symbol
		if (index == -1) {
			return index;
		}

		return price[index];
	}
}