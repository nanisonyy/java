import java.io.*;
import java.util.Scanner;
public class Alt {
	public static void main(String[] arg)throws Exception
	{
		String original;
		String rev="";
		System.out.println("enter 2 no");
		Scanner sc=new Scanner(System.in);
		original=sc.nextLine();
		int len = original.length();
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+original.charAt(i);
		}
		System.out.println(original);
		System.out.println(rev);
	}

}
