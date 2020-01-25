package gen4;

class WildcardDemo 
{
	public static void main(String[] args) 
	{
		Integer inums[]={1,2,3,4,5};
		Stats<Integer> iob=new Stats<Integer>(inums);
		double v=iob.average();
		System.out.println("iob average is "+ v);

		Double dnums[]={1.1,2.2,3.3,4.4,5.5};
		Stats<Double> dob=new Stats<Double>(dnums);
		double w=dob.average();
		System.out.println("dob average is  "+ w);

		Float fnums[]={1.0f,2.0f,3.0f,4.0f,5.0f};
       Stats<Float> fob=new Stats<Float>(fnums);
		double x=fob.average();
		System.out.println("fob average is "+ x);

		//see which arrays have same average.
          
		  System.out.println("Averages of iob and dob  ");
		  if(iob.sameAvg(dob))
				System.out.println("are  the same");
		  else
			  System.out.println("differ");

	}
}
