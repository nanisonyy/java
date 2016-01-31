
public class EqualsOpearator {
	EqualsOpearator(String str)
	{}
	public static void main(String[] arg)
	{
		
		EqualsOpearator eo1=new EqualsOpearator("sony");
		EqualsOpearator eo2=new EqualsOpearator("sony");
		//System.out.println(eo1.equals(eo2));//reference comparison
		System.out.println(eo1==eo2);//reference comparision
		
		String st1=new String("harsha");
		String st2=new String("harsha");
		System.out.println(st1.equals(st2));//content comparision as String class overrides Object class and implements Content comparision
		System.out.println(st1==st2);//reference comparision
		
		StringBuffer sb1=new StringBuffer("vinay");
		StringBuffer sb2=new StringBuffer("vinay");
		//System.out.println(sb1.equals(sb2));//reference comparision
		System.out.println(sb1==sb2);//reference comparision
	}

}
