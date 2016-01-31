package com.dss.client1;
import com.dss.declarations.Message;
public class TestClient1 implements Message{
	public void gm()
	{
		System.out.println("good morning");
	}
	public void ge()
	{
		System.out.println("good evening");
	}
	public void gn()
	{
		System.out.println("good night");
	}
	public static void main(String arg[])
	{
		TestClient1 t=new TestClient1();
		t.gm();
		t.ge();
		t.gn();
	}

}
