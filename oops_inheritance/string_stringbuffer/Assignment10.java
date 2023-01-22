package oops_inheritance.string_stringbuffer;

public class Assignment10 {

	static String lastRepeat(String str, int n) {
		String str2 = str.substring(str.length()-n);
		String outStr = "";
		
		for(int i = 0; i  < n; i++) {
			outStr += str2;
		}
		return outStr;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Wipro";
		int n = 2;
		
		System.out.println(lastRepeat(str, n));
	}

}
