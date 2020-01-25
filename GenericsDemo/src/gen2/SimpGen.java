package gen2;
//Demostrate TwoGen.

import static java.lang.System.out;

class SimpGen{
  

	public static void main(String args[]){

		TwoGen<Integer, Float>obj=new TwoGen<Integer, Float>
		(12,56.8f);
		
		Integer i= obj.getob1();
		Float f=obj.getob2();
		obj.showTypes();
	}	        
}


