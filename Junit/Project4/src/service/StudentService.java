package service;
import bean.StudentBean;

public class StudentService {
	
	public int findNumberOfNullMarksArray(StudentBean data[])
	{
	int nullMarksCount = 0;
	for (int i = 0; i < data.length; i++) 
	{
	try
	 {
	data[i].getMarks();
	} 
	catch (Exception e) 
	{
	nullMarksCount++;
	}
	}
			
	return nullMarksCount;
	}
	public int findNumberOfNullNames (StudentBean data[])
	{
	int nullNamesCount = 0;
	for(int i=0;i<data.length;i++)
	{
	try
	{
	data[i].getName();
	}
	catch(Exception e)
	{
	nullNamesCount++;
	}
	}
	return nullNamesCount;
	}
	public int findNumberOfNullObjects (StudentBean  data[])
	{
	int nullObjectsCount = 0;
	for(int i = 0;i<data.length;i++)
	{
	if (data[i] == null)
	nullObjectsCount++;
	}
	return nullObjectsCount;
	}

}
