package ���ױ����01;

import java.util.Scanner;


/*
 * С��Ϊ�������ĸ�ĸ�������Ѿ����������,���������ȥ�Լ���סһ��ʱ�䡣
 * һ����������������໨��: С��ÿ������һ��ˮ��������Ҫÿ��֧��xԪ
 * �ķ�����𡣵�ǰС�������Ѿ���f��ˮ����dԪǮ,С��Ҳ��ȥ�̵깺��һЩ
 * ˮ��,�̵�ÿ��ˮ������pԪ��С��Ϊ�˱������������������,ϣ���ܶ�����
 * ���ʱ��Խ��Խ��,С��ϣ��������������һ��������ܶ�����������졣 
��������:
�������һ��,�ĸ�����x, f, d, p(1 �� x,f,d,p �� 2 * 10^9),�Կո�ָ�
 */
public class Demo5_������С�� {

	public static void main(String[] args) {
		Scanner sc=  new Scanner(System.in);
		int x = sc.nextInt();
		int f = sc.nextInt();
		int d = sc.nextInt();
		int p = sc.nextInt();
		System.out.println(fun(x, f, d, p));
	}
	
	//2 17 20 1
	/**
	 * �򵥵ĳ���
	 * @param x ÿ�췿��
	 * @param f ��ʼƻ����
	 * @param d ��Ǯ��
	 * @param p ƻ������
	 * @return
	 */
	private static int fun(int x,int f, int d, int p){
		if(f == 0){
			return d/(p+x);
		}
		else{
			return Math.min((d-x*f)/(p+x)+f, d/x);
		}
	}
}
