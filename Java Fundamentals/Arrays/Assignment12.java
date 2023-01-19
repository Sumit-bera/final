/*
Given 2 int arrays, a and b, each length 3, form a new array of length 2, containing their middle elements.

middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]

middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]

middleWay([5, 2, 9], [1, 4, 5]) → [2, 4]

*/
import java.util.Arrays;
import java.util.*;

public class Assignment12 {

	public static void main(String[] args) {
		
		int[] a = new int [3];
		int[] b = new int [3];
		int[] c = new int [2];
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 1st array elements: ");
		
		for (int i = 0; i < 3; i++) {
			a[i] = input.nextInt();
		}
		
		System.out.println("Enter 2nd array elements: ");
		
		for (int j = 0; j < 3; j++) {
			b[j] = input.nextInt();
		}
		
		c[0] = a[1];
		c[1] = b[1];
		
		System.out.println(Arrays.toString(c));
		input.close();
	}

}
