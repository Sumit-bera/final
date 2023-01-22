package bean;

public class StudentBean {
	
	String name;
	int marks[];
	
	
	public StudentBean() {
		
	}

	public StudentBean(String name, int[] marks) {
		super();
		this.name = name;
		this.marks = marks;
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getMarks() {
		return marks;
	}

	public void setMarks(int[] marks) {
		this.marks = marks;
	}
	

}
