package 网易编程题01;

public class Demo6_移动棋子 {
	
	
	
	private static int fun(int[]xarr,int[]yarr){
		
		
		//动态规划，dp[i][j]表示在i的位置，存在j颗棋子需要移动的位置数
		int [][] dp = new int[xarr.length+1][yarr.length+1];
		//初始化第一列
		for (int i = 1; i < dp.length; i++) {
			dp[i][1] = 0; 
		}
		//初始化第一行
		for (int i = 1; i < dp[0].length; i++) {
			dp[1][i] = 0;
			for (int j = 1; j < xarr.length; j++) {
				dp[1][i] += Math.abs(xarr[j]-xarr[0])+Math.abs(yarr[j]-yarr[0]);
			}
		}
		
		for (int i = 2; i < dp.length; i++) {
			for (int j = 2; j < dp[0].length; j++) {
			}
		}
		
		return 0;
		
	}
}
