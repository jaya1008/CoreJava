package com.inheritance;

public class SavingAccount  extends Account{

	static double int_rate=8;
	public SavingAccount() {
		// TODO Auto-generated constructor stub
	}
	
	public SavingAccount(int accid, String name, double bal) {
		super(accid, name, bal);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculateInt() {
		// TODO Auto-generated method stub
		double interest=(bal*int_rate)/100;

		
		return interest;
	}

	@Override
	public String toString() {
		return "SavingAccount [accid=" + accid + ", name=" + name + ", bal=" + bal + "]";
	}

   public static void main(String[] args) {
	
	
	   SavingAccount obj=new SavingAccount(1001, "abc", 10000);
	   System.out.println(obj);
	   double i=obj.calculateInt();
	   double netbal=obj.bal+i;
	   System.out.println("Net bal is "+netbal);
   }	
	
}
