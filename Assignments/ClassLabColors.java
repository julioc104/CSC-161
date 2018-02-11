// Julio Collado
// This program display the color of a rainbow that the user inputed
// CSC-161-03
// 2/7/18


import java.util.Scanner;

public class ClassLabColors
{
	public static void main(String[] args) {
		
		char letter;

		String input;
		String rainbowColor;

		Scanner keyboard = new Scanner(System.in);

		System.out.println("\n\n\n");

		System.out.print("Enter a letter that corresponds to a color: ");
		input = keyboard.nextLine();										// 
		letter = input.charAt(0);

		rainbowColor = getColor(letter);

		System.out.println("\nThe letter you choose " + letter + " represents the color " + rainbowColor + ".");

		System.out.println("\n\n End of Programn \n\n\n");


	} // End of main

	public static String getColor(char rainbowLetter) {
		String color;

		switch(rainbowLetter) {
			case 'r': case 'R': 
				color = "Red";
				break;
			case 'o': case 'O':
				color = "Orange"; 
				break;
			case 'y': case 'Y':
				color = "Yellow";
				break;
			case 'g': case 'G':
				color = "Green";
				break;
			case 'b': case 'B':
				color = "Blue";
				break;
			case 'i': case 'I':
				color = "Indigo";
				break;
			case 'v': case 'V':
				color = "Violet";
				break;
			default: 
				color = "Invalid Entry. Please input a letter that corresponds to one of the colors in the rainbow.";
				break;

		}
		return color;
	} //End of getColor
} 











/*
ask the user to input a letter

if letter matches one of the letters of ROY G BIV

	assign that letter to the color it matches
	repeat process for evry color on the rainbow

display the color they choose aswell as the letter
otherwise display an error message
*/
