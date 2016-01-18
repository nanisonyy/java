
public class Local {
	public static void main(String[] args)
	{
	    int a=10;
		System.out.println(a);
		Local l=new Local();
		l.stat1();
	}
	void stat1()
	{
		final int a=10;
		System.out.println(a);
	}

}
