class Emp{}
class X{}
public class MethodaReturns {
	int a=100;
float m1()//returntype is float
{
	System.out.println("m1");
	return 10.5f;//return float value
}
Emp m2()
{
	System.out.println("m2");
	return new Emp();
}
X m3()//return type is a class
{
	System.out.println("m3");
	return new X();//return class obj
}
MethodaReturns m4()//returntype is same class obj
{
	System.out.println("current class as returntype");
	return this;//return same class obj using this keywrd
}
int m5(int a)//local var
{
	System.out.println("returning local var");
	return a;//return local var as first priority to local var
}
int m6()
{
	System.out.println("returning inst var");
    return a;
}
int m7(int a)
{
	System.out.println("wantedly return inst var");
	return this.a;
}
public static void main(String[] ra)
{
     System.out.println(new MethodaReturns().m1());//return float
     System.out.println(new MethodaReturns().m2());//return emp
     System.out.println(new MethodaReturns().m3());//return x
     System.out.println(new MethodaReturns().m4());//return current class
     System.out.println(new MethodaReturns().m5(10));//return 10 local var
     System.out.println(new MethodaReturns().m6());//return 100 inst var
     System.out.println(new MethodaReturns().m7(20));//return 100 inst var




}
}
