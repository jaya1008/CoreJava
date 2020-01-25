//package gen4;

class  Stats<T extends Number>
{
	T [] nums; //array of Number or subclass
	//pass the constructor a reference to 
	// an array of the type Number or subclass.

	Stats(T[ ]o){
		nums=o;
	}

	// Retrun  type double in all cases.
	double average(){
		double sum=0.0;

		for(int i=0;i<nums.length;i++)
			sum +=nums[i].doubleValue();
		return sum/nums.length;
	}

	//Determine if two averages are the same.
	//notice the use of the wildcard.

	boolean sameAvg(Stats<?> ob){
		if(average() == ob.average())
			return true;

		return false;
	}
}
	 