
public class Variable {
	static int a=10;
	static int b=20;
public static void main(String[] args)
{
	System.out.println(a);//access static variable directly
    System.out.println(Variable.b);//access through class
    Variable.variable1();
}
static void variable1()
{
	Variable v = new Variable();
	System.out.println(v.a);//access static variable by object reference
	System.out.println(v.b);
}
}

