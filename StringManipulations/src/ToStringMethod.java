
public class ToStringMethod {
	int eid;
	String ename;
	ToStringMethod(int eid,String ename)
	{
		this.eid=eid;
		this.ename=ename;
	}
	public static void main(String str[])
	{
		ToStringMethod tsm=new ToStringMethod(111,"harsha");
		System.out.println(tsm);//we can define like des or as below both mean same outpt
		System.out.println(tsm.toString());//toString is pre-defined method of Object class
	//toString() returns classname@hashcode when u print refernce var
		//output: ToStringMethod@2a139a55
	}

}
