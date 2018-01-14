package Å£¿Í;

public class Demo3 {
	static{
		int x = 10;
	}
	static int x, y;

	public static void main(String args[]) {
		x--;
		myMethod();
		System.out.println(x + y + ++x);
	}

	public static void myMethod() {
		y = x++ + ++x;
	}
}
