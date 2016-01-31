
public class ConstParam {
	int eid;
	String ename;
	double esal;
	ConstParam(int eid,String ename,double esal)
	//local variables we cant access outside the construtr
	{
		//to acess local variables with instance var use this 
		this.eid=eid;
		this.ename=ename;
		this.esal=esal;
	}
	void employee()
	{
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(esal);
    }
	public static void main(String[] arg)
	{
		ConstParam cp=new ConstParam(1,"harsha",1000);//initialize through parameters
		ConstParam co=new ConstParam(2,"vinay",2000);
		cp.employee();
		co.employee();
	}

}
