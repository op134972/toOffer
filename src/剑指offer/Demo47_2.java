package ��ָoffer;



/**
 * �����ö������������������ֵ
 * @author lenovo
 *
 */
public class Demo47_2 {

	
	public static void main(String[] args) {
		int a =10;
		int b = 15;
		
		//����1�����ڼӼ�
		a = a+b;
		b = a-b;
		a = a-b;
		
		
		//����2�����ڳ˳�
		a = a*b;
		b = a/b;
		a = a/b;
		
		//����3������λ����    001  101
		/*
		 * 001 101   
		 * 1��
		 */
		a = a^b;
		b = a^b;   //a^b^b=a   һ����������ȡ���0�������㽻���ɡ� 
		a = a^b;
		
		
		
		
		System.out.println(a+":::"+b);
	}
}
