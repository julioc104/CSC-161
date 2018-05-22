// Julio Collado
// pg 184 problem #1 Roman Numerals, This program display a roman numeral according to the number that was entered between 1-10
// CSC-161-03
// 2/1/2018

import java.util.Scanner;
import javax.swing.JOptionPane;

public class RomanNumerals
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		int numericNumber;

		System.out.print("Enter a number between 1 & 10 : ");
		numericNumber = keyboard.nextInt();

		if(numericNumber >= 1 && numericNumber <=10) {
		printRomanNumeral(numericNumber);
		}
		else {
			System.out.println("Error you entered a number that is not between 1 and 10");
		}
	}

	public static void printRomanNumeral(int number) {

		if(number == 1)
			System.out.println("The Roman numeral version of " + number + " is I");
		else if(number == 2)
			System.out.println("The Roman numeral version of " + number + " is II");
		else if(number == 3)
			System.out.println("The Roman numeral version of " + number + " is III");
		else if(number == 4)
			System.out.println("The Roman numeral version of " + number + " is IV");
		else if(number == 5)
			System.out.println("The Roman numeral version of " + number + " is V");
		else if(number == 6)
			System.out.println("The Roman numeral version of " + number + " is VI");
		else if(number == 7)
			System.out.println("The Roman numeral version of " + number + " is VII");
		else if(number == 8)
			System.out.println("The Roman numeral version of " + number + " is VIII");
		else if(number == 9)
			System.out.println("The Roman numeral version of " + number + " is IX");
		else
			System.out.println("The Roman numeral version of " + number + " is X");
	}
}







/*
Ask the user to input a number between 1 and 10

correlate the roman numeral to each number they might chose

if they choose a number outside of 1 and 10 
display error message
*/
