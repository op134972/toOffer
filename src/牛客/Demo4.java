package ţ��;

public class Demo4 {
	public static void main(String[] args) {
		String str = "aaabbb";//���޴ˣ�����true
		
		String s1 = new StringBuffer("aaa").append("bbb").toString();
		System.out.println(s1.intern() == s1);
	}
}
