pa ckage com.layout;

import java.awt.*;
import java.awt.event.*;
class UserDefinedPlace extends Frame
{
	Button b;
	UserDefinedPlace()
	{
		setLayout(null);
		b=new Button("Click");
		b.setBounds(100,100,50,50);
		add(b);
	}
}
class TestUserDefinedPlace
{
	public static void main(String[] args)
	{
		UserDefinedPlace frame=new UserDefinedPlace();
		frame.setSize(200,200);
		frame.show();
	}
};