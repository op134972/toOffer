package test;

public class Demo9 {
	
	static class Person{
		String name;
	}
	public static void main(String[] args) {
		String str = new StringBuffer("ja").append("va").toString();
		System.out.println(str.intern() == str);//false  java�ڳ������в��ǵ�һ�γ����ˣ����صĵ�һ�γ��ֵ�ʵ�����ò���str
		
		String str2 = new StringBuffer("ab").append("cd").toString();
		System.out.println(str2.intern()==str2);//true  str2.intern()���ص����״γ��ֵ��ַ�����ʵ�����ã����һὫ�ַ������볣����
		
		String str3 = new StringBuffer("ab").append("cd").toString();
		System.out.println(str3.intern()==str3);//false
		
		System.out.println(str3.intern() == str2);//true  ���������Ѿ����ˣ�str3.intern()���ص����״γ��ֵ��ַ�����ʵ������
		
	}
	
}
