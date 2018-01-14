package 剑指offer;




/*
 * 将字符串转换为整数
 */
public class Demo49 {

	public static void main(String[] args) {
		System.out.println(parse("0"));
	}
	
	public static int parse(String str){
		try {
			return Integer.parseInt(str);
		} catch (Exception e) {
			return 0;
		}
	}
}
