package test;

public class Demo10 {
	static{
		System.out.println("base init");
	}
	
	static void fun1(){
		System.out.println("base fun");
	}
	
	static int a = 1;
	
	
	public static void main(String[] args) {
		Sub.fun1();
		System.out.println(Sub.a);
	}
}

class Sub extends Demo10{
	static{
		System.out.println("sub init");
	}
}
