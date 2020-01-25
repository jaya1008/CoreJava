package com.anon;

public class Car {

	Driver d=new Driver("My. PQR")
			{
				String addr;
				public void drive()
				{
					System.out.println(name + " is driving a Car");
					updateAddress("S.B. Road Pune..");
					System.out.println(addr);
				}
				public void updateAddress(String d)
				{
					addr=d;
					
				}
			};
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car c=new Car();
		c.d.drive();
	
	}

}
