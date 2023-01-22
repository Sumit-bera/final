package oops_inheritance.inheritance.assignment2;

public class TestEmployee {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee e1= new Employee("Sumit Bera",350000, 2022, "SU1234");
		
		System.out.println("Employee Details :");
		System.out.println("Name: " + e1.getName());
		System.out.println("Year Of Starting: " + e1.getYearOfStart());
		System.out.println("Salary: " + e1.getSalary());
		System.out.println("Insurance Number: " + e1.getNationalInsuranceNo());
	}
}
