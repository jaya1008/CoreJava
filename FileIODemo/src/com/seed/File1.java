package com.seed;

import java.io.File;

class File1
{
	public static void main(String[] args)
	{
		File ff = new File("z:\\com");
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
	}
}