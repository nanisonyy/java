final class Fianl
{
	int a=10;//in final class the variables are not final dey can b accessed 
	//they are accessed in method marry()
	void marry()
	//while final class the methods are final 
	{
		a=a+10; 
		System.out.println(a);
}}
public class FianlClass 
{
	public static void main(String[] arg)
	{System.out.println(new Fianl().a);//we can access final class instance var 
	}
	
	

}
