package com.test.maven;
	import java.util.ArrayList; 
	 import java.util.List; 
	 
	 
	import org.apache.commons.beanutils.*;
	import org.apache.commons.collections.CollectionUtils;
	import org.apache.commons.collections.functors.EqualPredicate; 


	 
	 public class Filter { 
	 
	 
	 	public static void main(String[] args) { 
	 		List<Studt> stList = new ArrayList<Studt>(); 
	 		stList.add(new Studt(567, "Jhon", 323)); 
	 		stList.add(new Studt(45, "Ave", 6452)); 
	 		stList.add(new Studt(57, "Tim", 4552)); 
	 		stList.add(new Studt(167, "Tao", 1234)); 
	 		stList.add(new Studt(7, "Ken", 456)); 
	 		 
	 		stList.add(new Studt(567, "Jhon", 323)); 
	 		stList.add(new Studt(45, "Ave", 6452)); 
	 		stList.add(new Studt(57, "Tim", 4552)); 
	 		stList.add(new Studt(167, "Tao", 1234)); 
			stList.add(new Studt(7, "Ken", 456)); 
	 		 


Studt stud = (Studt)CollectionUtils.find(stList, buildPredicate("sno",45)); 
		 
 		//List<Studt> studtList = (List<Studt>)CollectionUtils.select(stList, buildPredicate("sno",45)); 
 		 
 		System.out.println(stud);
 	} 
 
 
 	public static BeanPredicate buildPredicate(String propertyyName,Object valuee) { 
		EqualPredicate predicatValue = new EqualPredicate(valuee); 
 		BeanPredicate beanPredicat = new BeanPredicate(propertyyName, predicatValue); 
 		return beanPredicat; 
 	} 
 
 	} 
