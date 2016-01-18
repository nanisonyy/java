
public class TMethod {
	public static void main(String[] args)
	{
	TMethod t=new TMethod();
	t.method1(10,'h');
	TMethod.method2("dady",10.5);
	}
	void method1(int a,char ch)
	{
		System.out.println("m1 method");
		System.out.println(a);
		System.out.println(ch);
	}
	static void method2(String str,double c)
	{
		System.out.println("m2 method");
		System.out.println(str);
		System.out.println(c);
	}

}
