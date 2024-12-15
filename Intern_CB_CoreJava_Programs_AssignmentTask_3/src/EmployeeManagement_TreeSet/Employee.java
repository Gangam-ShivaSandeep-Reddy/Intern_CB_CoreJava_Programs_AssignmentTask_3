package EmployeeManagement_TreeSet;

import java.util.TreeSet;

public class Employee {

	public static void main(String[] args) {

		TreeSet<Integer> employeeIDs = new TreeSet<>();

		employeeIDs.add(1005);
		employeeIDs.add(1020);
		employeeIDs.add(1001);
		employeeIDs.add(1045);

	
		System.out.println("Employee IDs (sorted): " + employeeIDs);
	}
}


