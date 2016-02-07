package com.test.maven;
import java.util.ArrayList;  
 import java.util.List; 
 
public class FilterDemo { 
 
 
 	public static void main(String[] args) { 
 		List<Studt> stuList = new ArrayList<Studt>(); 
 		stuList.add(new Studt(567, "Jhon", 323)); 
 		stuList.add(new Studt(45, "Ave", 6452)); 
 		stuList.add(new Studt(57, "Tim", 4552)); 
 		stuList.add(new Studt(167, "Tao", 1234)); 

 		System.out.println(stuList);
 		 
 		List<Studt> filterList = new ArrayList<Studt>(); 
 		 
 		for(Studt student : stuList){ 
 			if(student.getSno() > 50 && student.getFee() < 5000){ 
 				filterList.add(student); 
 			} 
 		} 
 
 		System.out.println(filterList); 
 	} 
 
 
 } 
 

 
  