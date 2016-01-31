class X
{
	void m1()
	{
		System.out.println("parent class m1");
		
	}
}
public class SuperMethods extends X {
	void m1()
	{
		System.out.println("child class m1");
	}
	void m2()
	{
		this.m1();//m1(); can also be used bcz this is optional in current class
		super.m1();//super used to access parent method
	}
	public static void main(String arg[])
	{
		new SuperMethods().m2();
	}
}
