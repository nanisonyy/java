import java.io.BufferedReader;
import java.io.FileReader;

public class Assignment1 {
	public static void main(String[] arg)throws Exception
	{
		FileReader file=new FileReader("C://Users//harsha//Desktop//hars.txt");
		BufferedReader bf=new BufferedReader(file);
		String text="";
		String line=bf.readLine();
		while(line!=null)
		{
			text +=line;
			line=bf.readLine();
		}
		System.out.println(text);
	}
	

}
