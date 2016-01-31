
public class Emp {
	
	int eid;
	String ename;
	Emp(int eid,String ename)
	{
		this.eid=eid;
		this.ename=ename;
	}
	public String toString()//overrided toString method in Object class
	{
		return "eid="+eid+"ename="+ename;//my output is defined insted of clasname@hashcode
	}
	public static void main(String str[])
	{
		 Emp em=new Emp(111,"harsha");
		System.out.println(em);//we can define like des or as below both mean same outpt
		System.out.println(em.toString());//toString is pre-defined method of Object class
	}
}
