package 网易编程题01;

import java.util.Arrays;

public class Demo7_最大数列相邻差 {

	public static void main(String[] args) {
		int[] arr = {1,2,5,6,11};
		
		System.out.println(maxC(arr));
	}
	
	private static int maxC(int[]arr){
		Arrays.sort(arr);
		
		//首先加两个
		int max = arr[arr.length-1];//加入疯狂队列的最大值
		int min = arr[0];//加入疯狂队列的最小值
		int dif = max-min;
		
		int minIndex = 1;//还未加入的最小元素的下标
		int maxIndex = arr.length-2;//还未加入的最大元素的下标
		
		while(minIndex<maxIndex){
			dif += max-arr[minIndex];
			dif += arr[maxIndex]-min;
			min = arr[minIndex++];
			max = arr[maxIndex--];
		}
		
		dif += Math.max(arr[maxIndex]-min, max-arr[minIndex]);
		
		return dif;
	}
}
