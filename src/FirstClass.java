import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class FirstClass {
	public static void main(String[] args) {
//
//		Scanner scanner = new Scanner(System.in);
//
//		int[] a = new int[5];
//		int largestElement = 0;
//		for (int i = 0; i < a.length; i++) {
//			{
//				System.out.println("Insert your " + i + "rd element, please: ");
//				a[i] = scanner.nextInt();
//			}
//		}
//		for (int i = 0; i < a.length; i++) {
//			if (largestElement < a[i]) {
//				largestElement = a[i];
//			}
//		}
//		System.out.println("The largest element is " + largestElement);
//
//		for (int i = 0; i <  10; i++) {
//			for (int j = 0; j < i; j++) {
//				System.out.print("*");
//			}
//			System.out.println();
//		}


////		task 2.1
//		for (int i = 0; i < 5; i++) {
//			for (int j = 5; j > i; j--) {
//				System.out.print(j + " ");
//			}
//			System.out.println();
//		}

//		Homework 22.02.20
//		Task 1
//		Random randomNum = new Random();
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Please insert your array length: ");
//		int x = scanner.nextInt();
//		int[] myArray = new int[x];
//		int countOfMatches = 0;
//		System.out.println("Insert a number, please: ");
//		int y = scanner.nextInt();
//		for (int i = 0; i < x; i++) {
//			myArray[i] = randomNum.nextInt(10);
//			System.out.println("Your element at index " + i + " is: " + myArray[i]);
//		}
//		for (int i = 0; i < x; i++) {
//			if (y == myArray[i]) {
//				countOfMatches++;
//				System.out.println("\nYour number has " + countOfMatches + " matches. Here is the index of matched number: " + i);
//			}
//		}
//		if (countOfMatches == 0) {
//			System.out.println("\nSorry, your number has no matches :(");
//		}

//      Task 2
//		Random random = new Random();
//		int[] myArray = new int[10];
//		for (int i = 0; i < myArray.length; i++) {
//			myArray[i] = random.nextInt(100);
//			System.out.print(" " + myArray[i]);
//		}
//		System.out.println();
//
//		for (int b : myArray
//		) {
//			switch (b % 2) {
//				case 1:
//					System.out.println(b + " is odd/kent");
//					break;
//
//				case 0:
//					System.out.println(b + " is even/zuyg");
//					break;
//			}
//		}

//
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("Insert the index, please: ");
//		int x = scanner.nextInt();
//
//		int[] myArr = fib(x+5);
//
//
//		System.out.println(Arrays.toString(myArr));
//		System.out.println(myArr[x]);
//
//
//	}
//
//	public static int[] fib (int a) {
//		int [] fibonacci = new int[a];
//
//
//		for (int i = 0; i < a; i++) {
//			if (i == 0) {
//				fibonacci[0] = 0;
//			} else if (i == 1) {
//				fibonacci[1] = 1;
//			} else
//
//			fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
//		}
//		return fibonacci;
//	}

		int[] array = {90, 87,1, 34, 56, 67, 78, 1, 2, 3, 4, 5, 6};
		int k = array.length;
		int it = 0;
		boolean swap = false;
		for (int i = 0; i < k; i++) {
			for (int j = 0; j < array.length - 1 - i; j++) {
				System.out.println("Step" + j);
				if (array[j] > array[j + 1]) {
					int temp = array[j + 1];
					array[j + 1] = array[j];
					array[j] = temp;
					k = j;
					it++;
					swap = true;
				} else {
					it++;
				}
			}
			if (!swap){
				System.out.println("Sorted. Break");
				break;
			}
		}
		for (int elem : array) {
			System.out.print(elem + " ");
		}
		System.out.println("iterations = " + it);
	}
}








