import java.util.Scanner;
import java.util.*;

public class Rainfall {
	private final int months = 12;
	private double[] totalRainfall = new double[months];
	private double sum = 0.0;

	// constructor: initializes the array to zero
	public Rainfall () {
		for (int index = 0; index < months; index++) {
			totalRainfall[index] = 0.0;
		}
	}

	public void fillArray () {
		System.out.println();

		for (int index = 0; index < months; index++) {
			totalRainfall[index] = checkNumber();
		}
	}
	// checks to see if the number is less than zero
	public double checkNumber () throws InputMismatchException {
		double retValue;
		Scanner userInput = new Scanner(System.in);

		do {
			System.out.print("Enter the total rainfall for the month: ");
			retValue = userInput.nextDouble();
			if (retValue < 0.0) {
				System.out.println("Negative numbers can not be accepted. ");
			}
		} while (retValue < 0.0);

		return retValue;
	}
	// adds up all elements in the the array
	public double yearlyTotalRainfall () {
	    for (int index = 0; index < months; index++) {
			sum += totalRainfall[index];
		}
		return sum;
	}
	// takes the average of all the months
	public double averageMonthlyRainfall () {
		return sum / months;
	}
	// finds the month wiht the most rain
	public int mostRain () {
		double maxRain = totalRainfall[0];
		int index;
		int highestIndex = 0;

		for (index = 0; index < months; index++) {
			if (totalRainfall[index] > maxRain) {
				maxRain = totalRainfall[index];
				highestIndex = index;
			}
		}
		return highestIndex;
	}
	// finds the month with the least rain
	public int leastRain () {
		double lowestRain = totalRainfall[0];
		int index;
		int lowestIndex = 0;

		for (index = 0; index < months; index++) {
			if (totalRainfall[index] < lowestRain) {
				lowestRain = totalRainfall[index];
				lowestIndex = index;
			}
		}
		return lowestIndex;
	}
	public double mostRainValue () {
		return totalRainfall[mostRain()];
	}
	public double leastRainValue () {
		return totalRainfall[leastRain()];
	}
}