// Julio Collado
// Classwork End of file 
// CSC-161-03
// 2/27/18

import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.*;

public class Classwork22718
{
	public static void main(String[] args) throws IOException
	{
		File fn = new File("input.txt");

		Scanner inputFile = new Scanner(fn);

		String name;
		int loopCount = 0;

		while (inputFile.hasNext())
		{
			name = inputFile.nextLine();
			System.out.println(name);
			System.out.println(loopCount);
			loopCount++;
		}

		inputFile.close();
	}
}

