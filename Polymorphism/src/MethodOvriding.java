class Ridden
//overriden method and overridding method name should b same
{
     void marry()//overriden method
     //rule7:protected(overridden)-->default(overridding) access is not possible
	{
		System.out.println("black gal");
	}
}
public class MethodOvriding extends Ridden{
	//rule7:increase in access default(overridden)-->protected(overridding)//possible
	//protected--->public// is possible
	//public-->public,default-->default,protected--->protected//is possible
	//public--->protected,protected-->default,public--->degault//not possible
     protected void marry()//overridding method
	/*if marry()overridding method is not defined in child class 
	 *den parent class marry() overridden method is executd 
	 *then black gal will be exe*/
	{
		System.out.println("red gal");
	}
	public static void main(String[] arg)
	{
		new MethodOvriding().marry();
	}

}
