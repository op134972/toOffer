package ţ��.��̬�滮;

import java.util.Arrays;
import java.util.List;

/*
 * ��������������ӣ�������������10kg�ı�����������3����Ʒ���ֱ�Ϊa1��a2��a3����Ʒa1����Ϊ3kg��
 * ��ֵΪ4����Ʒa2����Ϊ4kg����ֵΪ5����Ʒa3����Ϊ5kg����ֵΪ6������Щ��Ʒ���뱳����ʹ�ñ�����
 * ���ܼ�ֵ���
 */
public class �������� {

	/**
	 * 
	 * @param arr
	 *            ������������ {3,4,5}
	 * @param price
	 *            ������ֵ���� {4,5,6}
	 * @param weight
	 *            ���������� 10
	 * @return
	 */
	private static int maxVal(int[] arr, int[] price, int weight) {
		int[][] dp = new int[arr.length][weight + 1];

		// ��ʼ����һ��
		for (int j = 0; j < dp[0].length; j++) {
			dp[0][j] = (j / arr[0]) * price[0];
		}
		// ��ʼ����һ��
		for (int i = 0; i < dp.length; i++) {
			dp[i][0] = 0;
		}
		
		//״̬�仯
		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {
				int defVal = 0;
				for (int mm = 0; j-arr[i]*mm >=0; mm++) {//mm��ʾװ��arr[i]��Ʒ����Ŀ����0��ʼ�������ƽ��˼��
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
