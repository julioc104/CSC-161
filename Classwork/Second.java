import javax.swing.JOptionPane;
import java.util.Scanner;
import java.io.*;

public class Second {
	public static void main(String [] args) throws IOException {
  	Scanner keyboard = new Scanner(System.in);
    String input;
    char letter;
    
    System.out.print("Enter a letter: ");
    input = keyboard.nextLine();
    letter = input.charAt(0);
    
    if (letter == 'A' || letter == 'a' || letter == 'E' || letter == 'e' || letter == 'I' || letter == 'i' || letter == 'O' || letter == 'o' || letter == 'U' || letter == 'u') {
      System.out.println("The letter you choose " + letter + " is a vowel.");
    }
    else {
      System.out.println("The letter you choose " + letter + " is a consonant."); 
    }
  }
}