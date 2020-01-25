package com.anon;

public class MethodArgAIC {

	public void show(Driver d)
	{
		d.drive();
	}
	public void show1(SwitchAble obj) {
		
		obj.on();
		obj.off();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodArgAIC obj=new MethodArgAIC();
		obj.show(new Driver() {
			
			public void drive()
			{
				System.out.println("From MethodArgAIc Driver name is "+name);
			}
			
		});
		obj.show1(new SwitchAble() {
			
			@Override
			public void on() {
				// TODO Auto-generated method stub
				System.out.println("I am in on");
			}
			
			@Override
			public void off() {
				// TODO Auto-generated method stub
				System.out.println("I am in off");
			}
		});
	}

}
