package abstraction_packages_exceptionhandling.exception_handling;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s= new Scanner(System.in);
		
		System.out.print("Enter the number of elemets in the array: ");
		int len = s.nextInt();
		int[] array = new int[len];
		System.out.println("Enter the elements in the array: ");
		try {
			for(int i = 0; i < array.length; i++)
				array[i] = s.nextInt();
			System.out.print("Enter the index of the array you want to access: ");
			int keyIndex = s.nextInt();
			System.out.println("The array element at index "+ keyIndex +" = "+ array[keyIndex]);
			System.out.println("The array element successfully accessed");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
		}
		catch(InputMismatchException e) {
			System.out.println("java.lang.NumberFormatException");
		}
	}

}
