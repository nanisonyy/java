package com.test.jpa; 
 
 
 import javax.persistence.EntityManager; 
 import javax.persistence.EntityManagerFactory; 
 import javax.persistence.EntityTransaction; 
 import javax.persistence.Persistence; 
 


 import com.test.pojo.Student;
import com.test.pojo.User; 
 
 
 public class JPAExample { 
 	 
 	public static void main(String s[]){ 
 		EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("jpa-example"); 
 		EntityManager emManager = emFactory.createEntityManager(); 
 		 
 		EntityTransaction transaction = emManager.getTransaction(); 
 		 
 		transaction.begin(); 
 		 
 		User user = emManager.find(User.class, 12); 
 		 
 		System.out.println( "$$$$$$$$$$$$$ Sname : " + user.getSname()); 
 		 
 		System.out.println("########################"); 
 		 
 		System.out.println( "$$$$$$$$$$$$$ CName : " + user.getCourse().getCname()); 
 		 
 		System.out.println("########################"); 
 		 
 		//Insert 
 		/*Student student = new Student(8777,"Tao",2345,"MS"); 
 		emManager.persist(student); */
 		 
 		Student stuObj = emManager.find(Student.class, 8777); 
 		 
 		//emManager.remove(stuObj); //Delete 
 		 
 		stuObj.setSname("UpXXX"); 
 		 
// 		Student student1 = emManager.find(Student.class, 79); 
 		 
		//Student student2 = emManager.find(Student.class, 5432); 
 		 
		 
 	//System.out.println("Student ############ " + student1); 
// 		 
 		transaction.commit(); 
 		emManager.close(); 
 		//System.out.println("Student ############ " + student1); 
 		//System.out.println("Student ############ " + student2); 
 		 
 		//emManager.close(); 
 		//EntityTransaction transaction = emManager.getTransaction(); 
 		//Begin --> Insert/Create , Update , Delete 
 		//transaction.begin(); 
 		 
 		//DB Oeprations 
 	 
 		//Insert 
 		/*Student student = new Student(5432,"Tao",2345,"MS"); 
 		emManager.persist(student); 
 		transaction.commit(); 
 		emManager.close();*/
 	} 
 
 
 } 
