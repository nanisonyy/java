
public class Classsess {
	int a=10;
	static int b=20;
	{
		System.out.println("Instance block");
	}
	static 
	{
		System.out.println("Static block");
	}
	void m1(double d)
	{
		System.out.println("method1 I");

	}
	static void m2(String str)
	{
		System.out.println("method2 S");

	}
	Classsess()
	{
		System.out.println("0-arg const");

	}
	Classsess(int a)
	{
		System.out.println("1-arg const");

	}
	public static void main(String arg[])//static block exectd
	{
		new Classsess().m1(10.5);//instance blck,respective const,m1 method
		new Classsess(10).m2("harsha");//instance blck,respectv const,m2 method
	}

}
