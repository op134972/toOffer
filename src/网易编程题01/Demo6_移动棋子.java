package ���ױ����01;

public class Demo6_�ƶ����� {
	
	
	
	private static int fun(int[]xarr,int[]yarr){
		
		
		//��̬�滮��dp[i][j]��ʾ��i��λ�ã�����j��������Ҫ�ƶ���λ����
		int [][] dp = new int[xarr.length+1][yarr.length+1];
		//��ʼ����һ��
		for (int i = 1; i < dp.length; i++) {
			dp[i][1] = 0; 
		}
		//��ʼ����һ��
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
