// Julio Collado
// page 489 number 6 Drivers license exam
// CSC-161-03
// 5/3/18

import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.*;
import java.util.Random;
import java.util.Arrays;

public class DriverExamDemo {
	public static void main(String[] args) throws IOException {
		Scanner keyboard = new Scanner(System.in);

		DriverExam studentExam = new DriverExam();

		char[] answerArr = new char[20];
		char answer;


		for (int indx = 0; indx < 20; indx++) {
			answer = validateAnswer(keyboard,indx);
			answerArr[indx] = answer;
			//System.out.println(answerArr[indx]);
		}
		System.out.println(Arrays.toString(answerArr));

	}

	public static char validateAnswer (Scanner infile, int index) {
		String input;
		char retValue;

		do {
			System.out.print("Enter the answer for #" + (index + 1) + ": ");
			input = infile.nextLine();
			retValue = input.charAt(0);
			if (!(retValue == 'A' || retValue == 'a' || retValue == 'B' || retValue == 'b' || retValue == 'C' || retValue == 'c' || retValue == 'D' || retValue == 'd')) {
				System.out.println("Please enter a valid letter between A & D");
			}
		} while (!(retValue == 'A' || retValue == 'a' || retValue == 'B' || retValue == 'b' || retValue == 'C' || retValue == 'c' || retValue == 'D' || retValue == 'd'));	
		return retValue;
	}
}

