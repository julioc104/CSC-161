// Julio Collado
// CSC-161-03
// This program takes a number and converts it to number spelled out.
// 2/8/18


import java.util.Scanner;

public class NumbersToWords {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);

		int numIn;
		String words;

		System.out.print("Enter a integer that is between 1 - 199:  ");
		numIn = keyboard.nextInt();

		words = displayNumber(numIn);
		System.out.println(words);
		
	} //end main


	public static String displayNumber (int number) {
		int hundreds = 0;
		int tens = 0;
		int ones = 0;

		String wordHundreds = "";
		String wordTens = "";
		String wordOnes = "";
		String wordTeens = "";

		String wordNumber = "";

		if ((number < 0) || (number > 199)) {
			System.out.println("You have entered an invalid number");
		} else {
				if (number == 0) {
					wordNumber = onesToWords(number);
				} else {
						hundreds = checkHundreds(number);
						tens = checkTens(number);
						ones = checkOnes(number);

						if (hundreds > 0) {
							wordHundreds = hundredsToWords(hundreds);
							wordNumber = wordHundreds + " ";
						}

						if (tens == 1) {
							wordTeens = teensToWords(ones);
							wordNumber = wordNumber + wordTeens + " ";
						} else {
								if (tens > 1) {
									wordTens = tensToWords(tens);
									wordNumber = wordNumber + wordTens + " ";
								}
								if (ones > 0) {
									wordOnes = onesToWords(ones);
									wordNumber = wordNumber + wordOnes;
								}
						}
				}
		}
		return wordNumber;
	}


	public static String hundredsToWords(int numOfHundreds) {

		String retValue = "";

		if (numOfHundreds == 1) 
			retValue = "One Hundred";

		return retValue;
	}

	public static String tensToWords(int numOfTens) {

		String retValue = "";

		switch (numOfTens) {
			case 2 : 
				retValue = "Twenty";
				break;
			case 3 : 
				retValue = "Thirty";
				break;
			case 4 : 
				retValue = "Forty";
				break;
			case 5 : 
				retValue = "Fifthy";
				break;
			case 6 : 
				retValue = "Sixty";
				break;
			case 7 : 
				retValue = "Seventy";
				break;
			case 8 : 
				retValue = "Eighty";
				break;
			case 9 : 
				retValue = "Ninetety";
				break;
		}

		return retValue;
	}

	public static String onesToWords(int numOfOnes) {

		String retValue = "";

		switch (numOfOnes) {
			case 0 :
				retValue = "Zero";
				break;
			case 1 : 
				retValue = "One";
				break;
			case 2 : 
				retValue = "Two";
				break;
			case 3 : 
				retValue = "Three";
				break;
			case 4 : 
				retValue = "Four";
				break;
			case 5 : 
				retValue = "Five";
				break;
			case 6 : 
				retValue = "Six";
				break;
			case 7 : 
				retValue = "Seven";
				break;
			case 8 : 
				retValue = "Eight";
				break;
			case 9 :
				retValue = "Nine";
				break;
		}

		return retValue;
	}

	// ------------------------------------------------------------------------------

	public static String teensToWords(int numOfTeens) {

		String retValue = "";

		switch (numOfTeens) {
			case 0 :
				retValue = "Ten";
				break;
			case 1 : 
				retValue = "Eleven";
				break;
			case 2 : 
				retValue = "Twelve";
				break;
			case 3 : 
				retValue = "Thirteen";
				break;
			case 4 : 
				retValue = "Fourteen";
				break;
			case 5 : 
				retValue = "Fifteen";
				break;
			case 6 : 
				retValue = "Sixteen";
				break;
			case 7 : 
				retValue = "Seventeen";
				break;
			case 8 : 
				retValue = "Eightteen";
				break;
			case 9 :
				retValue = "Nineteen";
				break;
		}

		return retValue;
	}


	// -------------------------------------------------------------------

	public static int checkHundreds(int number) {
		int retValue;

		retValue = number / 100;

		return retValue;
	}



	public static int checkTens(int number) {
		int retValue;

		retValue = (number - ((checkHundreds(number) * 100))) / 10;

		return retValue;
	}

	public static int checkOnes(int number) {
		int retValue;

		retValue = number - ((checkHundreds(number) * 100)) - ((checkTens(number) * 10));

		return retValue;
	}

}


