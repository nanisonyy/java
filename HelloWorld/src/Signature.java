
public class Signature {
	public static void main(String[] args)

	{
		Signature s=new Signature();
		s.m1();
		s.m1(10);
	}
		void m1()//duplicate methods are not allowed
		{
			System.out.println("a");
		}
		void m1(int a)//methods with same name and different argument list allowed
		{
			System.out.println(a);
		}
	
}
