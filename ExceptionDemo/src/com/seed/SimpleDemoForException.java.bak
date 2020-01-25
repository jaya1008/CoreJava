package com.seed;

public class SimpleDemoForException {

	/**
	 * @param args
	 */
	public void getData()
	{
		int n[]={1,2,3,4};
		int sum=0;
		try {
			for(int i=0; i<=5; i++)
				sum=sum+n[i];
		}
		/*catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println("in catch");
			ex.printStackTrace();
			//System.out.println(ex);
			
		}
		*/
		finally
		{
			
			System.out.println("am in finally");
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException |NullPointerException  ex)
		{
			
			
		}
			
		System.out.println(sum);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleDemoForException v=new SimpleDemoForException();
		v.getData();
		System.out.println("in main");

	}

}
