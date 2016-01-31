class Rule0
{
	void memo()
	{
		System.out.println("parent method");
	}
}
public class Rule5 extends Rule0{
	void memo()
	{
		System.out.println("child class");
	}
	void poly()
	{
		System.out.println("method");
	}
	public static void main(String[] arg)
	{
		Rule0 rp=new Rule5();
		rp.memo();//compilation:rule0   run-time:rule5
		//rp.poly();//compile:rule0   run-time exe:error
		Rule5 r=(Rule5)rp;
		//type casting of rp reference var to Rule5 refernce var
		//and assigng to object 
		r.poly();
	}

}
