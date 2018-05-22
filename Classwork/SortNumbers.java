public class SortNumbers {
	private int[] numberArr = new int[10];

	public SortNumbers (int[] inArr) {
		for (int i = 0; i < numberArr.length; i++) {
			numberArr[i] = inArr[i];
		}
	}

	public void sortAscending () {
		int tempVal = 0;

		for (int lowest = 0; lowest < numberArr.length - 1; lowest++) {
			for (int indx = lowest + 1; indx < numberArr.length; indx++) {
				if (numberArr[lowest] > numberArr[indx]) {
					tempVal = numberArr[lowest];
					numberArr[lowest] = numberArr[indx];
					numberArr[indx] = tempVal;
				}
			}
		}
	}

	public void sortDescending () {
		int tempVal = 0;

		for (int highest = 0; highest < numberArr.length - 1; highest++) {
			for (int indx = highest + 1; indx < numberArr.length; indx++) {
				if (numberArr[highest] < numberArr[indx]) {
					tempVal = numberArr[highest];
					numberArr[highest] = numberArr[indx];
					numberArr[indx] = tempVal;
				}
			}
		}
	}

	public void displayArray () {
		System.out.println();
		for (int indx = 0; indx < numberArr.length; indx++) {
			System.out.print(numberArr[indx] + "  ");
		}
		System.out.println();
	}
}