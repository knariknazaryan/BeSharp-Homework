public class homework {
	public static void main(String[] args) {
		int[][] myArray = {{12, 34, 1, 37, 21, 8}, {23, 12, 34, 4, 3, 1}, {12, 54}, {243, 45, 34}};
		 turnArray(myArray);
		 printArray(myArray);
	}

	public static int[][] turnArray(int[][] myNewArray) {
		int temp;
		for (int j = 0; j < myNewArray.length; j++) {
			for (int i = 0; i < myNewArray[j].length; i++) {
				if (i < myNewArray[j].length / 2) {
					temp = myNewArray[j][i];
					myNewArray[j][i] = myNewArray[j][myNewArray[j].length - 1 - i];
					myNewArray[j][myNewArray[j].length - 1 - i] = temp;
				}
			}
		}
		return myNewArray;
	}

	public static int[][] printArray(int[][] myNewArray) {
		for (int i = 0; i < myNewArray.length; i++) {
			for (int element : myNewArray[i]
			) {
				System.out.print(element + " ");
			}
			System.out.println();
		}
		return myNewArray;
	}
}
