package Эјвз2018;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			int s = sc.nextInt();
			System.out.println(fun(n, s));
		}

	}

	private static String fun(int n, int s) {
		if (s <= n)
			return "1";
		if (s > 6 * n)
			return "0";

		long[][] dp = new long[n][s + 1];
		for (int i = 0; i < dp[0].length; i++) {
			if (i >= 1 && i <= 6)
				dp[0][i] = 1;
		}

		for (int i = 1; i < dp.length; i++) {
			for (int j = 0; j < dp[0].length; j++) {
				for (int mm = 1; j - mm > 0&&mm<=6; mm++) {
					dp[i][j] += dp[i - 1][j - mm];
				}
			}
		}

		for (int i = 0; i < dp.length; i++) {
			System.out.println(Arrays.toString(dp[i]));
		}
		
		BigDecimal aa = new BigDecimal(0);
		for (int i = 0; i < dp[0].length-1; i++) {
			aa = aa.add(new BigDecimal(dp[n-1][i]));
		}
		BigDecimal bb = new BigDecimal(6);
		BigDecimal pow = bb.pow(n);
		
		aa = pow.subtract(aa);
		BigDecimal gcd = gcd(pow, aa);
		return aa.divide(gcd).toString()+"/"+pow.divide(gcd).toString();

	}

	public static BigDecimal gcd(BigDecimal aa, BigDecimal bb) { 
		if (bb.toString().equals("0"))
			return aa ;
		else{
			BigDecimal[] divideAndRemainder = aa.divideAndRemainder(bb);
			return gcd(bb, divideAndRemainder[1]);
		}
	}
}
