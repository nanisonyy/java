import java.io.*;
public class Alternate {
	public static void main(String[] arg)throws Exception
	{PrintWriter printWriter=new PrintWriter("output.txt");
	File bf3=new File("harsha503");
	String []s1=bf3.list();
	for(String ss:s1)
	{
		File f1=new File(bf3,ss);
		BufferedReader br11=new BufferedReader(new FileReader(f1));
	    String linee=br11.readLine();
	    while(linee!=null)
	    {
	    	printWriter.println(linee);
	    	linee=br11.readLine();
	    }
	}
	printWriter.flush();
	printWriter.close();
	
	}

}
