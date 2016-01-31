class A//parent class 
//but still it is a child class of 'Object' pre-defined class 
{
	void m1(){
		System.out.println("M1");
	}
	void m2(){
		System.out.println("M2");
	}
}
class B extends A//child class of A
{
	void m3(){
		System.out.println("M3");
}
	void m4(){
		System.out.println("M4");
}
}
public class BasicInheritance extends B//child class of B and A too indirectly
{
void m5()
{
	System.out.println("M5");
}
void m6()
{
	System.out.println("M6");
}
public static void main(String[] arg)
{
	new A().m1(); new A().m2();//parent class only access m1 and m2
	new B().m1(); new B().m2();new B().m3(); new B().m4();
	//child class of A so access m1,m2,m3,m4
	new BasicInheritance().m1(); new BasicInheritance().m2();
	new BasicInheritance().m3(); new BasicInheritance().m4();
	new BasicInheritance().m5(); new BasicInheritance().m6();
	//child class of B and indirectly child class of A too
	//so  it can access m1,m2,m3,m4,m5,m6
}

}
