package 网易编程题01;

import java.util.Scanner;


/*
 * 递归做法 ，时间复杂度过大
 */
public class Demo4_逆序列 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			System.out.println(fun(arr));
		}
		
	}
	
	private static String fun(int[]arr){
		return fun1(arr,0,arr.length-1);
		
	}

	private static String fun1(int[] arr, int i, int j) {
		if(i == j){
			return arr[i]+"";
		}
		
		return new StringBuffer(fun1(arr,i,j-1)+" "+arr[j]).reverse().toString().trim();
	}
}
