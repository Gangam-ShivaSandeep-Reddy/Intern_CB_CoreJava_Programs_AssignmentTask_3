package HandlingInvalidInput_MultipleCatch;

import java.util.Scanner;

import java.util.InputMismatchException;
import java.util.Scanner;

public class HandleInvalidInput {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		try {

			System.out.print("Enter a number: ");
			int num = scan.nextInt();

			int result = 10 / num;
			System.out.println("Result of division: " + result);
		} catch (InputMismatchException e) {
			System.out.println("Please enter a valid integer.");
		} catch (ArithmeticException e) {
			System.out.println("Division by zero is not allowed.");
		} finally {
			System.out.println("********************");

		}
	}
}
