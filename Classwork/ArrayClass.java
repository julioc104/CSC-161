import javax.swing.JOptionPane;
import java.util.Scanner;




public class ArrayClass {
	private int[] iArr;



	public ArrayClass (int size) {

		iArr = new int [size];

		for (int i = 0; i < iArr.length; i++) {
			iArr[i] = 0;
		}	
	}

	public void fillArray () {
		for (int j = 0; j < iArr.length; j++) {
			iArr[j] = getInteger();
		}		
	}

	public void displayArray () {
		for (int i = 0; i < iArr.length; i++) {
			System.out.println(iArr[i]);
		}		
	}

	public int getInteger() {
		int retValue = 0;

		String tStr;

		do {
			tStr = JOptionPane.showInputDialog("Enter an integer: ");
			retValue = Integer.parseInt(tStr);
			if (retValue <= 20 && retValue <= 29 || retValue >= 20 && retValue >= 29) {
				System.out.println("Number must be between 20 & 29.");
			}
		} while (retValue <= 20 && retValue <= 29 || retValue >= 20 && retValue >= 29);

		return retValue;
	}	
	public int average () {
		int sum = 0;


		for (int i = 0; i < iArr.length; i++) {
			sum += iArr[i];
		}
		return sum / iArr.length;
	}


}