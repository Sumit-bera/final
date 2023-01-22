package collection.list;

import java.util.*;
public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=5;
		Vector<Integer>v=new Vector<Integer>(n);
		for(int i=10;i<=20;i+=2)
			v.add(i);
		
		Enumeration e=v.elements();
		System.out.println("The vector elements are:");
		while(e.hasMoreElements())
			System.out.println(e.nextElement());
		
		System.out.println();
		
		
		ListIterator li=v.listIterator();
		System.out.println("The vector elements are:");
		while(li.hasNext())
			System.out.println(li.next());
		
		System.out.println();
		
	
		
		Iterator i=v.iterator();
		System.out.println("The vector elements are:");
		while(i.hasNext())
			System.out.println(i.next());
	}

}
