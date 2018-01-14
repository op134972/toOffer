package 滴滴;

import java.util.Scanner;

public class Demo1_非空区间 {
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
		int count = 0;
		
		int xor = 0;
		int pre = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == 0){
				count++;
				xor = 0;
				pre = i;
				continue;
			}else{
				xor = xor ^ arr[i];
				if(xor == 0){
					count++;
					pre = i;
					xor = 0;
				}else{//否则，从后往前求 异或
					int newXor = 0;
					for (int j = i; j > pre; j--) {
						newXor = newXor^arr[j];
						if(newXor == 0){
							count++;
							pre = i;
							xor = 0;
							j = i+1;
						}
					}
				}
			}
		}
		
		return count;
	}
}
