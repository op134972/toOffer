package ��ָoffer;


/**
 * ����1:����ĳ���һ����ǰ��ĳ�������2\3\5��õġ�
 * 1����������
 * 2����1��ʼ 2��3��5��ȡ2
 * 3��1��2  ȡ1*3,1*5����1+1��*2����Сֵ��
 * 4��i2,i3,i5�ֱ����˷����ӵĻ�����
 *
 */
public class Demo34_ugly {
	
	public static void main(String[] args) {
		System.out.println(ugly(7));
	}
	public static int ugly(int n){
		if(n<=0)
			return -1;
		if(n<7){
			return n;
		}
		
		int[]arr = new int[n+1];
		arr[0] = 1;
		int i2=0,i3=0,i5 = 0;
		for (int i = 1; i < n+1; i++) {
			arr[i] = Math.min(Math.min(arr[i2]*2,arr[i3]*3), arr[i5]*5);
			if(arr[i] == arr[i2]*2)
				i2++;
			if(arr[i] == arr[i3]*3)
				i3++;
			if(arr[i] == arr[i5]*5)
				i5++;
		}
		return arr[n-1];
	}

}
