class Base
{
	int a=10;
	int b=20;
}
public class Superkey extends Base {
	int a=100;
	int b=200;
	void meth1(int a,int b)
	{
		System.out.println(a+b);//local var are exe here directly
		System.out.println(this.a+this.b);//to access instance var of the same class
		System.out.println(super.a+super.b);
		//to access super var in super class use super keywrd
    }
	public static void main(String[] arg)
	{
		new Superkey().meth1(1000,2000);
		//This happens only when super var,instance var and local var are named with 
		//a same name otherwise we can access directly
	}
 
}
