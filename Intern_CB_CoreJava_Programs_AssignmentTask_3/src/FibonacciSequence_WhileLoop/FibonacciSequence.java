package FibonacciSequence_WhileLoop;

import java.util.Scanner;

public class FibonacciSequence {

	public static void main(String[] args) {


		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the number of terms: ");
		int n = scanner.nextInt();

		int firstTerm = 0;
		int secondTerm = 1;
		System.out.println("Fibonacci Sequence: ");
		int i = 1;
		while(i <= n) {
			System.out.println(firstTerm + " ");
			int nextTerm  = firstTerm+secondTerm;
			firstTerm = secondTerm;
			secondTerm = nextTerm;
			i++;
		}
	}
}
