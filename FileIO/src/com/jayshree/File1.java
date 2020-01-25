package com.jayshree;

import java.io.File;
import java.io.IOException;

class File1
{
	public static void main(String[] args) throws IOException
	{
		File ff = new File("E:\\JavaDemo\\JavaFundamentals\\src\\com\\arraydemo\\Array2dDemo.java");
		System.out.println("File Name :"+ff.getName());
		System.out.println("Path :"+ff.getPath());
		System.out.println("Abs path :"+ff.getAbsolutePath());
		System.out.println("Parent :"+ff.getParent());
		System.out.println(ff.exists()?"exists":"not exists");
		System.out.println(ff.canWrite()?"is writable":"its not writable");
		System.out.println(ff.canRead()?"readable":"its not readable");
		System.out.println(ff.isDirectory()?"is directory":"its not directory");
		System.out.println(ff.isFile()?"is file":"its not file");
		System.out.println(ff.isAbsolute()?"is absolute":"its not absolute");
		System.out.println("File last modified :"+ff.lastModified());
		System.out.println("File size :"+ff.length());
		
		File f=new File("info.txt");
		System.out.println(f.createNewFile());
		
		File f1=new File("myfolder");
		System.out.println(f1.mkdir());
		
		File f2=new File(f1, "info2.txt");
		System.out.println(f2.createNewFile());
		
		
	}
}