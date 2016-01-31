package com.test.maven;
import org.apache.commons.io.*;

import java.util.*;

import java.io.File;
import java.io.LineNumberReader;
public class Build {
public static void main(String[] arg)throws Exception
{
	//below code is hard coded by giving the filename
	//String fd=FileUtils.readFileToString(new File("C:\\Users\\harsha\\workspace\\Maven\\src\\main\\resources\\com\\test\\maven\\ReadFile.demo"));
	//System.out.println(fd);
	//below code is used not to hard code the file reading 
	List<String> lin = IOUtils.readLines(Build.class.getResourceAsStream("ReadFile.demo"));
    System.out.println(lin);
		
		int linenumber = 0;
		    
	            while (((LineNumberReader) lin).readLine() != null){
	        	linenumber++;
	            }
	 
	            System.out.println("Total number of lines : " + linenumber);
	 
		

}
}
