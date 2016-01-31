class Animal{
}
class Dog extends Animal
{
	
}
class Parntss
{
	Animal marry()
	{
		System.out.println("parent class method");
		return new Animal();
		/*we can also write
		 * Animal a=new Animal();
		 * return a;
		 */
}
public class Rule3 extends Parntss {
	Dog marry()
	{
		System.out.println("child class method");
	    return new Dog();
	}
	public static void main(String[] arg)
	{
		new Rule3().marry();
	}
}
	

}
