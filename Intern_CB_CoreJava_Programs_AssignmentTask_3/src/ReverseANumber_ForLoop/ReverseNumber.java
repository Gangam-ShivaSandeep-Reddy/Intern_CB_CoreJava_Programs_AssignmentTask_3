package ReverseANumber_ForLoop;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
		System.out.println("Enter A Number: ");
		Scanner scan = new Scanner(System.in);
		String num = scan.nextLine();

		String reversedNumber = "";
		for (int i = num.length() - 1; i >= 0; i--) {
			reversedNumber += num.charAt(i);
		}

		System.out.println("Reversed Number: " + reversedNumber);


	}
}


