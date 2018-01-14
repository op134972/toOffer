package 美团2018校招1;

/*
 * 题目描述
 给你六种面额 1、5、10、20、50、100 元的纸币，假设每种币值的数量都足够多，编写程序求组成N元（N为0~10000的非负整数）的不同组合的个数。 
 输入描述:
 输入包括一个整数n(1 ≤ n ≤ 10000)


 输出描述:
 输出一个整数,表示不同的组合方案数

 输入例子1:
 1

 输出例子1:
 1
 */
public class 拼钱币 {

	// 1、暴力破解
	public static int fun1(int num) {
		int[] arr = { 1, 5, 10, 20, 50, 100 };

		System.out.println("暴力"+baoli(arr,0,num));
		System.out.println("记忆"+jiyi(arr, 0, num));
		System.out.println("动态规划"+dp(arr,num));
		
		return 0;
	}

	/*
	 * 1000元
	 * 
	 * 1、0张1元，剩下{5,10,20,50,100}组成剩下1000元 2、1张1元，剩下{5,10,20,50,100}组成剩下999元 ...
	 * 1000张1元，剩下组成剩下0元
	 */
	private static int baoli(int[] arr, int index, int num) {
		if (num < 0 || arr == null || arr.length == 0)
			return 0;

		int res = 0;
		if (index == arr.length) {// 到最后如果为0，说明这个方式正好可以平凑完毕，返回1，否则返回0
			res = num == 0 ? 1 : 0;
		} else {
			for (int j = 0; arr[index] * j <= num; j++) {
				res += baoli(arr, index + 1, num - arr[index] * j);// index+1循环完毕表示用尽arr[index]的总次数
			}
		}
		return res;
	}

	// 2、记录搜索法
	/*
	 * 简历一个二维数组存储递归过程中的值，如果有不再重复计算。
	 */
	private static int[][] temp;// 利用递归方法的变量（index，num）维护二维数组减少重复

	private static int jiyi(int[] arr, int index, int num) {
		if (temp == null) {
			temp = new int[arr.length + 1][num + 1];
		}

		if (num < 0 || arr == null || arr.length == 0)
			return 0;

		int res = 0;
		if (index == arr.length) {
			res = num == 0 ? 1 : 0;
		} else {
			int mapValue = 0;
			for (int j = 0; arr[index] * j <= num; j++) {// 如果缓存中有值，直接取。没有值计算之后设值
				mapValue = temp[index + 1][num - arr[index] * j];
				if (mapValue != 0) {
					res += mapValue == -1 ? 0 : mapValue;
				} else {
					res += jiyi(arr, index + 1, num - arr[index] * j);
				}
			}
		}
		temp[index][num] = res == 0 ? -1 : res;
		return res;
	}

	// 3、动态规划
	public static int dp(int[] arr, int num) {
		int[][] dp = new int[arr.length][num + 1];

		//初始化第一行和第一列
		for (int j = 0; j < dp[0].length; j++) {
			dp[0][j] = 1;
		}
		for (int i = 0; i < dp.length; i++) {
			dp[i][0] = 1;
		}
		
		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {
				for(int mm = 0;j-arr[i]*mm>=0;mm++){
					dp[i][j]+=dp[i-1][j-arr[i]*mm];
				}
			}
		}
		return dp[arr.length-1][num];

	}

	public static void main(String[] args) {
		System.out.println(fun1(1000));
	}
}
