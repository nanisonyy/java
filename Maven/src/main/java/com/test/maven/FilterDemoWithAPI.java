package com.test.maven;

 import java.util.ArrayList; 
 import java.util.List; 
 
 
 import org.apache.commons.beanutils.*;
import org.apache.commons.collections.CollectionUtils;
import org.apache.commons.collections.functors.EqualPredicate; 


 
 public class FilterDemoWithAPI { 
 
 
 	public static void main(String[] args) { 
 		List<Studt> stuList = new ArrayList<Studt>(); 
 		stuList.add(new Studt(567, "Jhon", 323)); 
 		stuList.add(new Studt(45, "Ave", 6452)); 
 		stuList.add(new Studt(57, "Tim", 4552)); 
 		stuList.add(new Studt(167, "Tao", 1234)); 
 		stuList.add(new Studt(7, "Ken", 456)); 
 		 
 		stuList.add(new Studt(567, "Jhon", 323)); 
 		stuList.add(new Studt(45, "Ave", 6452)); 
 		stuList.add(new Studt(57, "Tim", 4552)); 
 		stuList.add(new Studt(167, "Tao", 1234)); 
		stuList.add(new Studt(7, "Ken", 456)); 
 		 
 	
		EqualPredicate predicateValue = new EqualPredicate(45); 
 		BeanPredicate beanPredicate = new BeanPredicate("sno", predicateValue); 
 		Studt student=(Studt)CollectionUtils.find(stuList, beanPredicate) ;
 		System.out.println(student);
 	} 
 
 
 } 
