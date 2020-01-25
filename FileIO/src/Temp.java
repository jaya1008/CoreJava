
public class Temp {

	static int a;static float b;
	static char c;
	public static void main(String[] args) {
		System.out.println("int : "+a);
		System.out.println("float : "+b);
		System.out.println("char : "+c);
		
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public float getB() {
		return b;
	}
	public void setB(float b) {
		this.b = b;
	}
	public char getC() {
		return c;
	}
	public void setC(char c) {
		this.c = c;
	}

}
