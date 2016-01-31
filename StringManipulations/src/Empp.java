
public class Empp {
	public static void main(String arg[])
	{
		String s1="harsha";
		System.out.println(s1);//output is harsha not clasname@hashcode
		//bcz String class overrides Object class.In String class toString is defined as
		/*class String extends Object
		 * {
		 * public String toString()
		 * {
		 * return "content in the String object";
		 * }
		 */
		String s2=new String("vinay");
		System.out.println(s2);
		
		StringBuffer s3=new StringBuffer("teja");
		System.out.println(s3);
		//StringBuffer class overrides Object class.In StringBuffer class toString is defined as
				/*class StringBuffer extends Object
				 * {
				 * public String toString()
				 * {
				 * return "content in the String object";
				 * }
				 */
				
	}

}
