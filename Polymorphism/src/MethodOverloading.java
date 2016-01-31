
public class MethodOverloading 
{
	void m1(int a)//method overloading
	{
		System.out.println("int method");
	}
	void m1(int a,int b)//method overloading
	{
		System.out.println("int,int method");
    }
	void m1(char ch)//method overloading
	{
		System.out.println("char method");
    }
	MethodOverloading(int x)//constructor overloading
	{
		System.out.println("int arg const");
	}
	MethodOverloading(int x,int y)//const overloading
	{
		System.out.println("int,int arg const");
	}
	MethodOverloading(char ch)//const overloading
	{
		System.out.println("char arg const");
	}
	MethodOverloading()//const overloading
	{
		System.out.println("o arg const");
	}

	public static void main(String[] args) {
		new MethodOverloading().m1(10);
		new MethodOverloading().m1(10,20);
		new MethodOverloading().m1('a');
		new MethodOverloading(10);
		new MethodOverloading(10,20);
		new MethodOverloading('a');

		
	}

}
