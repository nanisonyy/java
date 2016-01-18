
public class PassingObjects {
	public static void main(String[] args)
	{
	PassingObjects ps=new PassingObjects();
	//X x=new X();
	//Emp e=new Emp();//indirectly creating objects and calling
	//ps.method1(x, e);
	ps.method1(new X(),new Emp());//directly creating objects and calling
	//Y y=new Y();
	//Student s=new Student();
	//PassingObjects.method2(y, s);
	PassingObjects.method2(new Y(),new Student());
	}
	void method1(X x,Emp e)
	{
		System.out.println("m1 method");
		
	}
	static void method2(Y y,Student s)
	{
		System.out.println("m2 method");
		
	}

}
class X{}
class Emp{}
class Y{}
class Student{}
