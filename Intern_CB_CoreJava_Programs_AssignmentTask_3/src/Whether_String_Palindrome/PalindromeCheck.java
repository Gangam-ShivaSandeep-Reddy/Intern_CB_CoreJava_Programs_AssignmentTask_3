package Whether_String_Palindrome;

import java.util.Scanner;

public class PalindromeCheck {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a string: ");
		String input = scanner.nextLine();

		if (isPalindrome(input)) {
			System.out.println("\"" + input + "\" is a palindrome.");
		} else {
			System.out.println("\"" + input + "\" is not a palindrome.");
		}

	}
																																																		

	public static boolean isPalindrome(String str) {

		String normalizedStr = str.toLowerCase();


		String reversedStr = new StringBuilder(normalizedStr).reverse().toString();

		return normalizedStr.equals(reversedStr);
	}
}

