package oops_inheritance.string_stringbuffer;

public class Assignment08 {

	
		static StringBuffer remove(String str)
		{
		String[] stars = str.split(".[\\*]+.");
		StringBuffer sb = new StringBuffer();
		
		for (String x : stars)
			sb.append(x);
		return sb;
		}
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			String str = "ab*cd";
			System.out.println(remove(str));
	}

}