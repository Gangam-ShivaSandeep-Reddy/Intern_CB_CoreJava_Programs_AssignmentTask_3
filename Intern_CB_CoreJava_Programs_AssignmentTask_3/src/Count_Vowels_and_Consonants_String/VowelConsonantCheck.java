package Count_Vowels_and_Consonants_String;

import java.util.Scanner;

public class VowelConsonantCheck {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.print("Enter A String: ");
		String input = scan.nextLine();

		int vowelCount = 0;
		int consonantCount = 0;

		String lowerCaseInput = input.toLowerCase();

		for (char ch : lowerCaseInput.toCharArray()) {
			if (Character.isLetter(ch)) {
				if (isVowel(ch)) {
					vowelCount++;
				} else {
					consonantCount++;
				}
			}
		}

		System.out.println("Vowels: " + vowelCount);
		System.out.println("Consonants: " + consonantCount);

	}

	public static boolean isVowel(char ch) {
		return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
	}
}


