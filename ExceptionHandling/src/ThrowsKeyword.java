import java.util.Scanner;

public class ThrowsKeyword {
	void mro() throws ArithmeticException
	{
		Scanner saa=new Scanner(System.in);
		System.out.println("enter n value");
		int n=saa.nextInt();
		System.out.println("sleeping mode");
		System.out.println(10/n);
		System.out.println("sleeping mode");
	}
	void mofficer() throws ArithmeticException
	{
		mro();
	}
	void eseva() 
	{
	    try{mofficer();}
	    catch(ArithmeticException ae){System.out.println(10/2);}
	}
	public static void main(String[] arg)
	{
		ThrowsKeyword tk=new ThrowsKeyword();
		tk.eseva();
		
	}

}
