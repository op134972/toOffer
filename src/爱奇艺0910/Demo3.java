package 爱奇艺0910;

import java.util.Arrays;
import java.util.Scanner;

public class Demo3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			
			int n = sc.nextInt();
			int m = sc.nextInt();
			
			System.out.println(fun(n,m));
		}
	}

	private static int fun(int n, int m) {
		int[][] dp = new int[n+1][m+1];
		dp[1][1] = 1;
		
		//第一行
		for (int i = 1; i < dp.length; i++) {
			if((Math.sqrt(i)*(Math.sqrt(i)) == i)){//是整数
				dp[i][1] = dp[i-1][1]+1;
			}else{
				dp[i][1] = dp[i-1][1];
			}
		}
		//第一列
		for (int i = 1; i < dp[0].length; i++) {
			if((Math.sqrt(i)*(Math.sqrt(i)) == i)){//是整数
				dp[1][i] = dp[1][i-1]+1;
			}else{
				dp[1][i] = dp[1][i-1];
			}
		}
		
		
		
		//dp[i][j] = dp[i-1][j]+{i、1~j 中符号条件的个数}
		for (int i = 2; i < dp.length; i++) {
			
			for (int j = 2; j < dp[0].length; j++) {
				int count = 0;
				for (int k = 1; k <= j; k++) {
					if(Math.sqrt(i*k)==(int)Math.sqrt(i*k)){
						count++;
					}
				}
				dp[i][j] = dp[i-1][j]+count;
				count = 0;
			}
		}
		return dp[n][m];
	}
}
