public class SortNames {
	private String[] nameArr = new String[10];
	private int[] ageArr = new int[10];

	public SortNames (String[] inArr) {
		for (int i = 0; i < nameArr.length; i++) {
			nameArr[i] = inArr[i];
		}
	}

	public void sortAscending () {
		String tempVal = "";

		for (int lowest = 0; lowest < nameArr.length - 1; lowest++) {
			for (int indx = lowest + 1; indx < nameArr.length; indx++) {
				if (nameArr[lowest].compareTo(nameArr[indx]) > 0) {
					tempVal = nameArr[lowest];
					nameArr[lowest] = nameArr[indx];
					nameArr[indx] = tempVal;
				}
			}
		}
	}

	public void sortDescending () {
		String tempVal = "";

		for (int highest = 0; highest < nameArr.length - 1; highest++) {
			for (int indx = highest + 1; indx < nameArr.length; indx++) {
				if (nameArr[highest].compareTo(nameArr[indx]) < 0) {
					tempVal = nameArr[highest];
					nameArr[highest] = nameArr[indx];
					nameArr[indx] = tempVal;
				}
			}
		}
	}

	public void displayArray () {
		System.out.println();
		for (int indx = 0; indx < nameArr.length; indx++) {
			System.out.print(nameArr[indx] + "  ");
		}
		System.out.println();
	}
}