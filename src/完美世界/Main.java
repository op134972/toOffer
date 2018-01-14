package 完美世界;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int[]arr1 = new int[n];
		int[]arr2 = new int[n];
		for (int i = 0; i < arr2.length; i++) {
			arr1[i] = sc.nextInt();
		}
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = sc.nextInt();
		}
		int m = sc.nextInt();
		System.out.println(fun(arr1,arr2,m));
		
		sc.close();
	}

	private static int fun(int[] arr1, int[] arr2, int m) {
		ArrayList<Title> list = new ArrayList<>();
		for (int i = 0; i < arr2.length; i++) {
			list.add(new Title(arr2[i], arr1[i]));
		}
		Collections.sort(list,new Comparator<Title>() {
			@Override
			public int compare(Title o1, Title o2) {
				if(o1.time == o2.time){
					return o1.score-o2.score;
				}else{
					return o1.time - o2.time;
				}
			}
		});
		
		int[][]dp = new int[arr1.length][m+1];
		int max = 0;
		for (int i = 0; i < dp[0].length; i++) {
			if(i>=list.get(0).time){
				dp[0][i] = list.get(0).score;
				max = Math.max(max, dp[0][i]);
			}
		}
		for (int i = 1; i < dp.length; i++) {
			for (int j = 0; j < dp[0].length; j++) {
				if(j-list.get(i).time>=0){
					dp[i][j] = Math.max(dp[i-1][j-list.get(i).time]+list.get(i).score,dp[i-1][j]);
				}else{
					dp[i][j] = dp[i-1][j];
				}
				max = Math.max(max, dp[i][j]);
			}
		}
		
		return max;
	}
}
class Title{
	int time;
	int score;
	public Title(int t,int s) {
		this.time = t;
		this.score = s;
	}
}
