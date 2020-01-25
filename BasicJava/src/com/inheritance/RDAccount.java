package com.inheritance;

public class RDAccount extends Account {

	int no_of_month;
	double amt;
	static double int_rate=9;
	public RDAccount() {
		// TODO Auto-generated constructor stub
	}

	public RDAccount(int accid, String name, double bal,int n,double a) {
		super(accid, name, bal);
		// TODO Auto-generated constructor stub
		no_of_month=n;
		amt=a;
	}

	@Override
	public double calculateInt() {
		// TODO Auto-generated method stub
	double r=amt*no_of_month;
	double i=(r*int_rate)/100;
	
		return r+i;
	}

	
	@Override
	public String toString() {
		return "RDAccount [no_of_month=" + no_of_month + ", amt=" + amt + ", accid=" + accid + ", name=" + name
				+ ", bal=" + bal + "]";
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		RDAccount obj=new RDAccount(4001, "abc",10000, 750, 12);
		double rate=obj.calculateInt();
		System.out.println(obj);
		double netbal=obj.bal+rate;
		System.out.println(netbal);
	}

}
