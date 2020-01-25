import java.lang.reflect.*;
class RTTI
{

	public RTTI(int a,int b)
	{
		System.out.println("RTTI parametric con.");
	}
	RTTI(float b)
	{
	}
	public void show()
	{
	}
	public void compute()
	{
	}
	public static void main(String a[]) throws Exception
	{
		int i;
		RTTI r=new RTTI(10,20);
		//1 way to get Class
		Class c=r.getClass();
		//2 way to get Class
			//	Class c=Class.forName("RTTI");
		
		Constructor o[]=c.getDeclaredConstructors();
		for(i=0;i<o.length;i++)
			System.out.println(o[i]);

		Method m1[]=c. getDeclaredMethods();
		System.out.println(" ************* getDeclaredMethods() ***************");
		for(i=0;i<m1.length;i++)
			System.out.println(m1[i]);
		
		
		Method m[]=c.getMethods();
		System.out.println(" ************* getMethods() ***************");
		for(i=0;i<m.length;i++)
			System.out.println(m[i]);
		
		
		//Field f[]=c.get


	}

};