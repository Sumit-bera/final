package wrapper_classes;

public class Employee implements Cloneable {
	private String name;
	private char gender;
	private int empid;
	
	public Employee(String name, char gender, int empid) {
		this.name = name;
		this.gender = gender;
		this.empid = empid;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	@Override
	public Employee clone() {
		try {
			return (Employee) super.clone();
		} catch (CloneNotSupportedException e) {
			System.out.println("Cloning Not Allowed");
			return this;
		}		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee emp1 = new Employee("Sumit Bera",'M',101);
		Employee empClone = emp1.clone();
		
		empClone.setName("Srabanti Bera");
		empClone.setGender('F');
		empClone.setEmpid(201);
		System.out.print(empClone.getName()+"\t");
		System.out.print(empClone.getGender()+"\t");
		System.out.println(empClone.getEmpid()+"\n");
		System.out.print(emp1.getName()+"\t");
		System.out.print(emp1.getGender()+"\t");
		System.out.println(emp1.getEmpid());
	}

}
