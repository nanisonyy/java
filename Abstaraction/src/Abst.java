abstract class Consta
{
	abstract void m1();
	abstract void m2();
	abstract void m3();
	//above 3 are abstract methods declarations 
	void m4()
	{
		System.out.println("m4 method");
	}
}
public class Abst extends Consta 
{
    void m1()//method definitions in the child class which is not an abstract class too
    {
    	System.out.println("m1 method");
    }
    void m2()
    {
    	System.out.println("m2 method");
    }
    void m3()
    {
    	System.out.println("m3 method");
    }
    public static void main(String[] args)
    {
    	Consta c=new Abst();
    	c.m1();
    	c.m2();
    	c.m3();
    	c.m4();
    }
}


