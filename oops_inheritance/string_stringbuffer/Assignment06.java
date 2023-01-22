package oops_inheritance.string_stringbuffer;


public class Assignment06 {
	
	static String shortLongShort(String str1, String str2) {
			if(str1.length() < str2.length())
				return str1 + str2 + str1;
			else
				return str2 + str1 + str2;
		}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Hi";
		String b ="Hello";
		
		System.out.println(shortLongShort(a, b));
	}

}

