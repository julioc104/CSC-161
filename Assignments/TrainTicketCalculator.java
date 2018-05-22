// Julio Collado
// Lab Quiz 1, This program is a train ticket calculator that passes by NY, PHI, and boston.
// CSC-161-03
// 2/15/18

import java.util.Scanner;
import javax.swing.JOptionPane;

public class TrainTicketCalculator {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);

		String destination;
		double finalPrice = 0;

		System.out.println("\n\n\nNYC = New York City  PHI = philadelphia  BOS = Boston \n\n");
		System.out.print("\nWhere are you going? ");
		destination = keyboard.nextLine();


		if (destination.equalsIgnoreCase("NYC")) {
			finalPrice = newYork();
		}

		if (destination.equalsIgnoreCase("PHI")) {
			finalPrice = philadelphia();
		}

		if (destination.equalsIgnoreCase("BOS")) {
			finalPrice = boston();
		}

		System.out.printf("\nThe total cost of the purchase is $%3.2f\n\n\n",finalPrice);

	}


	public static double newYork()  {
		Scanner keyboard = new Scanner(System.in);

		final double OFF_PEAK_HOURS_NEW_YORK = 14.90;
		final double PEAK_HOURS_NEW_YORK = 17.90;
		final double ROUND_TRIP_DISCOUNT = 0.10;

		String input;
		String trip;
		char hours;
		int numberOfTickets = 0;
		double ticketPrice = 0;
		double totalCost = 0;


		System.out.print("\nAre you going within Peak Hours(5AM-8AM) & (3PM-7PM) ? (Y/N) ");
		input = keyboard.nextLine();
		hours = input.charAt(0);

		if (hours == 'Y' || hours == 'y') {							// peak hours

			System.out.print("\nIs it a Round Trip or a One way? ");
			trip = keyboard.nextLine();

			if (trip.equalsIgnoreCase("Round Trip")) {															// if its a round trip you take them as a set.
				ticketPrice = (PEAK_HOURS_NEW_YORK * 2) - ((PEAK_HOURS_NEW_YORK * 2) * ROUND_TRIP_DISCOUNT);

				System.out.print("\nHow many tickets are you purchasing? ");
				numberOfTickets = keyboard.nextInt();

				totalCost = seniorOrStudent(keyboard,ticketPrice,numberOfTickets);			// calls the function that asks the user if he is a student or senior and it passes 3 parameters
			}
			else {																		// if its not a round trip. its a one way trip
				System.out.print("\nHow many tickets are you purchasing? ");
				numberOfTickets = keyboard.nextInt();

				ticketPrice = PEAK_HOURS_NEW_YORK;
				totalCost = seniorOrStudent(keyboard,ticketPrice,numberOfTickets);
			}
		}
		if (hours == 'N' || hours == 'n') {						// non peak hours 						

			System.out.print("\nIs it a Round Trip or a One way? ");
			trip = keyboard.nextLine();

			if (trip.equalsIgnoreCase("Round Trip")) {
				ticketPrice = (OFF_PEAK_HOURS_NEW_YORK * 2) - ((OFF_PEAK_HOURS_NEW_YORK * 2) * ROUND_TRIP_DISCOUNT);

				System.out.print("\nHow many tickets are you purchasing? ");
				numberOfTickets = keyboard.nextInt();

				totalCost = seniorOrStudent(keyboard,ticketPrice,numberOfTickets);
			}
			else {
				System.out.print("\nHow many tickets are you purchasing? ");
				numberOfTickets = keyboard.nextInt();
				
				ticketPrice = OFF_PEAK_HOURS_NEW_YORK;
				totalCost = seniorOrStudent(keyboard,ticketPrice,numberOfTickets);
			}
		}
		return totalCost;			
	}

	public static double philadelphia() {
		Scanner keyboard = new Scanner(System.in);

		final double OFF_PEAK_HOURS_PHILADELPHIA = 23.85;
		final double PEAK_HOURS_PHILADELPHIA = 25.85;
		final double ROUND_TRIP_DISCOUNT = 0.10;

		String input;
		String trip;
		char hours;
		int numberOfTickets = 0;
		double ticketPrice = 0;
		double totalCost = 0;


		System.out.print("\nAre you going within Peak Hours(5AM-8AM) & (3PM-7PM) ? (Y/N) ");
		input = keyboard.nextLine();
		hours = input.charAt(0);

		if (hours == 'Y' || hours == 'y') {

			System.out.print("\nIs it a Round Trip or a One way? ");
			trip = keyboard.nextLine();

			if (trip.equalsIgnoreCase("Round Trip")) {
				ticketPrice = (PEAK_HOURS_PHILADELPHIA * 2) - ((PEAK_HOURS_PHILADELPHIA * 2) * ROUND_TRIP_DISCOUNT);

				System.out.print("\nHow many tickets are you purchasing? ");
				numberOfTickets = keyboard.nextInt();

				totalCost = seniorOrStudent(keyboard,ticketPrice,numberOfTickets);

			}
			else {
				System.out.print("\nHow many tickets are you purchasing? ");
				numberOfTickets = keyboard.nextInt();

				ticketPrice = PEAK_HOURS_PHILADELPHIA;
				totalCost = seniorOrStudent(keyboard,ticketPrice,numberOfTickets);

			}
		}
		if (hours == 'N' || hours == 'n') {

			System.out.print("\nIs it a Round Trip or a One way? ");
			trip = keyboard.nextLine();

			if (trip.equalsIgnoreCase("Round Trip")) {
				ticketPrice = (OFF_PEAK_HOURS_PHILADELPHIA * 2) - ((OFF_PEAK_HOURS_PHILADELPHIA * 2) * ROUND_TRIP_DISCOUNT);

				System.out.print("\nHow many tickets are you purchasing? ");
				numberOfTickets = keyboard.nextInt();

				totalCost = seniorOrStudent(keyboard,ticketPrice,numberOfTickets);
			}
			else {
				System.out.print("\nHow many tickets are you purchasing? ");
				numberOfTickets = keyboard.nextInt();
				
				ticketPrice = OFF_PEAK_HOURS_PHILADELPHIA;
				totalCost = seniorOrStudent(keyboard,ticketPrice,numberOfTickets);

			}
		}
		return totalCost;
	}

	public static double boston() {
		Scanner keyboard = new Scanner(System.in);

		final double OFF_PEAK_HOURS_BOSTON = 41.60;
		final double PEAK_HOURS_BOSTON = 46.60;
		final double ROUND_TRIP_DISCOUNT = 0.10;

		String input;
		String trip;
		char hours;
		int numberOfTickets = 0;
		double ticketPrice = 0;
		double totalCost = 0;


		System.out.print("\nAre you going within Peak Hours(5AM-8AM) & (3PM-7PM) ? (Y/N) ");
		input = keyboard.nextLine();
		hours = input.charAt(0);

		if (hours == 'Y' || hours == 'y') {

			System.out.print("\nIs it a Round Trip or a One way? ");
			trip = keyboard.nextLine();

			if (trip.equalsIgnoreCase("Round Trip")) {
				ticketPrice = (PEAK_HOURS_BOSTON * 2) - ((PEAK_HOURS_BOSTON * 2) * ROUND_TRIP_DISCOUNT);

				System.out.print("\nHow many tickets are you purchasing? ");
				numberOfTickets = keyboard.nextInt();

				totalCost = seniorOrStudent(keyboard,ticketPrice,numberOfTickets);
			}
			else {
				System.out.print("\nHow many tickets are you purchasing? ");
				numberOfTickets = keyboard.nextInt();

				ticketPrice = PEAK_HOURS_BOSTON;
				totalCost = seniorOrStudent(keyboard,ticketPrice,numberOfTickets);
			}
		}
		if (hours == 'N' || hours == 'n') {

			System.out.print("\nIs it a Round Trip or a One way? ");
			trip = keyboard.nextLine();

			if (trip.equalsIgnoreCase("Round Trip")) {
				ticketPrice = (OFF_PEAK_HOURS_BOSTON * 2) - ((OFF_PEAK_HOURS_BOSTON * 2) * ROUND_TRIP_DISCOUNT);

				System.out.print("\nHow many tickets are you purchasing? ");
				numberOfTickets = keyboard.nextInt();

				totalCost = seniorOrStudent(keyboard,ticketPrice,numberOfTickets);
			}
			else {
				System.out.print("\nHow many tickets are you purchasing? ");
				numberOfTickets = keyboard.nextInt();
				
				ticketPrice = OFF_PEAK_HOURS_BOSTON;
				totalCost = seniorOrStudent(keyboard,ticketPrice,numberOfTickets);
			}
		}
		return totalCost;
	}

	public static double seniorOrStudent(Scanner userInput, double ticketPrice, int tickets) {
		final double SENIOR_DISCOUNT = 0.20;
		final double STUDENT_DISCOUNT = 0.05;

		String currentAge;
		double costPerTicket;
		double totalPrice = ticketPrice;

		System.out.print("\nAre you a senior citizen or a student? ");
		userInput.nextLine();												
		currentAge = userInput.nextLine();

		if (currentAge.equalsIgnoreCase("Senior")) {
			ticketPrice = ticketPrice - (ticketPrice * SENIOR_DISCOUNT);
			totalPrice = ticketPrice * tickets;
		}
		if (currentAge.equalsIgnoreCase("Student")) {
			ticketPrice = ticketPrice - (ticketPrice * STUDENT_DISCOUNT);
			totalPrice = ticketPrice * tickets;

		}
		if(tickets >= 10) {					// checks if the person bought 10 or more tickets.
			totalPrice -= 10;
		}

		System.out.printf("\nThe cost per ticket price is $%3.2f\n",ticketPrice);			// prints out the price per ticket by dividing the total price by the number of tickets purchased

		return totalPrice;
	}
}




/*
Ask user where they are going
ask user round trip or One way
ask user if peak or off peak hours
ask user number of tickets purchased
ask user are they a senior or student

total price = number of tickets * ticket price

if it is is one way price stays the same
if it is a round trip total price * 2 - (total price * percentage)

if they are a senior
total price = total price - (total price * discount )

if they are student
total price = total price - (total price * discount )

if number of tickets >= 10
total price = total price - 10
*/




