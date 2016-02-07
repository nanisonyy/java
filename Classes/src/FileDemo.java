import java.io.File;

public class FileDemo {
	public static void main(String[] arg)throws Exception
	{
		File f1=new File("harsha503");
		f1.mkdir();
		File f=new File("harsha503","H:\\xyz.txt");
		f.createNewFile();
		f.exists();
		
	}

}
