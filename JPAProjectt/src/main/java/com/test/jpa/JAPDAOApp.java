package com.test.jpa; 
 
 
 import java.util.List; 
 
 
import com.test.dao.StudentDAO; 
 import com.test.pojo.Student; 
 
 
public class JAPDAOApp { 
 

	public static void main(String[] args) { 
		StudentDAO studentDAO = new StudentDAO(); 
 		 
 		//Insert 
 		/*studentDAO.save(new Student(25, "harsha", 9009,"MS")); 
 		studentDAO.save(new Student(26, "harsha", 9009,"MD"));  */
		
 		//Update 
		//studentDAO.update(new Student(101, "ABC", 790, "MN")); 
 		 
 		//Delete : Not Working 
 		//studentDAO.delete(25); 
		 
 		//Find / Read 
 	/*	Student student = studentDAO.findBySno(103); 
 		System.out.println(student);*/
		
		/*List<Student> stuList =  studentDAO.getAllStudents();//studentDAO.getAllStudentsByFee(7000); 
 		for(Student stu : stuList){ 
 			System.out.println(" ############# " + stu); 
 		} */
		
		/*List<Student> stuList1 =  studentDAO.getAllStudentsByFee(345);//studentDAO.getAllStudentsByFee(7000); 
 		for(Student stu : stuList1){ 
 			System.out.println(" ############# " + stu); 
 		} */
		
		List<Student> stuList1 =  studentDAO.getAllStudentsByName("h%");//studentDAO.getAllStudentsByFee(7000); 
 		for(Student stu : stuList1){ 
 			System.out.println(" ############# " + stu); 
 		} 
 		System.out.println(" student  ########### "+studentDAO.getAllStudents()); 
 
 
 	} 
 
 
 } 

