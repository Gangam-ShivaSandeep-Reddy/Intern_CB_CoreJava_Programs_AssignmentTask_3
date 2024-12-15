package Grade_ofA_Student_Marks;

import java.util.Scanner;

public class StudentGrade {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter the marks of the student: ");
		int marks = scanner.nextInt();


		String grade;
		if (marks > 100 || marks < 0) {
			grade = "Invalid marks. Please enter a value between 0 and 100.";
		} else if (marks > 90) {
			grade = "A";
		} else if (marks > 75) {
			grade = "B";
		} else if (marks > 60) {
			grade = "C";
		} else if (marks > 40) {
			grade = "D";
		} else {
			grade = "F";
		}

		System.out.println("Grade: " + grade);
	}
}


