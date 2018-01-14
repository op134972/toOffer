package ∞Æ∆Ê“’0910;

import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			String str = sc.next();
			System.out.println(fun(str));
			
		}
	}

	private static int fun(String str) {
		if(str.length() == 0)
			return 0;
		
		char[] arr = str.toCharArray();
		
		int dept = 1;
		int curr = 1;
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i] == '('&&arr[i+1] == '('){
				curr++;
				dept = Math.max(curr, dept);
			}else{
				curr = 1;
			}
		}
		return dept;
	}
}
