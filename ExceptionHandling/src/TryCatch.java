
public class TryCatch 
{
		void m1()
			{
			try
			{
				System.out.println(10/0);//move to  catch block
			}
			catch(ArithmeticException ae)
			{
				//System.out.println(ae.toString());//des can b used instead of 
				//System.out.println(ae.getMessage());//printStackTrace
				ae.printStackTrace();//mostly recommended
			}}
			public static void main(String[] arg)
			{
				TryCatch tc=new TryCatch();
				tc.m1();
			System.out.println("har");

        }
}
