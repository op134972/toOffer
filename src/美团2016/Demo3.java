package 美团2016;

import java.util.Stack;

/*
 * 滑动窗口的最大值
 */
public class Demo3 {

	public static void main(String[] args) {
		int[] arr = {6,2,5,4,5,1,6};
		
		System.out.println(maxArea(arr));
	}
	
	
	
	public static int maxArea(int[]arr){
		if(arr.length == 1)
			return arr[0];
		
		int len = arr.length;
		int max = 0;
		for (int i = 0; i < len; i++) {
			for (int j = i; j < len; j++) {
				int nmax = getMin(arr,i,j)*(j-i+1);
				if(nmax>max)
					max = nmax;
			}
		}
		return max;
	}
	
	private static int getMin(int[]arr,int from,int to){
		int min = arr[from];
		for (int i = from; i <= to; i++) {
			if(arr[i]<min)
				min = arr[i];
		}
		return min;
	}
	
}
