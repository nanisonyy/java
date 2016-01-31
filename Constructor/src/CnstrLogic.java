
public class CnstrLogic {
	int eid;
	String ename;
	double esal;
	CnstrLogic()
	{
	eid=111;//cnstutr logical block intialized by object cl
	ename= "harsha";
	esal=1000;
	}
	void const1()
	{
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(esal);
	}
	public static void main(String[] arg)
	{
		CnstrLogic cl=new CnstrLogic();
		/*
		 * if i create another object say
		 * CnstrLogic ck=new CnstrLogic();
		 * for every obj same values are initialized
		 * so now we use parameter in constructr
		 */
		cl.const1();
		
	}

}
