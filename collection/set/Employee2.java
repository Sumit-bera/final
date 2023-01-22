package collection.set;


class Employee2 {
	int empId;
	String name;
	float salary;
	
	Employee2(int empId,String name,float salary){
		this.empId=empId;
		this.name=name;
		this.salary=salary;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getSalary() {
		return salary;
	}

	public void setSalary(float salary) {
		this.salary = salary;
	}
	
	public String getEmployeeDetails() {
		return "Employee id : "+empId+" Employee Name : "+name+" Salary : "+salary;
	}
	
}
