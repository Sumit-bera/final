package collection.set;

import java.util.*;
public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> t=new TreeSet<String>();
		t.add("Rohit");
		t.add("Vikram");
		t.add("Amit");
		t.add("Sumit");
		t.add("Aman");
		
		System.out.println("Traversing the treeset elements ");
		Iterator it=t.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("Traversing the treeset elements in reverse order ");
		Iterator i=t.descendingIterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		System.out.println(t.contains("Rohan"));

	}

}
