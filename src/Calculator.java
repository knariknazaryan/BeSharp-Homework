import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {

//		Homework 28.02.20
//		Calculator

		Scanner scanner = new Scanner(System.in);
		String action;

		do {
			System.out.println("Insert the number: ");
			int x = scanner.nextInt();
			System.out.println("Select the action: + - / * 0");
			action = scanner.next();
			switch (action) {
				case "+":
					action = "+";
					System.out.println("Insert the number");
					int y = scanner.nextInt();
					int s = sum(x, y);
					System.out.println(s);
					break;

				case "-":
					action = "-";
					System.out.println("Insert the number");
					y = scanner.nextInt();
					int d = diff(x, y);
					System.out.println(d);
					break;

				case "/":
					action = "/";
					System.out.println("Insert the number");
					y = scanner.nextInt();
					if (y == 0) {
						System.out.println("Sorry, your action is not correct");
						break;
					}
					int dv = div(x, y);
					System.out.println(dv);
					break;

				case "*":
					action = "*";
					System.out.println("Insert the number");
					y = scanner.nextInt();
					int m = mult(x, y);
					System.out.println(m);
					break;

				case "0":
					action = "0";
					break;

				default:
					System.out.println("Invalid action");
					break;

			}

		}
		while (action != "0");

	}


	public static int sum(int a, int b) {
		return a + b;
	}

	public static int diff(int a, int b) {
		return a - b;
	}

	public static int div(int a, int b) {
		return a / b;
	}

	public static int mult(int a, int b) {
		return a * b;
	}
}
