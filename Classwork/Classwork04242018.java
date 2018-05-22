// Julio Collado
// sortNumbers and sortName
// CSC-161-03
// 4/24/18

import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.*;
import java.util.Random;

public class Classwork04242018
{
	public static void main(String[] args) throws IOException
	{
		//int[] myArray = {30,24,63,94,8,14,100,0,57,2};

		//SortNumbers sortMyArray = new SortNumbers(myArray);

		//sortMyArray.sortAscending();
		//sortMyArray.sortDescending();


		//sortMyArray.displayArray();

		String[] names = {"Julio", "Gonzo", "Kevin", "Juju", "Chino", "Jan", "Lester", "Edson", "Fabrizio", "Gianka"};

		SortNames namesInOrder = new SortNames(names);

		namesInOrder.sortAscending();
		namesInOrder.displayArray();
	}
}

