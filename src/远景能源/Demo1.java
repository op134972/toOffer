package Ô¶¾°ÄÜÔ´;

import java.util.Arrays;
import java.util.Scanner;

public class Demo1 {
	public static void main(String[] args) {
		Scanner sc=  new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println(fun(arr));
	}
	
	private static int fun(int[]arr){
		
		int[] temp = new int[arr.length];
		for (int i = 0; i < arr.length; i++) {
			for (int j = i-1; j>=0; j--) {
				if(arr[j]<=arr[i]){
					temp[i] += arr[j];
				}
			}
		}
		
		int sum = 0;
		for (int i = 0; i < temp.length; i++) {
			sum += temp[i];
		}
		return sum;
	}
}
