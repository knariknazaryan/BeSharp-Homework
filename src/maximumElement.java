import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class maximumElement {
	public static void main(String[] args) {
		int [] firstArray = createArray();
		int [] secondArray = createArray();
		int x = findBiggestElement(firstArray);
		int y = findBiggestElement(secondArray);
		int a = findSmallestElement(firstArray);
		int b = findSmallestElement(secondArray);
		if (x > y) {
			System.out.println("The smallest element of the first array is: " + a);
		} else {
			System.out.println("The smallest element of the second array is: " + b);
		}


	}



	public static int [] createArray() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Insert elements count for your array: ");
		int arrLength = scanner.nextInt();
		int [] myArray = new int[arrLength];
		Random randomInt = new Random();
		for (int i = 0; i < arrLength; i++) {
			myArray[i] = randomInt.nextInt(50);
		}
		System.out.println("Your array is: " + Arrays.toString(myArray));
		System.out.println();


		return myArray;
	}

	public static int findBiggestElement(int [] newArray){
		int x = newArray[0];
		for (int i = 1; i < newArray.length; i ++) {
			if (x < newArray[i]) {
				x = newArray[i];
			}
		}
		System.out.println("The biggest element of array is: " + x);

		return x;

	}

	public static int findSmallestElement(int [] newArray) {
		int x = 101;
		for (int i = 0; i < newArray.length; i++ ) {
			if (x > newArray[i]) {
				x = newArray[i];
			}
		}
		System.out.println("The smallest element of array is: " + x);
		return x;
	}
}
