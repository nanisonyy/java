class Rid
//overridden method and overriding method returntype should b same in primitive level
//in class level it can differ
{
	float marry()// should b same returntype overriden method
	{
		System.out.println("black gal");
		return 10.5f;
	}
}
public class Rule2 extends Rid{
	float marry()// should b same returntype overridding method
	/*if marry()overridding method is not defined in child class 
	 *den parent class marry() overridden method is executd 
	 *then black gal will be exe*/
	{
		System.out.println("red gal");
		return 10.6f;
	}
	public static void main(String[] arg)
	{
		System.out.println(new Rule2().marry());
	}

}
