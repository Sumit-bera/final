package collection.set;

import java.util.*;
public class TreeSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee_DB d=new Employee_DB();
		Employee2 e=new Employee2(123,"Suhit",34000);
		Employee2 e1=new Employee2(134,"Srabanti",45000);
		Employee2 e2=new Employee2(456,"Amit",67000);
		
		d.addEmployee(e);
		d.addEmployee(e1);
		d.addEmployee(e2);
		
		d.displayAllEmployees();
		
		
		
	}

}
