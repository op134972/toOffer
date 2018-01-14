package INK2018;

import java.util.Scanner;

public class Demo3 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		
		str1 = str1.substring(6, str1.length()-2);
		str2 = str2.substring(6, str2.length()-2);
		
		System.out.println(fun(str1,str2));
		
	}

	private static String fun(String str1, String str2) {
		String[] a1 = str1.trim().split(",");
		String[] a2 = str2.trim().split(",");
		
		int[][] dp = new int[a1.length][a2.length];
		
		int maxIn = 0;
		int max = 0;
		for (int i = 0; i < dp.length; i++) {
			for (int j = 0; j < dp.length; j++) {
				if(a1[i].trim().equals(a2[j].trim())){
					if(i-1>=0&&j-1>=0){
						dp[i][j] = dp[i-1][j-1]+1;
					}else{
						dp[i][j] = 1;
					}
				}
				if(dp[i][j]>max){
					maxIn = i;
					max = dp[i][j];
				}
			}
		}
		StringBuffer sb = new StringBuffer();
		for (int i = maxIn-max+1; i <= maxIn; i++) {
			sb.append(a1[i]+",");
		}
		return sb.toString().substring(0,sb.toString().length()-1).trim();
		
		
	}
}
