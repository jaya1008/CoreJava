package gen3;
//Demostrates Stats

class   BoundedDemo 
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
		System.out.println("dob average is "+ w);

		Long lnums[]={1l,2l,3l,4l,5l};
		Stats<Long> lob=new Stats<Long>(lnums);
		double u=lob.average();
		System.out.println("lob average is "+ u);

  /*      String strs[]={"1","2","3","4","5"};
		Stats<String> sob=new Stats<String>(strs);
		double x=sob.average();
		System.out.println("sob average is "+ x);*/ 




	
	}
}
