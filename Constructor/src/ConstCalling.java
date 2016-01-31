
public class ConstCalling {
	
ConstCalling()
{
	this.m1();
	//to call another constr using this this and we 
	//should use this in the first statemnt of constr 
	System.out.println("1 arg");
}
ConstCalling(int a)
{
	this(10,20);//only we can use 1 this calling in 1 const
	System.out.println("2 arg");	
}
ConstCalling(int a,int b)
{
	System.out.println("3 arg");	
}
void m1()
{
	System.out.println("M1");
}
public static void main(String[] str)
{
	ConstCalling cc=new ConstCalling();

}
}
