
public class DifInstStat {
	int a=10;
	static int b=20;
	
	public static void main(String[] args)
	{
		DifInstStat dis=new DifInstStat();
				System.out.println(dis.a);
				System.out.println(DifInstStat.b);
				dis.a=999;
				b=888;
				System.out.println(dis.a);
				System.out.println(dis.b);
	    DifInstStat ds=new DifInstStat();
	            System.out.println(ds.a);
	            System.out.println(ds.b);
	    
	}

}
