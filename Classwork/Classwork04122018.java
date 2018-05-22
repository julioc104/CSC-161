// Julio Collado
// Array classwork
// CSC-161-03
// 4/12/18

import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.*;
import java.util.Random;

public class Classwork04122018
{
	public static void main(String[] args) throws IOException
	{
		ArrayClass arrayOne = new ArrayClass(5);

		arrayOne.fillArray();

		arrayOne.displayArray();
		System.out.println("\nThe average is " + arrayOne.average());
	}
}

