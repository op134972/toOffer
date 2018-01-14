package ����2018У��1;

/**
 * ��Ŀ ����
 * 
 * �����������������Ԫ����ɵ������г�Ϊ�����е��Ӵ��� ���ڸ���һ������P��һ������K��ѯ��Ԫ�غ���K�ı������Ӵ�����󳤶ȡ�
 * ��������[1,2,3,4,5]������������ K Ϊ 5�����������������Ӵ�Ϊ{5}��{2,3}��{1,2,3,4}��{1,2,3,4,5}�� ��ô�𰸾�Ϊ
 * 5����Ϊ����Ӵ�Ϊ{1,2,3,4,5}����������������Ӵ������ڣ������ 0�� ����
 * 
 * ��һ��һ������N, 1 �� N �� 105 �� �ڶ��а��� N ������pi ��pi ��ʾ���� P �� i ��Ԫ�ص�ֵ��0 �� pi �� 105 ��
 * �����а���һ������ K�� 1 �� K �� 105 �� ���
 * 
 * ֻ��һ��,���Ԫ�غ���K�ı������Ӵ�����󳤶ȡ� Example
 * 
Input

5 
1 2 3 4 5
5 
6 
2 1 7 7 7 7 
4

Output

5
5
 */
public class Demo1 {
	public static void main(String[] args) {
		int[] arr = {2,1,7,7,7,7};
		System.out.println(getMaxLenthOfK(arr, 4));
	}
	
	
	/*
	 * 
	 */
	private static int getMaxLenthOfK(int[]arr,int target){
		int len = arr.length;
		int length = 0;
		for (int i = 0; i < len; i++) {
			int sum = 0;
			for (int j = i; j < len; j++) {
				sum += arr[j];
				if(sum%target == 0&&j-i+1>length){
					length = j-i+1;
				}
			}
		}
		return length;
	}
}
