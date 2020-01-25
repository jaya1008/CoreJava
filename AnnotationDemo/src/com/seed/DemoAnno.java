package com.seed;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Documented
@interface MyAnno
{
	String msg();
	double version();
}
@MyAnno(msg="Simple annoation example " , version = 1.0)
public class DemoAnno {

	
	public DemoAnno() {
		// TODO Auto-generated constructor stub
	}
	@Deprecated
    public void show()
    {
    	
    }
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DemoAnno obj=new DemoAnno();
		obj.show();
	}

}
