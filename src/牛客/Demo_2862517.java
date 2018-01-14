package 牛客;

public class Demo_2862517 {

	/*
	 * 下面改造一下这个语句System. out .println( (b+c).intern()== MESSAGE );
	 * 结果是true， intern() 方法会先检查 String 池 ( 或者说成栈内存 ) 中是否存在
	 * 相同的字符串常量，如果有就返回。所以 intern()返回的就是MESSAGE指向的"taobao"。
	 * 再把变量b和c的定义改一下
	 */
	
	private static String MESSAGE = "xixi";
	public static void main(String[] args) {
		//1、编译器优化
		String a = "xi";
		String b = "xi";
		String c = "xi"+"xi";
		System.out.println((a+b)==MESSAGE);//true自动优化
		System.out.println(c == MESSAGE);//false
		
		
		//2、intern会检查常量池中是否有，有就返回栈中的引用。
		System.out.println((a+b).intern() == MESSAGE);//true
		
		
		//3、堆对象.intern()--->它会根据堆内存中对象的值，去查找String池
		//中是否有相同的字符串，如果有就将变量指向这个string池中的变量。
	}
}
