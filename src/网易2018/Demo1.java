package Эјвз2018;

import java.util.Arrays;
import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		int s = sc.nextInt();
		int  [] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(fun(arr,s));
		
	}

	private static int fun(int[] arr,int s) {
		Arrays.sort(arr);
		arr[0] = arr[0]+s;
		int min = arr[0],max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]<arr[i-1]){
				arr[i] = arr[i]+s;
			}else{
				arr[i] = arr[i]-s;
			}
			min =Math.min(min, arr[i]);
			max =Math.max(max, arr[i]);
		}
		return max-min;
	}
}
