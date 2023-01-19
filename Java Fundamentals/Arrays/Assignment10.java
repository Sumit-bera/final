/*
 Print an array that contains the exact same numbers as the given array, but rearranged so that all the even
numbers come before all the odd numbers. Other than that, the numbers can be in any order. You may modify and
print the given array, or make a new array.

evenOdd([1, 0, 1, 0, 0, 1, 1]) → [0, 0, 0, 1, 1, 1, 1]

evenOdd([3, 3, 2]) → [2, 3, 3]

evenOdd([2, 2, 2]) → [2, 2, 2]
*/
import java.util.Arrays;

public class Assignment10{
	
	public static void main(String args[])
	{
		int arr[] = {1,0,1,0,0,1,1};
		int n = arr.length;
		int j = -1, temp;
		
		for (int i = 0; i < n; i++) {
	
			if (arr[i] % 2 == 0) {
	
				j++;
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		
		System.out.println(Arrays.toString(arr));
		
	}
}

