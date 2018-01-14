package 网易编程题01;

import java.util.Arrays;
import java.util.Scanner;

public class Demo2_等差数列 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
 
			System.out.println(Arrays.toString(arr));
			System.out.println(fun1(arr));

		}

	}

	private static String fun1(int[] arr) {
		if (arr.length == 0 || arr.length == 1 || arr.length == 2)
			return "Possible";

		Arrays.sort(arr);

		for (int i = 0; i < arr.length - 2; i++) {
			if (arr[i] - arr[i + 1] != arr[i + 1] - arr[i + 2])
				return "Impossible";
		}

		return "Possible";
	}
}
