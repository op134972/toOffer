package หับü2018;

import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(fun(arr));
	}

	private static int fun(int[] arr) {
		int i = 0;
		int j = arr.length - 1;
		int sum = 0;
		while (i < j) {
			if (arr[i] == arr[j]) {
				i++;
				j--;
			} else if (arr[i] < arr[j]) {
				sum += arr[i++];
			} else {
				sum += arr[j--];
			}
		}
		for (int k = 0; k < arr.length; k++) {
			sum += arr[k];
		}

		return sum;
	}
}
