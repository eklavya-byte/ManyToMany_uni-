package edu.jsp.manytomany.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import edu.jsp.manytomany.dto.Course;
import edu.jsp.manytomany.dto.Student;


public class CourseDao {
	
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("Prem_Prakash");
	EntityManager manager = factory.createEntityManager();
	EntityTransaction transaction = manager.getTransaction();
	
	public void saveCourse(Course course)
	{
		transaction.begin();
		manager.persist(course);
		transaction.commit();
	}
	public Course getCourseById(int id )
	{
		Course crs =manager.find(Course.class, id);
		return crs;
	}
	public List<Course> getAllCourse() {
		String query = "SELECT s FROM Course s";
		Query q = manager.createQuery(query);
		List<Course> list = q.getResultList();
//		return q.getResultList();
		return list;
	}
	public void updateCourseName(int id, String name)
	{
		Course course = getCourseById(id);
		course.setName(name);
		transaction.begin();
		manager.merge(course);
		transaction.commit();
		System.out.println("Course name has been changed successfully");
	}
	public void updateCourseCost(int id, double cost)
	{
		Course course = getCourseById(id);
		course.setCost(cost);
		transaction.begin();
		manager.merge(course);
		transaction.commit();
		System.out.println("Course cost has been changed successfully");
	}
	
	public void deleteCourse(int id )
	{
		Course course = getCourseById(id);
		transaction.begin();
		manager.remove(course);
		transaction.commit();
		System.out.println("Course has been removed successfully");
		
	}
	
}
