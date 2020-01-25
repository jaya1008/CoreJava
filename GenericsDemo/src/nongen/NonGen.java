package nongen;

class NonGen 
{
	Object ob; //ob is now of type object
	//pass the constructor a reference to an object of type object

	NonGen(Object o){

		ob=o;
	}

	//Return type object.
	Object getob(){
		return ob;
	}

	 //show type of ob

	 void showType(){
		 System.out.println("Type of ob is "+
	 ob.getClass().getName());
	 }
}


	