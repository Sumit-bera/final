package oops_inheritance.string_stringbuffer;

import java.util.Scanner;

public class Assignment05 {

	static String excludeFirstLast(String str) {
		return str.substring(1, str.length()-1);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter the string: ");
		String str = s.nextLine();
		
		System.out.println(excludeFirstLast(str));
	}
}