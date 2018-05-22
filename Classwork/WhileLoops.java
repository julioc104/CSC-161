// Julio Collado
// classwork 
// CSC-161-03
// 2/20/18

import java.util.Scanner;
import javax.swing.JOptionPane;

public class WhileLoops
{
	public static void main(String[] args)
	{
		int num;
		int cnt = 0;
		int sum = 0;
		double average;
		String str;

		while (cnt < 3) {
			str = JOptionPane.showInputDialog("Enter a number");
			num = Integer.parseInt(str);
			sum += num;
			cnt++;
		}

		JOptionPane.showMessageDialog(null,"sum in while loop is = " + sum);
		average = sum / cnt;

		sum = 0;
		cnt = 0;
		num = 0;
		average = 0;
		do {
			str = JOptionPane.showInputDialog("Enter a number");
			num = Integer.parseInt(str);
			sum += num;
			cnt++;
		} while (cnt < 3);

		JOptionPane.showMessageDialog(null,"sum in do while loop is = " + sum);
		average = sum / cnt;
	}
}

