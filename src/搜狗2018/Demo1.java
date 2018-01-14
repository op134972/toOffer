package 搜狗2018;

import java.util.Arrays;
import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] arr = new double[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextDouble();
		}
		System.out.println(fun(arr));
		
	}

	private static int fun(double[] arr) {
		if (arr.length < 3)
			return 0;
		Arrays.sort(arr);
		double[] arr2 = new double[arr.length * 2];
		for (int i = 0; i < arr2.length; i++) {
			arr2[i] = arr[i % arr.length] + 360
					* (int) ((int) i / (int) arr.length);
		}
		
		System.out.println(Arrays.toString(arr2));
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			int n = 0;
			n = binaryFind(arr2, i, arr[i]+180);
			if (n >= 2) {
				count += n * (n - 1) / 2;
			}
		}

		return count;
	}
	//返回指定位数开始，小于target的数字个数
	private static int binaryFind(double[]arr ,int start,double target){
		int s = start;
		int e = arr.length-1;
		int mid = (s+e)/2;
		while(s<=e){
			mid = (s+e)/2;
			if(arr[mid]>target){
				e = mid-1;
			}else{
				s = mid+1;
			}
			
		}
		if(arr[s]>=target){s--;}
		System.out.println(s-start);
		return s-start;
	}
}
