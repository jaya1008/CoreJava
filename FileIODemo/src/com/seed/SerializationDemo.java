package com.seed;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable
{
	int rn;
	String name;
	float mark;
	public Student(int i, String string, float f) {
		// TODO Auto-generated constructor stub
		rn=i;
		name=string;
		mark=f;
		
	}
	public int getRn() {
		return rn;
	}
	public void setRn(int rn) {
		this.rn = rn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getMark() {
		return mark;
	}
	public void setMark(float mark) {
		this.mark = mark;
	}
	@Override
	public String toString() {
		return "Student [rn=" + rn + ", name=" + name + ", mark=" + mark + "]";
	}
	
	
}


public class SerializationDemo {
	public static void main(String args[]) throws IOException, ClassNotFoundException
	{
		
		//serialization process
		
		Student s1=new Student(100,"aaa",75f);
		
		FileOutputStream fos=new FileOutputStream("student.txt");
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		oos.writeObject(s1);
		oos.flush();
		oos.close();
		fos.close();
		System.out.println(s1);
		System.out.println("Object Saved");
		
		//Deserialization process
		

		
		FileInputStream fis=new FileInputStream("student.txt");
		ObjectInputStream ois=new ObjectInputStream(fis);
		s1=(Student) ois.readObject();
		System.out.println("Object shown");
		System.out.println(s1);
		oos.close();
		fos.close();
		
	}

}
