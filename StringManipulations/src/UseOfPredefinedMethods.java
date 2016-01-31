
public class UseOfPredefinedMethods {
	public static void main(String arg[])
	{
		String m="harshachannaka";
		System.out.println(m.charAt(3));//char at 3 is printed
		System.out.println(m.indexOf("a"));//index of a from begng
		System.out.println(m.lastIndexOf("a"));//index of a from the end
		System.out.println(m.contains("hanna"));//the give contains or not
		System.out.println(m.startsWith("har"));//does it start with
		System.out.println(m.endsWith("naka"));//does it end with
		System.out.println("harsha".toUpperCase());//lower to upper case
		System.out.println("HARSHA".toLowerCase());//upper to lower case
		String str="   harsha channaka  ";
		System.out.println(str.trim().length());//starting and ending spaces are trimmed 
		                                        //and length is given
		System.out.println(m.substring(6));//string from 6 place included to end of da string
		System.out.println(m.substring(2, 6));//string from 2 place included to 6 place not included 
		System.out.println(m.substring(2, 6).length());
		String n="harsha channaka loves vinay";
		String[] str1=n.split(" ");//split the string and store in an array
		for(String ss:str1)//for loop 
		System.out.println(ss);
		
	}

}
