package com.settter;

public class MethodOverloadingDemo {

	/*public void add(int i,int j)
	{
		int res=i+j;
		System.out.println("addition is "+res);
		
	}*/
		public void add(String s1,String s2)
	{
		String s3=s1+s2;
		System.out.println(s3);
	}
    public void add(int... obj)
    {
    	int sum=0;
    	for(int i=0; i<obj.length; i++)
    		sum=sum+obj[i];
    	System.out.println("Addition is "+sum);
    }
	public void add(double d1,double d2)
	{
		double d3=d1+d2;
		System.out.println("Addition is "+d3);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverloadingDemo obj=new MethodOverloadingDemo();
		obj.add(2.5, 6.5);
		obj.add(12, 18,6,7);
		obj.add("Hello ,", "all");
	}

}
