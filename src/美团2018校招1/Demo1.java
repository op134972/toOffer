package 美团2018校招1;

/**
 * 题目 描述
 * 
 * 序列中任意个连续的元素组成的子序列称为该序列的子串。 现在给你一个序列P和一个整数K，询问元素和是K的倍数的子串的最大长度。
 * 比如序列[1,2,3,4,5]，给定的整数 K 为 5，其中满足条件的子串为{5}、{2,3}、{1,2,3,4}、{1,2,3,4,5}， 那么答案就为
 * 5，因为最长的子串为{1,2,3,4,5}；如果满足条件的子串不存在，就输出 0。 输入
 * 
 * 第一含一个整数N, 1 ≤ N ≤ 105 。 第二行包含 N 个整数pi ，pi 表示序列 P 第 i 个元素的值。0 ≤ pi ≤ 105 。
 * 第三行包含一个整数 K， 1 ≤ K ≤ 105 。 输出
 * 
 * 只有一行,输出元素和是K的倍数的子串的最大长度。 Example
 * 
Input

5 
1 2 3 4 5
5 
6 
2 1 7 7 7 7 
4

Output

5
5
 */
public class Demo1 {
	public static void main(String[] args) {
		int[] arr = {2,1,7,7,7,7};
		System.out.println(getMaxLenthOfK(arr, 4));
	}
	
	
	/*
	 * 
	 */
	private static int getMaxLenthOfK(int[]arr,int target){
		int len = arr.length;
		int length = 0;
		for (int i = 0; i < len; i++) {
			int sum = 0;
			for (int j = i; j < len; j++) {
				sum += arr[j];
				if(sum%target == 0&&j-i+1>length){
					length = j-i+1;
				}
			}
		}
		return length;
	}
}
