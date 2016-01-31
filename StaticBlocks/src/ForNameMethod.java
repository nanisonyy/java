
public class ForNameMethod {
	public static void main(String arg[])throws ClassNotFoundException
	{
		Class.forName("B");
		//calling other class static blocks dynamically at run-time we use 
		//predefined method "forName" from predefined class "Class"
		Class.forName("C");
	}

}
class B
{
	static
	{
		System.out.println("class b static block");
	}
}
class C
{
	static
	{
		System.out.println("class c static block");
	}
}