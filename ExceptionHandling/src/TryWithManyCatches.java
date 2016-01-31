import java.util.Scanner;

public class TryWithManyCatches {
	public static void main(String[] arg)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("enter n value");
		int n=s.nextInt();
		
		try{
				System.out.println(10/n);
				System.out.println("harsha".charAt(10));
		}
		catch(ArithmeticException ae)
		{
			System.out.println(10/2);
		}
		catch(StringIndexOutOfBoundsException se){
			System.out.println("harsha");
		}
		/*catch(Exception a)//instead of multiple catch block 
		 * {                // des one block is enough to handle all da exceptions
		 * System.out.println("vinay");
		 * {
		 */
	}

}
