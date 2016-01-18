
public class Vary {
	     int a=10;
		 int b=20;
	public static void main(String[] args)
	{
		Vary.vary1();
        Vary.vary2();
	}
	static void vary1()
	{
		Vary v=new Vary();
        System.out.println(v.a);
		System.out.println(v.b);
	}
	static void vary2()
	{
		Vary va=new Vary();
		System.out.println(va.a);
		System.out.println(va.b);
	}
		
	}


