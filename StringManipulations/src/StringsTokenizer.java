import java.util.StringTokenizer;

public class StringsTokenizer {

	public static void main(String arg[])
	{
		StringTokenizer st=new StringTokenizer("hi harasha hw ru");//splitting by space
		while(st.hasMoreElements()){
			System.out.println(st.nextElement());
		}
		StringTokenizer st1=new StringTokenizer("hi h,aras,ha h,w r,u",",");//spliting by "," 
		while(st1.hasMoreElements()){
				System.out.println(st1.nextElement());
		}
	}
	}



