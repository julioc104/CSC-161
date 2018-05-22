// Julio Collado
// Classwork Grades chart
// CSC-161-03
// 2/27/18

import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.*;

public class Classwork22718B
{
	public static void main(String[] args) throws IOException
	{
		File fn = new File("grades.txt");

		Scanner infile = new Scanner(fn);

		System.out.printf("\n\n\n%-6s	 %6s\n","Name","Grade");
		System.out.printf("%4s 	 %6s\n\n","----","-----");

		readInFile(infile);

		System.out.println("\n\n\n");

		infile.close();
	}

	public static void readInFile(Scanner inputFile) {
		String name;
		double gpa = 0;
		int credits= 0;
		char letterGrade;
		int loopCount = 0;

		while (inputFile.hasNext()) {
			loopCount++;
			name = inputFile.nextLine();
			gpa = inputFile.nextDouble();
			credits = inputFile.nextInt();
			inputFile.nextLine();

			letterGrade = returnGradeLetter(gpa);
			System.out.printf("%-6s	%6c\n\n", name, letterGrade);
		}
	}

	public static char returnGradeLetter(double gpa) {
		char gradeLetter = 'F';

		if (gpa >= 1.0 && gpa <= 1.9) {
			gradeLetter = 'D';
		}
		else if (gpa >= 2.0 && gpa <= 2.9) {
			gradeLetter = 'C';
		}
		else if (gpa >= 3.0 && gpa <= 3.9) {
			gradeLetter = 'B';
		}
		else if (gpa >= 4.0) {
			gradeLetter = 'A';
		}
		else {
			System.out.println("GPA must be between 1.0 - 4.0");
		}

		return gradeLetter;
	}
}