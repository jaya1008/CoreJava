package com.inheritance;

public abstract class Account {

	int accid;
	String name;
	double bal;
	static double int_rate;
	static {
		int_rate=8.0;
	}
	public Account() {
		// TODO Auto-generated constructor stub
		accid=0;
		name="";
		bal=0;
	}
	public Account(int accid, String name, double bal) {
		
		this.accid = accid;
		this.name = name;
		this.bal = bal;
	}
    public abstract double calculateInt();
    
    
	@Override
	public String toString() {
		return "Account [accid=" + accid + ", name=" + name + ", bal=" + bal + "]";
	}
	
}
