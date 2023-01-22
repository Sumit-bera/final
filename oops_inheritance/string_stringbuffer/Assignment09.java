package oops_inheritance.string_stringbuffer;

public class Assignment09 {
	
	static String mergeStrings(String str1, String str2) {
		String bigStr = str1.length() > str2.length() ? str1 : str2;
		String smallStr = str1.length() < str2.length() ? str1 : str2;
		String outStr = "";

		for (int i = 0; i < smallStr.length(); i++) {
			outStr += str1.charAt(i);
			outStr += str2.charAt(i);
		}
		outStr += bigStr.substring(smallStr.length(), bigStr.length());
		
		return outStr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Hello";
		String b = "World";
		
		System.out.print(mergeStrings(a, b));
	}

}
