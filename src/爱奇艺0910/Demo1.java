package ∞Æ∆Ê“’0910;

import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int k1 = sc.nextInt();
		int x2 = sc.nextInt();
		int k2 = sc.nextInt();
		
		System.out.println(fun(x1,k1,x2,k2));
	}

	private static String fun(int x1, int k1, int x2, int k2) {
		StringBuffer sb1 = new StringBuffer();
		StringBuffer sb2 = new StringBuffer();
		for (int i = 0; i < k1; i++) {
			sb1.append(x1);
		}
		for (int i = 0; i < k2; i++) {
			sb2.append(x2);
		}

		if (sb1.length() > sb2.length()) {
			return "Greater";
		}
		if (sb1.length() < sb2.length()) {
			return "Less";
		}else{
			char[] arr1 = sb1.toString().toCharArray();
			char[] arr2 = sb2.toString().toCharArray();
			for (int i = 0; i < arr2.length; i++) {
				if(arr1[i]!=arr2[i]){
					if(Integer.valueOf(arr1[i]+"")>Integer.valueOf(arr2[i]+"")){
						return "Greater";
					}else{
						return "Less";
					}
				}
			}
			return "Equal";
		}
	}

}
