class Rulee0
{
	static void maa()//overridden method
	{
		System.out.println("parent method");
	}
}
public class Rulee5 extends Rulee0{
	static void maa()//overridding method
	{
		System.out.println("child method");
	}
	public static void main(String[] arg)//overridden method is exe
	{
		Rulee0 p=new Rulee5();
//output will be overridden method bcz static methods cant be accessed by object
		p.maa();
	}

}
