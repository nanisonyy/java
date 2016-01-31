
final public class Inherit extends Aaa
//this mean Inherit class cannot be inherited by any other class
//but it can extends any class
{
	void m2()
	{
	System.out.println("m2");
	}
	public static void main(String[] arg)
	{
	new Inherit().m1();
	new Inherit().m2();
	}
	}
 class Aaa//if da class is declared final den it cannot be inherited
{
	void m1()
	{
		System.out.println("m1");
	}
	}
	
	
