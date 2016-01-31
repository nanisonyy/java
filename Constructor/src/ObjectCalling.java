
public class ObjectCalling {
	ObjectCalling()
	{
		System.out.println("1 arg");
	}
	ObjectCalling(int a)
	{
		System.out.println("2 arg");
	}
	ObjectCalling(int a,int b)
	{
		System.out.println("3 arg");
	}
	public static void main(String[] arg)
	{
		//named object format
		ObjectCalling oc=new ObjectCalling();
		ObjectCalling oc1=new ObjectCalling(10);
		ObjectCalling oc2=new ObjectCalling(10,20);
		//nameless object format
		new ObjectCalling();
		new ObjectCalling(10);
		new ObjectCalling(10,20);
	}
}