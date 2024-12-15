package EmployeeSalary_Calculation_IfElse_Ladder;

import java.util.Scanner;

public class EmployeeSalary {


	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter years of experience: ");
		int yearsOfExperience = scanner.nextInt();

		int salary = 0;


		if (yearsOfExperience < 0) {
			System.out.println("Invalid input. ");
		} else if (yearsOfExperience > 10) {
			salary = 100000;
		} else if (yearsOfExperience >= 5 && yearsOfExperience <= 10) {
			salary = 75000;
		} else {
			salary = 50000;
		}


		if (yearsOfExperience >= 0) {
			System.out.println("Salary: " + salary);
		}


	}
}



