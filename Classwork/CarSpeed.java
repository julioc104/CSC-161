// Julio Collado
// pg 396 #2 car class 
// CSC-161-03
// 4/3/18

import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.*;
import java.util.Random;

public class CarSpeed
{
	public static void main(String[] args) throws IOException
	{
		Car myCar = new Car(1996,"Mercedes");

		for (int i = 0; i < 5; i++) {
			myCar.accelerate();
			System.out.println(myCar.getSpeed());

		}
		for (int i = 0; i < 5; i++) {
			myCar.breakSpeed();
			System.out.println(myCar.getSpeed());
		}
	}



}

