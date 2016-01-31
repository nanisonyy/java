
public class Execptn {
	public static void main(String[] arg)
	{
		
		try{
			System.out.println(10/0);//move to  catch block
			System.out.println("harsha");//rest of these stat r not executed
			System.out.println("harsha");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("error");
		}
		System.out.println("har");

	}

}
