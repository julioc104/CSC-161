// Julio Collado
// Sum of Numbers, This program reads in numbers, squares it, and finally takes the square root
// CSC-161-03
// 2/22/18

import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.*;



public class ClassworkFiles
{
	public static void main(String[] args) throws IOException
	{
		String tStr = "";
		int num = 0;
		int count = 0;

		File fn = new File("numbers.txt");
		Scanner inputFile = new Scanner(fn);

		PrintWriter outputFile = new PrintWriter("Classwork.txt");

		tStr = String.format("%6s	%6s	%7s\n","Number","Square","Sq Root");
		outputFile.print(tStr);
		tStr = String.format("%6s	%6s	%7s\n","------","------","-------");
		outputFile.print(tStr);


		while (count < 10) {
			num = inputFile.nextInt();
			tStr = String.format("%6d  %6.0f %6.3f\n",num,Math.pow(num,2),Math.sqrt(num));
			outputFile.print(tStr);
			count++;
		}

		inputFile.close();
		outputFile.close();
	}
}

