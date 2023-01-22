package oops_inheritance.string_stringbuffer;

public class Assignment07 {
	
	static String removeX(String str) {
		if (str.toLowerCase().charAt(0) == 'x' && str.toLowerCase().charAt(str.length()-1) == 'x')
			return str.substring(1, str.length()-1);
		else
			return str;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "xHiX";
		
		System.out.println(removeX(str));
    	}

}
