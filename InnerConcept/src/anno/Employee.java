package anno;
class Employee 
{
	private int eid;
	String nm;
	{
		System.out.println("in init block");
		
	}
	Employee()
	{
		System.out.println("in cons");
		eid=100;
		nm="Seed";
	}
	Employee(int id,String m)
	{
		eid=id;
		nm=m;
	
	}
	public void display()
	{
		System.out.println("Empid "+eid+"Ename"+nm);
	}
          


	public static void main(String[] args) 
	{
		Employee e=new Employee();
		e.display();
	}
}
