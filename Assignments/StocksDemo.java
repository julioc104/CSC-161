// Julio Collado
// lab quiz 3 
// CSC-161-03
// 4/26/18

import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.*;
import java.util.Random;

public class StocksDemo {
	public static void main(String[] args) throws IOException {
		File fn = new File("stocksData.dat");
		Scanner keyboard = new Scanner(fn);

		Stocks myStocks = new Stocks();

		int menuChoices = 0;

		myStocks.fillAray(keyboard);
		do {
			menuChoices = mainMenu();
			if (!(menuChoices >= 1 && menuChoices <= 3)) {
				JOptionPane.showMessageDialog(null,"Please enter a valid option from the main menu.");
			} else {
				optionSelected(menuChoices,myStocks);
			}
		} while (menuChoices != 3);
	}

	public static int mainMenu () {
		String tStr = "";
		int optionSelect;

		tStr = JOptionPane.showInputDialog("\t\t\t\t Main Menu \n \n \t 1) Run a report. \n \t 2) Find the price of a stock given by the symbol. \n \t 3) Exit. \n\n Please enter the number according to each choice : ");
		optionSelect = Integer.parseInt(tStr);

		return optionSelect;
	}

	public static void optionSelected (int number, Stocks stocks) {
		double priceOfStock;

		switch(number) {
			case 1:
				stocks.optionOne();
				break;
			case 2:
				priceOfStock = stocks.optiontwo();

				if (priceOfStock == -1) {
					break;
				}

				JOptionPane.showMessageDialog(null,"The price of the stock given by the symbol is " + priceOfStock);
				break;
			default:
				break;
		}
	}
}
