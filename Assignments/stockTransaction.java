// Julio Collado
// page 108 #19 This program determines the amount of profit that joe made.
// CSC 161-03
// 1/30/18


import javax.swing.JOptionPane;

public class stockTransaction
{
	public static void main(String[] args)
	{

		double price_per_stock_purchased;
		double percent_commission;			// the percentage of the commission that Joe must pay to his stock broker.
		double price_paid;
		double price_sold;
		double price_per_stock_sold;		// The price Joe sold each stock for.
		double commission_amount1;			// Commision amount paid after purchasing & selling his share
		double commission_amount2;			// Commission amount paid after selling his share.
		double profit;

		int stocks_purchased;
		int stocks_sold;

		String str;

		// Get Data

		str = JOptionPane.showInputDialog("Enter the number of shares that Joe purchased:  ");
		stocks_purchased = Integer.parseInt(str);

		str = JOptionPane.showInputDialog("Enter the price that each share was purchased for: ");
		price_per_stock_purchased = Double.parseDouble(str);

		str = JOptionPane.showInputDialog("Enter the amount of commission rate:  ");
		percent_commission = Double.parseDouble(str);

		str = JOptionPane.showInputDialog("Enter the number of shares that Joe sold:  ");
		stocks_sold = Integer.parseInt(str);

		str = JOptionPane.showInputDialog("Enter the price that each share was sold for:  ");
		price_per_stock_sold = Double.parseDouble(str);

		// Calculations

		price_paid = stocks_purchased * price_per_stock_purchased;
		commission_amount1 = price_paid * percent_commission;
		price_sold = stocks_sold * price_per_stock_sold;
		commission_amount2 = price_sold * percent_commission;
		profit = (price_sold - price_paid) - commission_amount1 - commission_amount2;

		// information displayed

		JOptionPane.showMessageDialog(null, "The amount of money Joe paid for the stock:   $" + price_paid);
		JOptionPane.showMessageDialog(null, "The amount of commission Joe paid his broker when he bought the stock:  $" + commission_amount1);
		JOptionPane.showMessageDialog(null, "The amount that Joe sold the stock for:  $" + price_sold);
		JOptionPane.showMessageDialog(null, "The amount of commission Joe paid his broker when he sold the stock:  $" + commission_amount2);
		String outStr;
		outStr = String.format("The amount of profit that Joe made is $%5.2f",profit);
		JOptionPane.showMessageDialog(null,outStr);

		if(profit >= 0) {
			JOptionPane.showMessageDialog(null, "YOU MADE A PROFIT!");
		}
		
		}
	}

}


/*
Get the number of shares purchased
Get the price that each share was purchased for
Get the commission Rate
Get the number of shares sold
Get the price that each share was sold for

Calculate the amount paid for the stock = shares purchased * price of each one purchased
Calculate the commission when purchased = amount paid * commission rate
Calculate the amount sold for the stock = shares sold * price of each one sold
Calculate the commission when sold = amount sold * commission rate
Calculate the profit being made = (amount sold - amount paid) - commission when purchased - commission when sold

Display the amount paid for the stocks
Display the commission paid when purchased
Display the amount sold for the stocks
Display the commission paid when sold
Display the profit made
*/

