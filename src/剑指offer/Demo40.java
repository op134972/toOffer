package ��ָoffer;


/**
 * ������ֻ����һ�ε�����
 * 
 * ˼·������Ԫ����������ʣ�µľ�������Ԫ�ء�
 * @author lenovo
 *
 */
public class Demo40 {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,5,6,7,8,9,8,7,4,5,6,3,2,1};
		System.out.println(getOnce(arr));
	}
	public static int getOnce(int[]arr){
		
		int result = 0;
		for (int i = 0; i < arr.length; i++) {
			result ^= arr[i];
		}
		return result;
	}
}
