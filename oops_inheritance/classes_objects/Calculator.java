package oops_inheritance.classes_objects;

public class Calculator {
	public static int powerInt(int num1, int num2) {
		return (int) Math.pow(num1, num2);
	}
	
	public static double powerDouble(double num1, int num2) {
		return Math.pow(num1, num2);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(powerInt(5, 2));
		System.out.println(powerDouble(2.5, 2));
	}

}
