package 京东;

public class Demo1 {

	private static int fun(String str){
		
		
		int num = 1;
		for (int i = 0; i < str.length(); i++) {
			num *= fun2(str.substring(i));
		}

    }
	
	//去掉右括号的个数
	private static int fun2(String str){
		int count = 1;
		String ss = str;
		while(str.contains(")")){
			str.replaceFirst(")", "");
			if(isMirr(str)){
				count++;
			}
			str = ss;
		}
		
		return count;
	}
	
	private static boolean isMirr(String str){
		if(str == "")
			return true;
		if(str.length()%2 == 1)
			return false;
		char[] array = str.toCharArray();
		for (int i = 0,j = array.length-1; i<j; i++,j--) {
			if(!((array[i]=='('&&array[j]==')')||(array[i]==')'&&array[j] == '('))){
				return false;
			}
		}
		
		
		
		return true;
	}
	
	public static void main(String[] args) {
		
		System.out.println(isMirr("(())"));
	}
}
