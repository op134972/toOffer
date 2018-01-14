package 牛客;

public class Demo4 {
	public static void main(String[] args) {
		String str = "aaabbb";//若无此，返回true
		
		String s1 = new StringBuffer("aaa").append("bbb").toString();
		System.out.println(s1.intern() == s1);
	}
}
