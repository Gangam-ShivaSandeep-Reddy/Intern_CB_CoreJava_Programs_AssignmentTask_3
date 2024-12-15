package UniqueWords_inASentence_HashSet;

import java.util.HashSet;
import java.util.Scanner;

public class UniqueWords {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter A Sentense: ");
		String sentence = scan.nextLine();

		HashSet<String>uniquewords = new HashSet<String>();
		String[] words = sentence.split("\\s+");

		for(String word : words) {
			if (!word.isEmpty()) {
				uniquewords.add(word);
			}
		}
		System.out.println("Unique words : " + uniquewords);
	}
}
