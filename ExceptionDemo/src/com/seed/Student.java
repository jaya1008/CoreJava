
class InvalidMarksException extends  Exception 
{
	
	//private static final long serialVersionUID = 1L;
	private int m;
	InvalidMarksException()
	{
	}
	InvalidMarksException(int m)
	{
	     this.m=m;	
	}
	public String toString()
	{
		return m+" Are Invalid Marks";
	}

}
class Student
{
	String sname;
	int mark;
	Student(){}
	Student(String name,int mark)throws InvalidMarksException

	{
			//{try
		this.sname=sname;
		this.mark=mark;
		if(mark>100||mark<0)
			throw new InvalidMarksException(mark);
		//	}

		//catch(InvalidMarksException ex)
	//{
		
		
	//}
	}
	
		

    public static void main(String args[]) throws InvalidMarksException 
	{
		try
		{
			Student s1=new Student();
			Student s2=new Student("jayshree",200);
		}
		catch(InvalidMarksException e)
		{
			System.out.println("Invalid Marks Exception Caught!! "+e);
		
		}

	}
			
		
}

