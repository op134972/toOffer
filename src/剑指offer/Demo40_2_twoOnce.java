package 剑指offer;

import java.util.Arrays;

public class Demo40_2_twoOnce {
	public static void main(String[] args) {
		int[] arr = {1,1,1,1,1,1,1,1,2,3};
		
		int[] num1 = new int[1];
		int[] num2 = new int[1];
		FindNumsAppearOnce(arr, num1, num2);
		
		System.out.println(Arrays.toString(num1));
		System.out.println(Arrays.toString(num2));
	}
	
	
	public static void FindNumsAppearOnce(int [] array,int num1[] , int num2[]) {
        int r = 0;
		for (int i = 0; i < array.length; i++) {
			r ^= array[i];
		}
		
		int firstBit1 = findFirstBit1(r);
		
		int len = array.length;
		int arr1I = 0,arr2I = 0;
		int[] arr1 = new int[len];
		int[] arr2 = new int[len];
		
		for (int i = 0; i < array.length; i++) {
			if((firstBit1|array[i])!=array[i]){//不能再用异或了，要用或。2--10   3--11   与01取或  有一个值不会变
				arr1[arr1I++] = array[i];
			}else{
				arr2[arr2I++] = array[i];
			}
		}
		
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		System.out.println("fir:"+firstBit1);
		int o1 = getOnce(arr1);
		int o2 = getOnce(arr2);
		
		num1[0] = o1;
		num2[0] = o2;
		System.out.println(o1+":"+o2);
		
    }
	public static int getOnce(int[]arr){
		
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			result ^= arr[i];
		}
		return result;
	}


	private static int findFirstBit1(int r) {
		int result = 1;
		while(r>result){
			result<<=1;
		}
		return result;
	}
}
