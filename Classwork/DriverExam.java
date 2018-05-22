import java.util.Scanner;


public class DriverExam {
	private char[] correctAnswers = {'B','D','A','A','C','A','B','A','C','D',
																	 'B','C','D','A','D','C','C','B','D','A'};
	private char[] studentAnswers = new char[20];


	public DriverExam () {
		for (int indx = 0; indx < studentAnswers.length; indx++) {
			studentAnswers[indx] = ' ';
		}
	}

	public void fillstudentAnswers (Scanner infile) {
		String input;
		for (int indx = 0; indx < studentAnswers.length; indx++) {
			input = infile.nextLine();
			studentAnswers[indx] = input.charAt(0);
		}
	}
}