package ���ױ����01;

import java.util.Arrays;

public class Demo7_����������ڲ� {

	public static void main(String[] args) {
		int[] arr = {1,2,5,6,11};
		
		System.out.println(maxC(arr));
	}
	
	private static int maxC(int[]arr){
		Arrays.sort(arr);
		
		//���ȼ�����
		int max = arr[arr.length-1];//��������е����ֵ
		int min = arr[0];//��������е���Сֵ
		int dif = max-min;
		
		int minIndex = 1;//��δ�������СԪ�ص��±�
		int maxIndex = arr.length-2;//��δ��������Ԫ�ص��±�
		
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
