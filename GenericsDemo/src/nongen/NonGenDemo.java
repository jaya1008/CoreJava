package nongen;
class NonGenDemo {

	 public static void main(String args[]){
		 NonGen iob;

		 //create NonGen Object and store
		 //an integer in it. Autoboxing still occurs.

		 iob=new NonGen(88);

		 //show the type of data used by iob.
		 iob.showType();

		 //Get the value of iob. 
		 //This  time, a cast is necessary.
		 int v=(int) iob.getob();
		 System.out.println("value :  "+v);

		 System.out.println();

		 //create another NonGen object and  store a String in it.
		 NonGen strob=new NonGen("Non-Generics Test");

		 //show the type of data used by strob.

		 strob.showType();

		 //Get the value of strob
		 //Again,notice that a cast is necessary.

		 String str=(String)strob.getob();
		 System.out.println("Value:   "+str);

		 //This compiles,but is conceptually wrong !!!!

		 iob=strob;
		 v=(Integer)iob.getob();//run-time error !!
	 }
 }





