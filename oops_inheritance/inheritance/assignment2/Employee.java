package oops_inheritance.inheritance.assignment2;

public class Employee extends Person {
	private double salary;
	private int yearOfStart;
	private String nationalInsuranceNo;
	
	Employee(String name, double salary, int yearOfStart, String nationalInsuranceNo) {
		super(name);
		this.salary = salary;
		this.yearOfStart = yearOfStart;
		this.nationalInsuranceNo = nationalInsuranceNo;
	}

	public double getSalary() {
		return salary;
	}
	public int getYearOfStart() {
		return yearOfStart;
	}

	public String getNationalInsuranceNo() {
		return nationalInsuranceNo;
	}

}
