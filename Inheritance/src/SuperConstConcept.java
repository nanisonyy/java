class Cons
{
	Cons()
	{
		System.out.println("parent o arg const");
		//default const  
	}
	Cons(int x)
	{
		System.out.println("parent o arg const");
		//dis is not a default const so u need to call dis using super kywrd
	}
}
public class SuperConstConcept extends Cons {
	SuperConstConcept()
	{
		//super(); is executed by default when der is no this and super declared
		System.out.println("child 0 arg const");
	}
	SuperConstConcept(int a)
	{
		//super(); is executed by default when der is no this and super declared

		System.out.println("child 0 arg const");
	}
	public static void main(String arg[])
	{
		new SuperConstConcept();
		new SuperConstConcept(10);
	}

}
