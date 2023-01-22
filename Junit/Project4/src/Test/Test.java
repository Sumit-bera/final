package Test;


import java.util.ArrayList;
import java.util.List;
import bean.StudentBean;
import exception.NullMarksArrayException;
import exception.NullStudentObjectException;
import exception.NullNameException;
import service.StudentReport;
import service.StudentService;

public class Test {

	@org.junit.Test
	public void test() throws  NullMarksArrayException, NullStudentObjectException {
		String[] exop= {"A","A","A+","A+","F","F","F","F"};
		StudentReport sr=new StudentReport();
		StudentBean s[]=new StudentBean[10];
		String in[]=new String[10];
		s[0]=new StudentBean("A1",new int[] {72,73,74});
		s[1]=new StudentBean("B1",new int[] {75,76,77});
		s[2]=new StudentBean("C1",new int[] {99,99,99});
		s[3]=new StudentBean("C3",new int[] {100,100,99});
		s[4]=new StudentBean("B2",new int[] {13,88,13});
		s[5]=new StudentBean("C3",new int[] {14,14,99});
		s[6]=new StudentBean("A2",new int[] {77,55,12});
		s[7]=new StudentBean(null,new int[] {13,88,13});
		s[8]=new StudentBean("A2",null);
		s[9]=null;
		
		for(int i=0;i<10;i++) {
		try {
			in[i]=sr.findGrade (s[i]);
		}catch(Exception e){
			in[i]=null;
		}
		}

		
		List<String> values = new ArrayList<String>();
	      for(String data: in) {
	         if(data != null) { 
	            values.add(data);
	         }
	      }
	      String[] target = values.toArray(new String[values.size()]);
		assertArrayEquals(exop, target);
	}

	private void assertArrayEquals(String[] exop, String[] target) {
		// TODO Auto-generated method stub
		
	}

}

