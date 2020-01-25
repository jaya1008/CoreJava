public class AsserationDemo 
{

    public static void main(String []args)
    {
          int num;
          
          num = Integer.parseInt(args[0]);
          // this is really Simple assert
          assert(num>=0):"Number is Negative";
          
          System.out.println("Number is:"+num);
          
          
          int x,y;
          x = 10;
          y = 2;
          //this is Simple Assert
          assert(y>x):"Y is :"+y+" X is:"+x;
    		
    		// java -ea AssertionDemo
    }
    
    
}