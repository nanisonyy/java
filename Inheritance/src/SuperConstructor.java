class Constructr
{
	Constructr()
	{
		System.out.println("parent 0 arg const");
	}
	Constructr(int a)
	{
		System.out.println("parent 1 arg const");
	}
}

public class SuperConstructor extends Constructr {
	SuperConstructor()
	{
		this(10);
		System.out.println("child 0 arg const");
	}
	SuperConstructor(int b)
	{
		super(20);
		System.out.println("child 1 arg const");
	}

	public static void main(String[] args) {
		new SuperConstructor();

	}

}
