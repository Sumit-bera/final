/*
 Given an array of type int, print true if every element is 1 or 4. 


 only14([1, 4, 1, 4]) → true

 only14([1, 4, 2, 4]) → false

 only14([1, 1]) → true

*/
public class Assignment11 {

	public static void main(String[] args) {
		
		int[] arr = {1,4,2,4};
		int n = arr.length;
		int counter = 0;
		
		for (int i = 0; i < n; i++) {
			
			if (arr[i] == 1 || arr[i] == 4) {
				counter += 1;
				continue;
			}
			
			else if (arr[i] != 1 || arr[i] != 4){
				System.out.println("False");
				break;
			}
			
		}
		
		if (counter == n) {
			System.out.println("True");
		}
		
	}

}
