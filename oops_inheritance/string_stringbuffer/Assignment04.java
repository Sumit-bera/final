package oops_inheritance.string_stringbuffer;

public class Assignment04 {
	
	static String firstHalfString(String str) {
		if(str.length() % 2 == 0)
			return str.substring(0, str.length()/2);
		else 
			return "null";
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "TomCat";
		
		System.out.println(firstHalfString(str));
	}

}
