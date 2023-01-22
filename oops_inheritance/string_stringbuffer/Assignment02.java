package oops_inheritance.string_stringbuffer;

public class Assignment02 {

		static String concatenate(String str1, String str2) {
			String outStr = "";
			if (str1.charAt(str1.length()-1) == str2.charAt(0))
				outStr = str1.substring(0, str1.length()-1) + str2;
			else
				outStr = str1 +" " + str2;
			
			return outStr.toLowerCase();
		}
		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String str1 = "My name is ";
			String str2 = " sumit";
		
			System.out.println(concatenate(str1, str2));
		}

	}
