package edu.jsp.manytomany.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import edu.jsp.manytomany.dto.Student;

public class StudentDao {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Prem_Prakash");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();
		
		public void saveStudent(Student student)
		{
			transaction.begin();
			manager.persist(student);
			transaction.commit();
		}
		public Student getStudentById(int id )
		{
			Student st =manager.find(Student.class, id);
			//System.out.println(st);
			return st;
		}
		public List<Student> getAllStudent() {
			String query = "SELECT s FROM Student s";
			Query q = manager.createQuery(query);
			List<Student> list = q.getResultList();
//			return q.getResultList();
			return list;
			
		}
		public void updateStudent(int id, String name)
		{
			Student student = getStudentById(id);
			student.setName(name);
			transaction.begin();
			manager.merge(student);
			transaction.commit();
			System.out.println("Student name has been changed sucessfully");
			
		}
		public void deleteStudent(int id )
		{
			Student student = getStudentById(id);
			transaction.begin();
			manager.remove(student);
			transaction.commit();
			System.out.println("Student has been removed sucessfully");
			
		}
}
