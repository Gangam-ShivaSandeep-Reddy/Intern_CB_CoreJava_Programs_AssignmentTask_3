package Print_the_Multiplication_Table;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter A Number: ");
		int num = scan.nextInt();
		int i = 1;
		System.out.println("Multiplication Table of " +num);
		while(i<=10) {
			System.out.println(num + " x " + i + " = " +(num*i));
			i++;
		}
	}

}
