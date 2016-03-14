import java.io.*;

public class FileDemoo {
	public static void main(String[] arg)throws Exception
	{
	PrintWriter pw=new PrintWriter("File3.txt");
	BufferedReader br=new BufferedReader(new FileReader("File4.txt"));
	String line=br.readLine();
	while(line!=null)
	{
		pw.println(line);
		line=br.readLine();
	}
	br=new BufferedReader(new FileReader("File5.txt"));
	String line1=br.readLine();
	while(line1!=null)
	{
		pw.println(line1);
		line1=br.readLine();
		pw.flush();
	}
	}

}
