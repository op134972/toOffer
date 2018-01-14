package หับü2018;

public class Demo3 {

	public static void main(String[] args) {
		int[] arr = { 3, 2, 4 };
		System.out.println(fun(arr));
	}

	private static int fun(int[] arr) {
		int min = Integer.MAX_VALUE;
		for (int k = 0; k < arr.length; k++) {
			int sum = 0;
			int i = k - 1;
			int j = k + 1;
			while (i >= 0 && j < arr.length) {
				if (arr[i] == arr[j]) {
					j++;
					i--;
				} else if (arr[i] > arr[j]) {
					sum += arr[j++];
				} else {
					sum += arr[i--];
				}
			}
			if (i < 0) {
				for (int j2 = j; j2 < arr.length; j2++) {
					sum += arr[j2];
				}
			}
			if (j == arr.length) {
				for (int j2 = i; j2 >= 0; j2--) {
					sum += arr[j2];
				}
			}

			min = Math.min(min, sum);
		}

		for (int k = 0; k < arr.length; k++) {
			min += arr[k];
		}

		return min;
	}
}
