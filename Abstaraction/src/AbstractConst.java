abstract class ConstAbst
{
	ConstAbst()
	{
		System.out.println("abstract class constructor");
	}
	{System.out.println("instance block");}//instance block exe with child class object
	static{System.out.println("static block");}//static block at .class file loading

}
public class AbstractConst extends ConstAbst
{
	void mm()
	{
		System.out.println("method");
	}
	AbstractConst()
	{
	    //though der is no super(); declared still parent class constructor is exe
		//as by default super is generated as the first statement as der is no this declaration too
		System.out.println("child class constructor");
	}
	public static void main(String[] args)//static block exe
	{
		new AbstractConst().mm();//instanceblock,abstract constructor,child const,method mm exe
		new AbstractConst();//instance block,abstract class const,child const exe
	}
	

}
