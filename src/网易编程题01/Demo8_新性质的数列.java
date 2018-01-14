package 网易编程题01;

import java.util.Arrays;

public class Demo8_新性质的数列 {

	public static void main(String[] args) {
		System.out.println(fun(6,34951));
	}
	private static long fun(int n, int k){
		
		/*
		 * dp[i][j]表示：
		 * 1、长度为i
		 * 2、以j结尾
		 * dp[i][j] = dp[i-1][m]的和  (m小于j并且m小于)
		 */
		long [][] dp = new long[n+1][k+1];
		for (int i = 1; i < dp[0].length; i++) {
			dp[1][i] = i;
		}
		for (int i = 1; i < dp.length; i++) {
			dp[i][1] = 1;
		}
		
		for (int i = 2; i < dp.length; i++) {
			for (int j = 2; j < dp[0].length; j++) {
				dp[i][j] = 0;
				for (int mm = 1; mm <= j; mm++) {
					dp[i][j] += dp[i-1][mm]%1000000007;
				}
			}
		}
		
		for (int i = 6; i < dp.length; i++) {
			System.out.println(Arrays.toString(dp[i]));
		}
		
		return dp[n][k]%1000000007;
	}
}
