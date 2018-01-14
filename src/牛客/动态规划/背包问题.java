package 牛客.动态规划;

import java.util.Arrays;
import java.util.List;

/*
 * 背包问题具体例子：假设现有容量10kg的背包，另外有3个物品，分别为a1，a2，a3。物品a1重量为3kg，
 * 价值为4；物品a2重量为4kg，价值为5；物品a3重量为5kg，价值为6。将哪些物品放入背包可使得背包中
 * 的总价值最大？
 */
public class 背包问题 {

	/**
	 * 
	 * @param arr
	 *            单个重量数组 {3,4,5}
	 * @param price
	 *            单个价值数组 {4,5,6}
	 * @param weight
	 *            背包总重量 10
	 * @return
	 */
	private static int maxVal(int[] arr, int[] price, int weight) {
		int[][] dp = new int[arr.length][weight + 1];

		// 初始化第一行
		for (int j = 0; j < dp[0].length; j++) {
			dp[0][j] = (j / arr[0]) * price[0];
		}
		// 初始化第一列
		for (int i = 0; i < dp.length; i++) {
			dp[i][0] = 0;
		}
		
		//状态变化
		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {
				int defVal = 0;
				for (int mm = 0; j-arr[i]*mm >=0; mm++) {//mm表示装入arr[i]物品的数目，从0开始，暴力破解的思想
					defVal = Math.max(defVal,(dp[i-1][j-arr[i]*mm]+price[i]*mm));
				}
				dp[i][j] = defVal;
			}
		}

		for (int i = 0; i < dp.length; i++) {
			System.out.println(Arrays.toString(dp[i]));
		}
		
		return dp[arr.length-1][weight];
	}
	
	public static void main(String[] args) {
		int[] arr = {3,4,5};
		int[] price = {4,5,6};
		int weight = 10;
		
		System.out.println(maxVal(arr, price, weight));
	}
}
