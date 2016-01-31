
public class InstwithMethod {
int eid;//static var can also be initialized in instance blocks
{
	eid=111;//intialize the var
}
static void method1()
{
	System.out.println(new InstwithMethod().eid);
	//using obj accesng instnce var in static method
	
}
void method2()
{
	System.out.println(eid);
}
public static void main(String[] arg)
{
InstwithMethod.method1();//acess static method using class
new InstwithMethod().method2();//access instance method using obj
}
}
