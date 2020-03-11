import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class largestElement {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Insert your array length, please: ");
		int arrayLength = scanner.nextInt();
		int [] myArray = new int[arrayLength];
		Random randomNumber = new Random();
		for (int i = 0; i < arrayLength; i++) {
			myArray[i] = randomNumber.nextInt(100);
		}
		System.out.println("Your array is: " + Arrays.toString(myArray));
		sortArrayList(myArray);
		System.out.println("Your sorted array is: " + Arrays.toString(myArray));

	}


	public static void sortArrayList(int[] newArray ) {
		int k = newArray.length;
		boolean swap = false;
		for (int i = 0; i < k; i++) {
			for (int j = 0; j < newArray.length - 1 - i; j++) {
				if (newArray[j] > newArray[j + 1]) {
					int temp = newArray[j + 1];
					newArray[j + 1] = newArray[j];
					newArray[j] = temp;
					k = j;
					swap = true;
				}
			}
			if (!swap) {
				System.out.println("Sorted. Break");
				break;
			}
		}


	}
}
