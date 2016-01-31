package com.test.maven;
import java.util.*;
import java.lang.*;

public class Employee 
{
	public static void main(String[] arg)
	{
		Comp e1=new Comp(30,"harsha");
		Comp e2=new Comp(100,"vinay");
		Comp e3=new Comp(3000,"kumar");
		Comp e4=new Comp(1000,"eswari");
		TreeSet t=new TreeSet();
		t.add(e1);
		t.add(e2);
	    t.add(e3);
	    t.add(e4);
	    System.out.println(t);
	    TreeSet t1=new TreeSet(new MyComp());
	    t1.add(e1);
	    t1.add(e2);
	    t1.add(e3);
	    t1.add(e4);
	    System.out.println(t1);
	    
	}

}
class Comp implements Comparable
{
	int eid;
	String ename;
	Comp(int eid,String ename)
	{
	this.eid=eid;
	this.ename=ename;
	}
	
	
	@Override
	public String toString() {
		return "Comp [eid=" + eid + ", ename=" + ename + "]";
	}

	@Override
	public int compareTo(Object obj) {
		int eid1=this.eid;
		Comp e=(Comp)obj;
		int eid2=e.eid;
		if(eid1 < eid2)
		return -1;
		else if(eid1 >eid2)
			return +1;
		else
			return 0;
	}
}
class MyComp implements Comparator
{

	@Override
	public int compare(Object o1, Object o2) {
		Comp c1=(Comp)o1;
		Comp c2=(Comp)o2;
		String s1=c1.ename;
		String s2=c2.ename;
		return s1.compareTo(s2);
		
	}
	
}
