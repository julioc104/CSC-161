// Julio Collado
// exam problem #3 
// CSC-161-03
// 4/10/18

import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.*;
import java.util.Random;

public class SalesItemsProblem
{
	public static void main(String[] args) throws IOException
	{
		SalesItems myItem = new SalesItems("Clothes","Jeans",36.75,3);
		Scanner keyboard = new Scanner (System.in);
  		
  		String str;
  		int newNumber;
  
  		str = String.format("%8s		%7s		%4d		%5.2f", myItem.getItemId(), myItem.getItemDescription(), myItem.getQuantity(), myItem.totalValue());               
  		System.out.println(str); 

  		newNumber = returnNumber(keyboard);
	}

	 public static int returnNumber (Scanner kbd) {     
  		int number;                               
                                                
 		System.out.print("Enter a number: ");     
                                                
  		number = kbd.nextInt();
  		
  		if (number >= 1 && number <= 5) {
 			return number;
      }
  		else {
        System.out.println("ERROR: The number you entered is not between 1 & 5.");
      }
      return number;
    }
}

