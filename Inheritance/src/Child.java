class Parent
{
	Parent()
	{
		System.out.println("parent 0 arg const");

	}
}
public class Child extends Parent {
	/*default code is executd as
	 * Child()//default const
	 * {
	 * super();//default super keywrd
	 * }
	 */
	public static void main(String arg[])
	{
		new Child();
	}

}
