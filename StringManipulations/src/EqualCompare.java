
public class EqualCompare {
	public static void main(String[] arg)
	{
		String s1="harsha";
		String s2="vinay";
		String s3="harsha";
		System.out.println(s1.equals(s2));//false
		System.out.println(s1.equals(s3));//true
		System.out.println(s3.equals(s2));//false
		System.out.println("HARSHA".equals("harsha"));//false
		System.out.println("HARSHA".equalsIgnoreCase("harsha"));//true
     
		//using compareTo()
		System.out.println(s1.compareTo(s2));//-ve
		System.out.println(s1.compareTo(s3));//+ve
		System.out.println(s3.compareTo(s2));//-ve
		System.out.println("HARSHA".compareTo("harsha"));//-ve
		System.out.println("HARSHA".compareToIgnoreCase("harsha"));//0






	}

}
