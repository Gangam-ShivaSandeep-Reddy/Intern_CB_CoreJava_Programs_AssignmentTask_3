package EmployeeManagement_TreeSet;

import java.util.Comparator;
import java.util.TreeSet;

class Employee_Comparator {
	private int id;

	
	public Employee_Comparator(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return String.valueOf(id);
	}
}

class EmployeeComparator implements Comparator<Employee_Comparator> {
	@Override
	public int compare(Employee_Comparator e1, Employee_Comparator e2) {
		return Integer.compare(e1.getId(), e2.getId());
	}
}

class EmployeeManagementComparator {
	public static void main(String[] args) {
		
		TreeSet<Employee_Comparator> employeeSet = new TreeSet<>(new EmployeeComparator());

		employeeSet.add(new Employee_Comparator(1005));
		employeeSet.add(new Employee_Comparator(1020));
		employeeSet.add(new Employee_Comparator(1001));
		employeeSet.add(new Employee_Comparator(1045));

		System.out.println("Employee IDs (sorted): " + employeeSet);
	}
}
