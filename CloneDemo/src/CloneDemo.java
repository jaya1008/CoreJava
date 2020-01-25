/* program for cloneable Interface */

class CloneDate implements Cloneable  
{
	int dd,mm,yy;
	CloneDate()
	{
		dd=03;
		mm=03;
		yy=1981;
	}
	
	public Object clone()throws CloneNotSupportedException
	{
		return super.clone();
	}
	public String toString()
	{
		//return dd + " "+ mm +" "+ yy;
		return null;
	}
	
}


class CloneEmp implements Cloneable  
{
	//int i=0;
	int eno;
	String ename;
	CloneDate date; //containment

	CloneEmp()
	{
		eno=10;
		ename="kedar";
		date = new CloneDate();
	}

	public String toString()
	{
		return eno + " "+ ename + " "+date.toString();
	}

	public Object clone()throws CloneNotSupportedException
	{
		CloneEmp e1 =null;

		e1=(CloneEmp)super.clone();

		e1.date = (CloneDate)date.clone();

		return e1;

	}

};
class CloneDemo 
{
	public static void main(String[] args) 
	{
		try
		{
			CloneEmp c1=new CloneEmp();
			CloneEmp c2 = (CloneEmp)c1.clone();

			System.out.println(c1);
			System.out.println(c2);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
