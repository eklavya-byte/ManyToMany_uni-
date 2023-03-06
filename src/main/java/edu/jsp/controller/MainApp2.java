package edu.jsp.controller;

import java.util.Arrays;
import java.util.List;

import edu.jsp.manytomany.dao.CourseDao;
import edu.jsp.manytomany.dao.StudentDao;
import edu.jsp.manytomany.dto.Course;
import edu.jsp.manytomany.dto.Student;

public class MainApp2 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Student student1 = new Student();
//		student1.setId(101);
//		student1.setName("Narendra");
//		student1.setAge(24);
//		Student student2 = new Student();
//		student2.setId(102);
//		student2.setName("Prem");
//		student2.setAge(25);
//		Student student3 = new Student();
//		student3.setId(103);
//		student3.setName("Anshu");
//		student3.setAge(22);
		
		
		Course course1 = new Course();
		course1.setId(501);
		course1.setName("java fullstack");
		course1.setCost(30000.00);
		Course course2 = new Course();
		course2.setId(502);
		course2.setName("database");
		course2.setCost(30000.00);
		Course course3 = new Course();
		course3.setId(503);
		course3.setName("Testing");
		course3.setCost(30000.00);
		List<Course> courses1 = Arrays.asList(course1,course2);
		List<Course> courses2 = Arrays.asList(course1,course2,course3);
		
//		student1.setCourses(courses1);
//		student2.setCourses(courses2);
//		student3.setCourses(courses1);
		
		CourseDao corDao = new CourseDao();
//		corDao.saveCourse(course1);
//		corDao.saveCourse(course2);
//		corDao.saveCourse(course3);
		
		StudentDao stuDao = new StudentDao();
//		stuDao.saveStudent(student1);
//		stuDao.saveStudent(student2);
//		stuDao.saveStudent(student3);
		
		//stuDao.getStudentById(102);
		
		//corDao.getCourseById(502);
		
//		List<Student> student =stuDao.getAllStudent();
//		for(Student st:student)
//		{
//			System.out.println(st);
//		}
//		System.out.println("_____----------------_________");
//		
//		List<Course> course = corDao.getAllCourse();
//		System.out.println(course.toString());
//		for(Course c:course)
//		{
//			System.out.println(c);
//		}
//		System.out.println(stuDao.getStudentById(102).getName());
//		stuDao.updateStudent(102, "Sanjay Singhania");
//		System.out.println(stuDao.getStudentById(102).getName());
		
//		System.out.println(corDao.getCourseById(502).getName());
//		corDao.updateCourseName(502, "pl/sql");
//		System.out.println(corDao.getCourseById(502).getName());
		
//		System.out.println(corDao.getCourseById(502).getCost());
//		corDao.updateCourseCost(502, 32000.00);
//		System.out.println(corDao.getCourseById(502).getCost());	
	}
}