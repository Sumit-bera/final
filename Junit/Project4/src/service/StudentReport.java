package service;
import bean.StudentBean;
import exception.NullMarksArrayException;
import exception.NullNameException;
import exception.NullStudentObjectException;

public class StudentReport {

	public String findGrade (StudentBean studentObject)
	{
	int[] marks = studentObject.getMarks();
	int Sum = 0;
	for(int i= 0;i<marks.length;i++)
	{
	if(marks[i] <35)
	{
	return "F";
	}
	else
	{
	Sum += marks[i];
	}
	}
	if(Sum <=150)

	 return "grade is C";

	else if(Sum >150 && Sum <= 200)

	return "grade is B";

	else if(Sum>200&&Sum <= 250)
	return "grade is A";

	return "grade is A+";
	}
	   public String validate (StudentBean studentObject) 
	throws NullStudentObjectException, NullNameException, NullMarksArrayException	
	{
	if (studentObject == null)
	 {
	throw new NullStudentObjectException();
	}
	 else 
	{
	if (studentObject.getName() == null) 
	throw new NullNameException();
	if (studentObject.getMarks() == null) 
	throw new NullMarksArrayException();
				
	return findGrade(studentObject);
	}
	}
	
}
