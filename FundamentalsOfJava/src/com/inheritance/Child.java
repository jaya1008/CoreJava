package com.inheritance;

class Parent
{
	public Parent getObject()
	{
		return new Parent();
	}

}

 class Child extends Parent {

	 public void showChildDetails()
	 {
		 System.out.println("I am Special method of Child");
	 }
	 public Child getObject()
	 {
		 return new Child();
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child obj=new Child();
		/*Parent p=obj.getObject();
	    ((Child)p).showChildDetails();*/
		Child c=obj.getObject();
		c.showChildDetails();
		
		Parent p=new Child();
		if(p instanceof Child)
			System.out.println("Child class object is created");
		else
			System.out.println("Paent class Object is created");
		
	}

}
