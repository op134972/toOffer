package √¿Õ≈2016;

public class Demo3_b {

	private static int fun1(int[] arr) {

		int len = arr.length;

		int max = 0;
		for (int i = 0; i < len; i++) {
			int l = i, r = i;
			while (l > 0 && arr[l-1] >= arr[i]) {
				l--;
			}
			while (r < len-1 && arr[r+1] >= arr[i]) {
				r++;
			}
			max = Math.max(max, (r - l + 1) * arr[i]);
		}
		return max;
	}
	
	
	public static void main(String[] args) {
		int[] arr = {6,2,5,4,5,1,6};
		
		System.out.println(fun1(arr));
	}
}
