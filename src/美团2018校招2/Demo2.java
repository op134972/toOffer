package √¿Õ≈2018–£’–2;

import java.util.Scanner;

public class Demo2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			
			System.out.println(fun(arr));
			
		}
	}

	private static String fun(int[] arr) {
		if(arr.length == 0)
			return "Alice";
		return fun1(arr, true, 0);
	}

	private static String fun1(int[] arr, boolean flag, int m) {
		if (m == arr.length-1) {
			if (flag) {
				return "Alice";
			} else {
				return "Bob";
			}
		}
		int k = flag? 1:0;
		for (int i = m; i < arr.length; i++) {
			if (arr[i] == k) {
				return fun1(arr,!flag, i);
			}
		}
		if (flag) {
			return "Bob";
		} else {
			return "Alice";
		}
	}
}
