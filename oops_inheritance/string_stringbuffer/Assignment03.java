package oops_inheritance.string_stringbuffer;

public class Assignment03 {

	static String copies(String str1) {
		String str2 = "";
		int n=str1.length();
		
		for (int i = 0; i < n; i++) {
			str2 += str1.substring(0, 2);
		}
		return str2;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "Wipro";
		
		System.out.println(copies(str1));
	}

}
