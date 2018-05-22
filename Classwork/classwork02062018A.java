// Julio Collado
// Classwork 2/6/18

public class classwork02062018A
{

	public static void main(String[] args)
	{
		int num = 11;

		System.out.println("\n\n\n");

		displayNumber(num);

		System.out.println ("\n\n End of Run \n\n\n");

		// String word1 = "Cat";
		// String word2 = "Dog";

		// System.out.println("\n \n \n ");
		
		// if(word1.equalsIgnoreCase(word2)) {
		// 	System.out.println(word1 + " and " + word2 + "are equal");
		// }
		// else {
		// 	if(word1.compareToIgnoreCase(word2) > 0)
		// 		System.out.println(word1 + " is greater than " + word2);
		// 	else {
		// 		System.out.println(word2 + " is greater than " + word1);
		// 	}
		// }

		// System.out.println("\n\n End of Run \n\n\n");


	}  // end main

	public static void displayNumber(int num) {
		if(num == 0)
			System.out.println("The number is zero");
		else if(num == 1)
			System.out.println("The number is one");
		else if(num == 2)
			System.out.println("The number is two");
		else if(num == 3)
			System.out.println("The number is three");
		else if(num == 4)
			System.out.println("The number is four");
		else if(num == 5)
			System.out.println("The number is five");
		else if(num == 6)
			System.out.println("The number is six");
		else if(num == 7)
			System.out.println("The number is seven");
		else if(num == 8)
			System.out.println("The number is eight");
		else if(num == 9)
			System.out.println("The number is nine");
		else
			System.out.println(" Invalid Entry ");
	}
	
}
