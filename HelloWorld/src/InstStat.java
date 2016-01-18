
public class InstStat {
	int a=10;
	static int b=20;
	void statt1()
	{
	System.out.println(a);
	System.out.println(InstStat.b);
	}
	static void stat2()
	{
	InstStat is=new InstStat();
	System.out.println(is.a);
	System.out.println(InstStat.b);
	}
	public static void main(String[] args)
	{
		InstStat i=new InstStat();
		i.statt1();
		InstStat.stat2();
	
	}

}
