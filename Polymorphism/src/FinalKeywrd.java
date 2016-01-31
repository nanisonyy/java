class Fin
{
     void marry()
     //rule 4:overriden method cant be final or use final keywd
     //final methods overridding is not possible
	{
		System.out.println("parnt method");
	}
}

public class FinalKeywrd extends Fin
{
	void marry()
	{
		final int a=10;
		//a=a+10; the final var cannot be assigned with a value it is a constant
		System.out.println(a);
	}
	public static void main(String[] arg)
	{
		new FinalKeywrd().marry();
	}
	

}
