
public class Cnstr {

	Cnstr()
	{
	System.out.println("m1");
	}

    /*
     -->if 
        Cnstr c=new Cnstr();
	    is removed then default constructor is not created and executed 
	    because der r multiple constrc
	 -->if der are 1 or no constructors den default constructor is created
	    their is no need of constctr declaration for sure 
    */
	Cnstr(int a)
	{
	System.out.println("m2");
	}
		void diff()
		{
			System.out.println("m3");
		}
		
		public static void main(String[] arg)
		{
			Cnstr c=new Cnstr();//Cnstr constructor is executed //m1
			Cnstr c1=new Cnstr(10);//Cnstr(int a) constructor is invoked//m2
			c.diff();//m3
			c1.diff();//m3//we can call method with any object
	    }

}
