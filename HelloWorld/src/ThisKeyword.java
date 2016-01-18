
public class ThisKeyword {
	static int a=10;
	static int b=20;
	void m1(int a,int b)
	{
		System.out.println(this.a+this.b);//this to refer instance var
		System.out.println(a+b);//directly for local var
	}
	public static void main(String[] args)
	{
		ThisKeyword tk=new ThisKeyword();
		tk.m1(1000, 2000);
	}

}
