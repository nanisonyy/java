import java.util.Scanner;

public class TryCatchBlocks 
{
	public static void main(String[] arg)
	{
		Scanner sa=new Scanner(System.in);
		System.out.println("enter n value");
		int n=sa.nextInt();
		try
		{
			System.out.println(10/n);
			try
			{
				System.out.println("harsha".charAt(11));
			}
			catch(StringIndexOutOfBoundsException es)
			{
				System.out.println("ratan");
			}
		}
		catch(ArithmeticException a)
		{
			System.out.println(10/2);
			try
			{
				System.out.println("harsha");
				Thread.sleep(9000);
			}
			catch(InterruptedException i)
			{
				System.out.println("error");
			}
		}
	}
	

}
