package LeetCode;

import java.util.Arrays;

/*
 * Given n, how many structurally unique BST's (binary search trees) that store values 1...n?
 For example,
 Given n = 3, there are a total of 5 unique BST's.
 1         3     3      2      1
 \       /     /      / \      \
 3     2     1      1   3      2
 /     /       \                 \
 2     1         2                 3

 */
public class Demo1_binarysearchtree {
	public static void main(String[] args) {
		//System.out.println(numTrees(10));
		System.out.println(numTrees2(25));
	}
	
	public static int numTrees(int n) {
		if(n == 1|| n == 0)
			return 1;
		
		int [] dp = new int[n];//dp只代表以第n个数为根的情况数
		for (int i = 1; i <= dp.length; i++) {
			dp[i-1] = numTrees(i-1)*numTrees(n-i);
		}
		int sum = 0;
		for (int i = 0; i < dp.length; i++) {
			sum += dp[i];
		}
		return sum;
	}
	public static int numTrees2(int n) {
		if(n == 1|| n == 0)
			return 1;
		
		int [] dp = new int[n+1];//在这里代表dp[n]代表numTrees(n)的结果
		
		dp[0] = 1;
		dp[1] = 1;
		for (int i = 2; i < dp.length; i++) {
			for (int j = 1; j <= i; j++) {
				dp[i] += dp[j-1]*dp[i-j]; 
			}
		}
		return dp[n];
	}
}
