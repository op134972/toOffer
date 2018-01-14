package 网易编程题01;

import java.util.Scanner;

public class Demo3_最长交错01串 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			String str = sc.nextLine();
			
			System.out.println(fun1(str));
			
		}
	}
	
	
	private static int fun1(String str){
		char[] arr = str.toCharArray();
		int len = arr.length;
		if(len==1||len == 0){
			return len;
		}
		//辅助数组dp[]，表示以i结尾的子串的最长交错串长度
		int[] dp = new int[len];
		dp[0] = 1;
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]!=arr[i-1]){
				dp[i] = dp[i-1]+1;
			}else{
				dp[i] = 1;
			}
		}
		
		int max = 0;
		for (int i = 0; i < dp.length; i++) {
			max = Math.max(max, dp[i]);
		}
		return max;
	}
}
