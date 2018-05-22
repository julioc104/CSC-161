// Julio Collado
// pg 263  #2 distance traveled, This program ask the user to input the speed of a vehicle and the hours traveled
// then calculates the distance and displays it on the screen.
// CSC-161-03
// 2/20/18

import java.util.Scanner;
import javax.swing.JOptionPane;

public class DistanceTraveled
{
	public static void main(String[] args) 
	{
		int speed = 0;
		int time = 1;
		int distance;
		int hours;

		Scanner keyboard = new Scanner(System.in);

		System.out.print("\n\nEnter the speed of a vehicle (in miles per hour) : ");
		speed = keyboard.nextInt();

		System.out.print("Enter the number of hours traveled : ");
		hours = keyboard.nextInt();

		System.out.println("\n\nHour 			Distance Traveled");
		System.out.println("-----------------------------------------");

		while (speed >= 0 && time <= hours) {
			distance = speed * time;
			System.out.println(time + "				 " + distance + "\n");
			time++;
		}

	}
}

