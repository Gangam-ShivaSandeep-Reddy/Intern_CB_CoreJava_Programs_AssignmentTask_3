package Check_GivenNumber_Prime_or_Not;

import java.util.Scanner;

public class PrimeNumberCheck {
	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		System.out.println("Enter A Number: ");
		int num = scan.nextInt();

		if(isPrime(num)) {
			System.out.println(num + " is A Prime Number!! ");
		}
		else
			System.out.println(num + "is Not A Prime Number!");

	}

	private static boolean isPrime(int num) {
		if(num <= 1) {
			return false;
		}
		for(int i = 2; i <= Math.sqrt(num); i++) {
			if(num % i ==0) {
				return false;
			}
		}
		return true;
	}
}
