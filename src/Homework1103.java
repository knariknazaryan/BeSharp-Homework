public class Homework1103 {
	public static void main(String[] args) {
		int[][] myArray = {{4, 7, 6}, {34, 6, 4, 3, 2}, {1, 0, 9878}, {23, 34, 1, 2, 4}, {3, 4, 2, 1}, {34, 21}};
		returnSumOfElements(myArray);
	}


	public static void returnSumOfElements(int[][] array) {
		int max = 0;
		int index = 0;
		for (int i = 0; i < array.length; i++) {
			int sumOfElements = 0;
			int avr = 0;
			for (int j = 0; j < array[i].length; j++) {
				sumOfElements += array[i][j];
				avr = sumOfElements / array[i].length;
				if (max < avr) {
					max = avr;
					index = i;
				}
			}
			System.out.println(sumOfElements);
			System.out.println(avr);

		}
		System.out.println(max);
		System.out.println(index);
		System.out.println();
	}
}
