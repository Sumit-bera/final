package oops_inheritance.string_stringbuffer;

public class Assignment01 {
	
	static boolean isPalindrome(String str) {
		int len = str.length();
		for (int i = 0; i < len / 2; i++) {
			if (str.charAt(i) != str.charAt(len - i - 1))
				return false;
			}
		return true;
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "mom";
		
		if (isPalindrome(str))
			System.out.print("String is Palindrome");
		else
			System.out.print("String is not Palindrome");
	}

}

