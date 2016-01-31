
public class StaticEx {
	{
		System.out.println("1-instance bock");
	}
	static
	{
		System.out.println("1-static bock");

	}
	{
		System.out.println("2-instance bock");
	}
	StaticEx()
	{
		System.out.println("0-arg const");
	}
	StaticEx(int a)
	{
		System.out.println("1-arg const");

	}
	void method1()
	{
		System.out.println("1-method");

	}
	static
	{
		System.out.println("2-sttatic bock");

	}
	public static void main(String[] arg)
	/*first all static blocks are exec at da .class file loading
	only once .class file will be loaded so static blocks are exe onl 1 tym*/
	{
		new StaticEx();
		/* all instance blocks when obj created
		 * respective constrtr
		 */
		new StaticEx(10);
		/*all instance blocks
		 * then respective arg constrctr
		 */
		new StaticEx().method1();
	   /*all instance blocks
	    * respective constructr
	    * respective called method
	    */
     }
}