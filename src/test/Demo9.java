package test;

public class Demo9 {
	
	static class Person{
		String name;
	}
	public static void main(String[] args) {
		String str = new StringBuffer("ja").append("va").toString();
		System.out.println(str.intern() == str);//false  java在常量池中不是第一次出现了，返回的第一次出现的实例引用不是str
		
		String str2 = new StringBuffer("ab").append("cd").toString();
		System.out.println(str2.intern()==str2);//true  str2.intern()返回的是首次出现的字符串的实例引用，并且会将字符串放入常量池
		
		String str3 = new StringBuffer("ab").append("cd").toString();
		System.out.println(str3.intern()==str3);//false
		
		System.out.println(str3.intern() == str2);//true  常量池中已经有了，str3.intern()返回的是首次出现的字符串的实例引用
		
	}
	
}
