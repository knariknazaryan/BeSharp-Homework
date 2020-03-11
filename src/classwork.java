public class classwork {
	public static void main(String[] args) {

		int[][] myArray = {{1, 3, 4}, {6, 1, 2, 3}, {0, 65, 3, 2}};
//		int sum = summaryOfArraysElement(myArray);
//		int maximumElement = getTheMaxValue(myArray);
		int[][] myTurnedArray = turnArrays(myArray);

//		System.out.println(sum);
//		System.out.println(maximumElement);
		System.out.println(myTurnedArray);
	}



	public static int[][] turnArrays(int[][] array) {
		int temp;
		for (int i = 0; i < array.length; i++ ) {
			for (int j = 0; j < array[i].length; j++) {

			if (array.length % 2 == 0) {
				for (j = 0; i < array[i].length/2; j++) {
					temp = array[i][j];
					array[i][array[i].length - 1 -j] = array[i][j];
					array[i][j] = temp;
				}
			} else {
				for (j = 0; i < array[i].length/2 - 1; j++) {
					temp = array[i][j];
					array[i][array[i].length - 1 - j] = array[i][j];
					array[i][j] = temp;
				}

			}

			System.out.print(array[i][j]);


		}
			System.out.println();
		}
		return array;
	}
}
