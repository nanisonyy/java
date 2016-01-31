
public class ConvertionStoSB {
	public static void main(String arg[])
	{
		//conversion of string to stringbuffer obj
		String str="harsha";
		StringBuffer sb=new StringBuffer(str);
		System.out.println(sb.reverse());//reverse oprtn can be done stringbuffer class 
		
		//conversion of stringbuffer to string obj
		StringBuffer sb1=new StringBuffer("vinay");
		String str1=sb1.toString();//to convert stingbuffer to string we use toString()
		System.out.println(str1);
		
	}

}
