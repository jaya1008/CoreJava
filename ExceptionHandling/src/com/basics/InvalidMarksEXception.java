package com.basics;

public class InvalidMarksEXception extends Exception {
	int marks;
	public InvalidMarksEXception() {
		// TODO Auto-generated constructor stub
	}

	public InvalidMarksEXception(int marks)
	{
		this.marks=marks;
				
	}

	@Override
	public String toString() {
		return "InvalidMarksEXception [marks=" + marks + "]";
	}
	

}
