package 网易编程题01;

import java.util.Arrays;
import java.util.Scanner;

public class Demo1_彩色砖块 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			String str = sc.nextLine();
			System.out.println(fun1(str));
		}
	}

	private static int fun1(String str) {
		char[] arr = str.toCharArray();

		Arrays.sort(arr);

		int difCount = 0;
		for (int i = 0; i < arr.length - 1; i++) {
			if (arr[i] != arr[i + 1]) {
				difCount++;
			}
			if (difCount > 1)
				return 0;
		}

		return difCount < 1 ? 1 : 2;
	}
}
