package com.test.maven;
import java.io.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;

public class ReadFilee{
	public static void main(String[] arg)throws Exception
	{
	PrintWriter pw=new PrintWriter("File3.txt");
	BufferedReader br=new BufferedReader(new FileReader("C://Users//harsha//git//java//Maven//src//main//resources//com//test//maven//File12.txt"));
	String line=br.readLine();
	while(line!=null)
	{
		pw.println(line);
		line=br.readLine();
	}
	BufferedReader br1=new BufferedReader(new FileReader("File22.txt"));
	String line1=br1.readLine();
	while(line1!=null)
	{
		pw.println(line1);
		line1=br1.readLine();
		pw.flush();
		pw.close();
		br.close();
		br1.close();
	}
	}

}
