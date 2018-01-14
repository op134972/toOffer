package 完美世界;

import java.util.Arrays;
import java.util.Scanner;

public class DEmo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		System.out.println(fun(arr,m));
		
	}

	private static int fun(int[] arr, int m) {
		Arrays.sort(arr);
		int[][] dp = new int[arr.length][m+1];
		for (int i = 1; i < dp[0].length; i++) {
			if(i%arr[0] == 0)
			dp[0][i] = i/arr[0];
		}
		
		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {
				int mm = j/arr[i];
				for (int k = mm; k > 0; k--) {
					if(j-arr[i]*k==0||dp[i-1][j-arr[i]*k]!=0){
						dp[i][j] = dp[i-1][j-arr[i]*k]+k;
						break;
					}
				}
			}
		}

		
		for (int i = 0; i < dp.length; i++) {
			System.out.println(Arrays.toString(dp[i]));
		}
		
		return dp[arr.length-1][m] == 0? -1:dp[arr.length-1][m];
	}
}
