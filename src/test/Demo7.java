package test;

public class Demo7 {
	static class Father{
		static String str = "father";
	}
	static class Son extends Father{
		static String str = "son";
		public static void fun1(){
			System.out.println(str);
		}
	}
	
	public static void main(String[] args) {
		Son s = new Son();
		s.fun1();
	}
}
