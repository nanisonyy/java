import java.util.Scanner;

//class InvalidAgeException extends Exception//checked exception userdefined
class InvalidAgeException extends RuntimeException
{
	//deault constructor with no params//default usedefined checked exception
	InvalidAgeException(String str)//params usedefined checked exception
	{
		super(str);//to pass the string to exception class
	}
}
public class UserCheckedEx {
	static void status(int age)throws InvalidAgeException
	//throws InvalidAgeException is optional in unchecked usedefnd exceptions
	{
		if(age>20)
		{
			System.out.println("eligible to marry");
		}
		else
		{
			//throw new InvalidAgeException();//default Userdefined Checked Exception
			throw new InvalidAgeException("inavalid age");//params usedefined unchecked exception
		}
	}
	public static void main(String[] arg)throws InvalidAgeException
	//throws InvalidAgeException is optional in unchecked usedefnd exceptions
{
		Scanner se=new Scanner(System.in);
		System.out.println("enter n value");
		int age=se.nextInt();
		UserCheckedEx.status(age);
	}

}
