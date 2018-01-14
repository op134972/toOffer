package ½£Ö¸offer;

import java.util.HashSet;
import java.util.Set;

public class Demo33 {

	public static void main(String[] args) {
		int[]arr =  {3,32,321};
		System.out.println(minArr(arr));
	}
	
	public static int minArr(int[]arr){
		if(arr.length == 1)
			return arr[0];
		
		Set<Integer> set = new HashSet<>();
		list(arr, set, 0);
		
		int min = Integer.MAX_VALUE;
		for (Integer integer : set) {
			if(integer<min){
				min = integer;
			}
		}
		return min;
	}
	
	public static void list(int[]arr,Set<Integer> set,int k){
		if(arr.length == k){
			set.add(trans(arr));
		}
		for (int i = k; i < arr.length; i++) {
			swap(arr,i,k);
			list(arr, set, k+1);
			swap(arr,i,k);
		}		
	}

	private static Integer trans(int[] arr) {
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < arr.length; i++) {
			sb.append(arr[i]);
		}
		Integer r = Integer.valueOf(sb.toString());
		return r;
	}

	private static void swap(int[] arr, int i, int k) {
		int t = arr[i];
		arr[i] = arr[k];
		arr[k] = t;
	}
}
