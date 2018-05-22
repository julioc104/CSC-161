// Julio Collado
// Lab quiz IV
// CSC-161-03
// 5/8/18

import java.util.Scanner;
import javax.swing.JOptionPane;
import java.io.*;
import java.util.Random;

public class GymDemo {
	public static void main(String[] args) throws IOException {
		PrintWriter output = new PrintWriter("exerciselot.txt");
    Gym workout = new Gym();
      
    workout.fillArr(0,"Jumping jacks", 4.2, 15);
    workout.fillArr(1,"Push ups", 9.2, 10);
    workout.fillArr(2,"Sit ups", 6.3, 25);
    workout.fillArr(3,"Pull ups", 10, 10);

    workout.sortName();
    workout.gymReport(output);
    
   	output.close();
	}
}

