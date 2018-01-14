package 剑指offer;

import java.util.ArrayList;

/*
 * 1、两个字符串，删除str1中str2出现过的字符。

 */
public class Demo5_2 {
	public static void main(String[] args) {
		System.out.println(fun("hello", "e ll"));
	}
	
	public static String fun(String str1,String str2){
		char[] arr1 = str1.toCharArray();
		char[] arr2 = str2.toCharArray();
		
		ArrayList<Character> list = new ArrayList<>();
		
		int[] map = new int[65536];
		for (int i = 0; i < arr2.length; i++) {
			map[arr2[i]]++;
		}
		
		for (int i = 0; i < arr1.length; i++) {
			if(map[arr1[i]]==0){
				list.add(arr1[i]);
			}
		}
		
		StringBuffer sb = new StringBuffer();
		list.stream().forEach(c->sb.append(c));
		return sb.toString();
	}
}
