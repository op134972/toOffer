package test;

public class Demo11 {
	static {
		i = 1;//1、可以赋值
		//System.out.println(i);2、访问报错
	}
	
	static int i ;
	static{
		System.out.println(i);
	}
	
	public static void main(String[] args) {
		Demo11 d = new Demo11();
		
		
		
	}
}
