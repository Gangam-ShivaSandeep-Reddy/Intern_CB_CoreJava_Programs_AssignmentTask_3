package Handling_DivisionbyZero_TryCatch;

import java.util.Scanner;

public class DivisionbyZero {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter First Number: ");
		int num1 = scan.nextInt();
		System.out.println("Enter Second Number: " );
		int num2 = scan.nextInt();

		try {
			int res = num1/num2;
			System.out.println("Result: " +res);

		}
		catch (ArithmeticException e) {
			System.out.println("Error: Division By Zero is Not Allowed!");
		}
	}
}
