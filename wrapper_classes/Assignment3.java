package wrapper_classes;

import java.util.Scanner;
public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the integer number (1 to 255) :");
		int n = s.nextInt();
		
		String output = String.format("%8s", Integer.toBinaryString(n)).replace(' ', '0');
		System.out.println(output);	
	}

}
