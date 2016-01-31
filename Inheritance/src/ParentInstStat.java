class Parnt
{
    {
    	System.out.println("parent class inst block");
    }

	Parnt()//default constrtr
	{
		System.out.println("parent 0 arg const");
	}
	static
	{
		System.out.println("parent class static block");
	}	
}
public class ParentInstStat extends Parnt
{
	{
		System.out.println("child class instance blocks");
	}
	ParentInstStat()
	{
		//super(); default const of parnt class exe as der is no this keywrd
		System.out.println("child 0 arg const");
	}
	static
	{
		System.out.println("child class static block");
	}
	public static void main(String arg[])//parent static blck,child static blck exe
	{
		new ParentInstStat();
		//parent inst block,parnt const,child inst block,child const are exectd
		new ParentInstStat();
		//parent inst block,parnt const,child inst block,child const are exectd

	}
}
