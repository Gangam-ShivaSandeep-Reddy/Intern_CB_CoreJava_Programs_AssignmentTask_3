package EmployeeManagement_TreeSet;

import java.util.TreeSet;

class Employees implements Comparable<Employees> {
	private int employeeid;
	private String employeeName;

	public Employees(int employeeid) {
		this.employeeid = employeeid;
	}

	public int getEmployeeid() {
		return employeeid;
	}

	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	@Override
	public int compareTo(Employees emp) {
		return Integer.compare(this.employeeid, emp.employeeid);
	}

	@Override
	public String toString() {
		return String.valueOf(employeeid);
	}
}

class EmployeeManagementComparable {
	public static void main(String[] args) {
		TreeSet<Employees> employeeSet = new TreeSet<>();

		employeeSet.add(new Employees(1005));
		employeeSet.add(new Employees(1020));
		employeeSet.add(new Employees(1001));
		employeeSet.add(new Employees(1045));

		System.out.println("Employee IDs (sorted): " + employeeSet);
	}
}
