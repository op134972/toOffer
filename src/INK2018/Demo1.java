package INK2018;

import java.util.Scanner;

public class Demo1 {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] arr = fun(n);
		for (int i = 0; i < arr.length; i++) {
			StringBuffer sb = new StringBuffer();
			for (int j = 0; j < arr.length; j++) {
				sb.append(arr[i][j]+"\t");
			}
			System.out.println(sb.toString().trim());
			sb.delete(0, sb.length());
		}
		
	}
	static volatile int val = 1;

	private static int[][] fun(int n){
		int[][]arr = new int[n][n];
		
		int x = n,y = n;
		int i = 0;
		int j = 0;
		int count = 0;// 循环圈数
		while (val <= n*n) {
			// 右
			while (j < x - count) {
				arr[i][j++] = val++;
			}
			j--;
            i++;
			// 下
			while (i < y - count) {
				arr[i++][j]=val++;
			}
			i--;
            j--;
			// 左
			while (j >= count) {
				arr[i][j--]=val++;
			}
			j++;
            i--;
			// 上
			while (i > count) {
				arr[i--][j]=val++;
			}
			i++;
			j++;
            
			count++;
		}
		
		return arr;
	}

}
