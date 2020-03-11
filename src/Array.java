public class Array {
	public static void main(String[] args) {
		sortArrayElements(createArray());

	}

	public static int[][] createArray() {
		int[][] myArray = {{324, 3243, 987, 2, 3535, 5, 5}, {1, 33, 6}, {43, 534, 3}, {123, 34, 45, 57, 68}};
		for (int[] ints : myArray) {
			for (int element : ints) {
				System.out.print(element + " ");
			}
			System.out.println();
		}
		System.out.println();
		return myArray;
	}
	public static void sortArrayElements(int[][] myArray) {
		for (int[] value : myArray) {
			arrayMaxElementSort(value);
		}
		arrayRowsSortBySize(myArray);
		for (int[] ints : myArray) {
			for (int element : ints) {
				System.out.print(element + " ");
			}
			System.out.println();
		}
	}
	public static void arrayMaxElementSort(int[] array) {
		int k = array.length;
		for (int i = 0; i < k; i++) {
			for (int j = 0; j < array.length - 1 - i; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = temp;
				}
			}
		}

	}

	public static void arrayRowsSortBySize(int[][] array) {
		int k = array.length;
		boolean swap = false;
		for (int i = 0; i < k; i++) {
			for (int j = 0; j < array.length - 1 - i; j++) {
				if (array[j].length > array[j + 1].length) {
					int[] temp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = temp;
					k = j;
					swap = true;
				}
			}
			if (!swap) {
				break;
			}
		}
	}

}
