package test0914;

import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		String subStr = sc.next();
		
		System.out.println(is_include(str, subStr));
		
	}
	
	private static String is_include(String str,String substr){
		char[] arr = str.toCharArray();
		int[] temp = new int[256];
		for (int i = 0; i < arr.length; i++) {
			temp[arr[i]] ++;
		}
		
		char[] subarr = substr.toCharArray();
		for (int i = 0; i < subarr.length; i++) {
			if(temp[subarr[i]]==0){
				return "0";
			}
		}
		return "1";
	}
}
