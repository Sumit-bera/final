import bean.StudentBean;
import exception.NullMarksArrayException;
import exception.NullNameException;
import exception.NullStudentObjectException;
import service.StudentReport;
import service.StudentService;


public class Student {
	
static StudentBean[] data = new StudentBean[4];
	
	static {
		for (int i = 0; i < data.length; i++) 
			data [i]= new StudentBean(); 
		
		data [0] = new StudentBean("sekar", new int[] {35, 35, 35});
		data [1] = new StudentBean(null, new int[] {11, 22, 33});
		data [2] = null;
		data [3] = new StudentBean("Manoj", null);
	
	}

	public static void main(String[] args) {
		
		StudentReport studentReport = new StudentReport();
		StudentService studentService = new StudentService();
		
		System.out.println("Grade Calculation:");
		
		String x = null;
		
		for (int i = 0; i < data.length; i++)  {
			try {
				x = studentReport.validate(data[i]);
			} catch (NullNameException e) {
				x = "NullNameException occured";
			} catch (NullMarksArrayException e) {
				x = "NullMarksArrayException occured";
			} catch (NullStudentObjectException e) {
				x = "NullObjectException occured";
			}
			
			System.out.println("GRADE = " + x);
		}
		
		System.out.println("Number of Objects with Marks array as null = " +  studentService.findNumberOfNullMarksArray(data));
        
		System.out.println("Number of Objects with Name as null = " +
								studentService.findNumberOfNullNames(data));
		System.out.println("Number of Objects that are entierly null = " +
								studentService.findNumberOfNullObjects(data));
		
		
		System.out.println("TC7: Number of Objects with Name as null = " +
				studentService.findNumberOfNullNames(data));		
		
		System.out.println("TC8: Number of Objects that are entierly null = " +
				studentService.findNumberOfNullObjects(data));
	
		System.out.println("TC9: Number of Objects with Marks array as null = " +
				studentService.findNumberOfNullMarksArray(data));
	

}

}
