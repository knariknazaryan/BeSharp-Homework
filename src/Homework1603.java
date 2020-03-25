public class Homework1603 {

	public static void main(String[] args) {
		int[][] myArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}, {10, 11, 12}};
		rotateArray(myArray);
		printMatrix(myArray);
	}


	public static int[][] rotateArray(int[][] turnedArray) {

		for (int i = 0; i < turnedArray.length; i++) {
			for (int j = i; j < turnedArray[j].length; j++) {
				int temp = turnedArray[i][j];
				turnedArray[i][j] = turnedArray[j][i];
				turnedArray[j][i] = temp;
			}
		}

		return turnedArray;
	}

	public static int[][] printMatrix(int[][] turnedArray) {
		for (int i = 0; i < turnedArray.length; i++) {
			for (int j = 0; j < turnedArray[i].length; j++) {
				System.out.print(turnedArray[i][j] + " ");
			}
			System.out.println();
		}
		return turnedArray;
	}

}
