package 剑指offer;



/**
 * 到n的数中，1出现的次数
 * @author lenovo
 *
 */
public class Demo32 {

	public static void main(String[] args) {
		System.out.println(count1(12));
	}
	
	public static int count1(int n ){
		StringBuffer sb = new StringBuffer();
		for (int i = 1; i <= n; i++) {
			sb.append(i+"");
		}
		
		int count = 0;
		char[] charArray = sb.toString().toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if(charArray[i] == '1'){
				count++;
			}
		}
		return count;
	}
}
