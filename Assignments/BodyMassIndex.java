// Julio Collado
// pg 185 problem #3 Body Mass Index
// CSC-161-03
// 2/1/2018

import java.util.Scanner;
import javax.swing.JOptionPane;

public class BodyMassIndex
{
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);

		double weight;
		double height;

		System.out.print("Enter your weight (in pounds): ");
		weight = keyboard.nextDouble();

		System.out.print("Enter your Height (in inches): ");
		height = keyboard.nextDouble();

		getBMI(weight,height);

	}

	public static void getBMI(double weight, double height)
	{
		double BMI;

		BMI = (weight * 703) / Math.pow(height,2);

		if(BMI >= 18.5 && BMI <= 25) {
			System.out.printf("Your BMI is %2.2f", BMI);
			System.out.println(" therefore your weight is optimal for your height.");
		}
		else if(BMI < 18.5) {
			System.out.printf("Your BMI is %2.2f", BMI);
			System.out.println(" therefore you are considered underweight for your height.");
		}
		else {
			System.out.printf("Your BMI is %2.2f", BMI);
			System.out.println(" therefore you are considered overweight for your height.");
		}

	}
}

/*
Ask the user to input their weight and height

calculate the BMI = weight * 703 / height^2

if the persons bmi is between 18.5 & 25 their weight is optimal
if it is below 18.5 they are underweight
if it is above 25 they are overweight

display thei BMI and their status

*/



