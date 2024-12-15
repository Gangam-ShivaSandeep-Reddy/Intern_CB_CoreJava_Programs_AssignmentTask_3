package StudentDatabase_ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentDatabase {

	private ArrayList<Student> students;

	public StudentDatabase() {
		students = new ArrayList<>();
	}


	public void addStudent(String name, int rollNumber) {
		Student student = new Student(name, rollNumber);
		students.add(student);
		System.out.println("Student added: " + student);
	}


	public void removeStudent(int rollNumber) {
		for (Student student : students) {
			if (student.getRollNumber() == rollNumber) {
				students.remove(student);
				System.out.println("Student removed: " + student);
				return;
			}
		}
		System.out.println("Student with roll number " + rollNumber + " not found.");
	}


	public void displayStudents() {
		System.out.println("Students in the database:");
		for (Student student : students) {
			System.out.println(student);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		StudentDatabase database = new StudentDatabase();


		System.out.print("Enter student name: ");
		String name = scanner.nextLine();
		System.out.print("Enter student roll number: ");
		int rollNumber = scanner.nextInt();

		database.addStudent(name, rollNumber);


		database.displayStudents();


	}
}


