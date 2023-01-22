package collection.set;

import java.util.*;
public class Employee_DB {
	TreeSet<Employee2> t=new TreeSet<Employee2>();
	public boolean addEmployee(Employee2 emp) {
		return t.add(emp);
	}
	
	void displayAllEmployees() {
		Iterator<Employee2> it=t.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
