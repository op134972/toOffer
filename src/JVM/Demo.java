package JVM;

public class Demo {

	public static void main(String[] args) {
		/*
		 * 1.7及以后：
		 * 1、new 在常量池和堆中都创建，返回的是堆中的引用地址
		 * 2、
		 */
		String str = new String("test");
		String intern = str.intern();
		System.out.println(str == intern);
		
		
		String str2 = "1";
		String str3 = "1";
		System.out.println(str2 == str3);
		
	}

}
