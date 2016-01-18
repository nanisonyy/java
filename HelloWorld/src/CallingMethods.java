
public class CallingMethods {
	void m1()
	{
		m2();
		System.out.println("m1 meth");
	}
	void m2()
	{
		m3();
		System.out.println("m2 meth");
	}
	void m3()
	{
		System.out.println("m3 meth");
	}
	public static void main(String args[])
	{
		CallingMethods cm=new CallingMethods();
		cm.m1();
	}

}
