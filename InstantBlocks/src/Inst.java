
public class Inst {
	Inst()
	{
		//multiple constructors can also be created with different param list
		System.out.println("0 arg constr");
	}
	Inst(int a)
	{
		System.out.println("1 arg constr");
	}
	{
		System.out.println("1 instance block");
		//multiple instance blocks can be created
	}
	{
		System.out.println("2 instance block");
	}
	public static void main(String[] arg)
	{
		new Inst();
		//first instance block exe then respective constructor block is created 
		//according to paramlist of constructor
		new Inst(10);
		//first instance block exe then respective constructor block is created 
		//according to paramlist of constructor
	}
//so 2 times all instance blocks are executed because we have 2 methods wheras 
	//respective constructors are executed
}
