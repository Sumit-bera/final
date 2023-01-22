package com.mile1.test;


import exception.NullMarksArrayException;
import exception.NullStudentObjectException;
import exception.NullNameException;
import service.StudentReport;
import service.StudentService;

import bean.StudentBean;

public class StudentMain {
  static StudentBean data[] = new StudentBean[4];

  static {
    for (int i = 0; i < data.length; i++) {
      data[i] = new StudentBean();
    }
    data[0] = new StudentBean("Sekar", new int[] { 85, 75, 95 });
    data[1] = new StudentBean(null, new int[] { 11, 22, 33 });
    data[2] = null;
    data[3] = new StudentBean("Monoj", null);

  }

  public static void main(String[] args) {
    StudentReport studentReport = new StudentReport();
    StudentService studentService = new StudentService();

    System.out.println("Grade Calculation:");

    String x = null;

    for (int i = 0; i < data.length; i++) {
      try {
        x = studentReport.validate(data[i]);
      } catch (NullNameException e) {
        x = "NullNameException occurred";
        e.printStackTrace();
      } catch (NullMarksArrayException e) {
        x = "NullMarksArrayException occurred";
        e.printStackTrace();
      } catch (NullStudentObjectException e) {
        x = "NullStudentException occurred ";
        e.printStackTrace();
      }

      if (x == "VALID") {
        String c = studentReport.findGrade(data[i]);
        System.out.println("GRADE = " + c);
      }
    }

      System.out.println("Number of Objects with Marks array as null = " +
          studentService.findNumberOfNullMarksArray(data));

      System.out.println("Number of Objects with Name as null = " +
          studentService.findNumberOfNullNames(data));

      System.out.println("Number of Objects that are entierly null = " +
          studentService.findNumberOfNullObjects(data));

    

  }
}