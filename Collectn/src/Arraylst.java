import java.util.*;
public class Arraylst {
	public static void main(String[] arg)
	{
		ArrayList al=new ArrayList();
		al.add("a");
		al.add(10);
		al.add("a");
		System.out.println(al);
		al.remove(2);
		System.out.println(al);
		al.add(2,"m");
		al.add("n");
		System.out.println(al);
	}

}
