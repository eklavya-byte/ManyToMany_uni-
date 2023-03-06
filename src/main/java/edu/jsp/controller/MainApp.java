package edu.jsp.controller;

import java.util.List;
import java.util.Scanner;

import edu.jsp.manytomany.dao.CourseDao;
import edu.jsp.manytomany.dao.StudentDao;
import edu.jsp.manytomany.dto.Course;
import edu.jsp.manytomany.dto.Student;

public class MainApp {
	public static void template()
	{
		System.out.println("\n");
		System.out.println("Welcome to Student-Course Program");
		System.out.println("***********_____---------______**********");
		System.out.println("Enter sa to see all the datails of Student");
		System.out.println("Enter SS for to save student data");
		System.out.println("Enter si to search student by id");
		System.out.println("Enter su to update student details");
		System.out.println("Enter sd to delete Student details");
		System.out.println("*********------------------------**********");
		System.out.println("Enter ca to see all the details of course");
		System.out.println("Enter cs to save course details");
		System.out.println("Enter ci to search course by id");
		System.out.println("Enter cname/ccost to update course details");
		System.out.println("Enter dc to delet course details ");	
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CourseDao corDao = new CourseDao();
		StudentDao stuDao = new StudentDao();
		String input2= "";
		template();
		do {
			System.out.println("\n ");
			System.out.print("Enter your choice :  ");
			input2 = sc.next().toLowerCase();

		    switch(input2) {
		    case "sa":
			      System.out.println("Searching all Student data.......");
			      System.out.println("##############################################################\n");
			      
			      List<Student> student =stuDao.getAllStudent();
					for(Student st:student)
					{
						System.out.println(st);
					}
					System.out.println("###############################################################");
			      break;
		    case "ss":
		      System.out.println("Saving the sutudent data .......");
		      System.out.println("Do this manually using MainApp2 , template is there ! thank you ");
		      break;
		    case "si":
		    	try {
		      System.out.print("Enter Student id:  ");
		      int a = Integer.parseInt(sc.next());
		      System.out.println("Searching Student Details by Id");
		      System.out.println(stuDao.getStudentById(a));
		      }catch(Exception e)
		    	{
		    	  System.out.println("Enter valid number ");
		    	}
		      
		      break;
		    case "su":
		    	try {
				      System.out.print("Enter Student id:  ");
				      System.out.println("\n");
				      int a = Integer.parseInt(sc.next());
				      System.out.print("Enter first name :  ");
				      String name =  sc.next();
				      System.out.print("Enter last name :  ");
				      String name2 =  sc.next();
				      String name3 = name+" "+name2;
				      System.out.println("Updating student name ");
						System.out.println(stuDao.getStudentById(a).getName());
						stuDao.updateStudent(a, name3);
						System.out.println(stuDao.getStudentById(a).getName());
				      }catch(Exception e)
				    	{
				    	  System.out.println("Enter valid number ");
				    	}	    
		      break;
		    case "sd":
		      
		      try {
		      System.out.print("Enter Student id:  ");
		      int a = Integer.parseInt(sc.next());
		      System.out.println("Deleting the Student based on id ");
		      stuDao.deleteStudent(a);
		      System.out.println("Deleted .......");
		      }catch(Exception e)
		    	{
		    	  System.out.println("Enter valid number ");
		    	}     
		      break;
		    case "ca":
			      System.out.println("Searching all course data.......");
					List<Course> course = corDao.getAllCourse();
					System.out.println(course.toString());
					for(Course c:course)
					{
						System.out.println(c);
					}
			      break;
		    case "cs":
		      System.out.println("Saving the Course Details");
		      System.out.println("do this manually using MainApp2 template is there !");
		      break;   
		    case "ci":
			    	try {
					      System.out.print("Enter Course id:  ");
					      int a = Integer.parseInt(sc.next());
					      System.out.println("Searching Course Details by Id");
					      System.out.println(corDao.getCourseById(a));
					      }catch(Exception e)
					    	{
					    	  System.out.println("Enter valid number ");
					    	}
			      break;
		    case "cname":
			    	try {
					      System.out.print("Enter Course id:  ");
					      System.out.println("\n");
					      int a = Integer.parseInt(sc.next());
					      System.out.print("Enter course first name :  ");
					      String name =  sc.next();
					      System.out.print("Enter course last name :  ");
					      String name2 =  sc.next();
					      String name3 = name+" "+name2;
					      System.out.println("Updating Course name ");
						  System.out.println(corDao.getCourseById(a).getName());	
						  stuDao.updateStudent(a, name3);
						  corDao.updateCourseName(a, name3);
						  System.out.println(corDao.getCourseById(a).getName());
					      }catch(Exception e)
					    	{
					    	  System.out.println("Enter valid number ");
					    	}
			      break;
		    case "ccost":
			      System.out.println("Update cost of Course");
			      break;
		    case "cd":
			      System.out.println("Delete the Course Details");
			      try {
				      System.out.print("Enter Course id:  ");
				      int a = Integer.parseInt(sc.next());
				      System.out.println("Deleting the Course details based on id ");
				      corDao.deleteCourse(a);
				      System.out.println("Deleted .......");
				      }catch(Exception e)
				    	{
				    	  System.out.println("Enter valid number ");
				    	}
			      break;      
		    case"exit":
		    	System.out.println("Bye see you again");
		    	break;
		    default:
		        System.out.println("Wrong Input , input valid word/letters !");
		        template();
		    }		
		}while(!input2.equals("exit"));
		System.out.println("Bye ! see you soon !");
		sc.close();
	}
}
