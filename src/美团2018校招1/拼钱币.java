package ����2018У��1;

/*
 * ��Ŀ����
 ����������� 1��5��10��20��50��100 Ԫ��ֽ�ң�����ÿ�ֱ�ֵ���������㹻�࣬��д���������NԪ��NΪ0~10000�ķǸ��������Ĳ�ͬ��ϵĸ����� 
 ��������:
 �������һ������n(1 �� n �� 10000)


 �������:
 ���һ������,��ʾ��ͬ����Ϸ�����

 ��������1:
 1

 �������1:
 1
 */
public class ƴǮ�� {

	// 1�������ƽ�
	public static int fun1(int num) {
		int[] arr = { 1, 5, 10, 20, 50, 100 };

		System.out.println("����"+baoli(arr,0,num));
		System.out.println("����"+jiyi(arr, 0, num));
		System.out.println("��̬�滮"+dp(arr,num));
		
		return 0;
	}

	/*
	 * 1000Ԫ
	 * 
	 * 1��0��1Ԫ��ʣ��{5,10,20,50,100}���ʣ��1000Ԫ 2��1��1Ԫ��ʣ��{5,10,20,50,100}���ʣ��999Ԫ ...
	 * 1000��1Ԫ��ʣ�����ʣ��0Ԫ
	 */
	private static int baoli(int[] arr, int index, int num) {
		if (num < 0 || arr == null || arr.length == 0)
			return 0;

		int res = 0;
		if (index == arr.length) {// ��������Ϊ0��˵�������ʽ���ÿ���ƽ����ϣ�����1�����򷵻�0
			res = num == 0 ? 1 : 0;
		} else {
			for (int j = 0; arr[index] * j <= num; j++) {
				res += baoli(arr, index + 1, num - arr[index] * j);// index+1ѭ����ϱ�ʾ�þ�arr[index]���ܴ���
			}
		}
		return res;
	}

	// 2����¼������
	/*
	 * ����һ����ά����洢�ݹ�����е�ֵ������в����ظ����㡣
	 */
	private static int[][] temp;// ���õݹ鷽���ı�����index��num��ά����ά��������ظ�

	private static int jiyi(int[] arr, int index, int num) {
		if (temp == null) {
			temp = new int[arr.length + 1][num + 1];
		}

		if (num < 0 || arr == null || arr.length == 0)
			return 0;

		int res = 0;
		if (index == arr.length) {
			res = num == 0 ? 1 : 0;
		} else {
			int mapValue = 0;
			for (int j = 0; arr[index] * j <= num; j++) {// �����������ֵ��ֱ��ȡ��û��ֵ����֮����ֵ
				mapValue = temp[index + 1][num - arr[index] * j];
				if (mapValue != 0) {
					res += mapValue == -1 ? 0 : mapValue;
				} else {
					res += jiyi(arr, index + 1, num - arr[index] * j);
				}
			}
		}
		temp[index][num] = res == 0 ? -1 : res;
		return res;
	}

	// 3����̬�滮
	public static int dp(int[] arr, int num) {
		int[][] dp = new int[arr.length][num + 1];

		//��ʼ����һ�к͵�һ��
		for (int j = 0; j < dp[0].length; j++) {
			dp[0][j] = 1;
		}
		for (int i = 0; i < dp.length; i++) {
			dp[i][0] = 1;
		}
		
		for (int i = 1; i < dp.length; i++) {
			for (int j = 1; j < dp[0].length; j++) {
				for(int mm = 0;j-arr[i]*mm>=0;mm++){
					dp[i][j]+=dp[i-1][j-arr[i]*mm];
				}
			}
		}
		return dp[arr.length-1][num];

	}

	public static void main(String[] args) {
		System.out.println(fun1(1000));
	}
}
