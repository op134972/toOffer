package ���ױ����01;

import java.util.Scanner;






/**
 * �����ҹ���
 * @author lenovo
 *
 */
public class Demo4_������2 {

	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			int[] arr = new int[n];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = sc.nextInt();
			}
			System.out.println(fun(arr));
		}
		
	}
	
	private static String fun(int[]arr){
		int len = arr.length;
		
		int[] newArr = new int[len];
		boolean jian = true;//��������������ƶ����򣬼Ӽ������
		if(len%2 == 0){//ż����ʵλ������ƫ�ң���ʼ�����Ǽ�1
			int index = (0+arr.length)/2;
			for (int i = 0; i < arr.length; i++) {
				newArr[index] = arr[i];
				if(jian){
					index = index - (i+1);
				}else{
					index = index + (i+1);
				}
				jian = !jian;
			}
		}else{
			int index = (0+arr.length)/2;
			for (int i = 0; i < arr.length; i++) {
				newArr[index] = arr[i];
				if(jian){
					index = index + (i+1);
				}else{
					index = index - (i+1);
				}
				jian = !jian;
			}
		}
		
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < newArr.length; i++) {
			sb.append(newArr[i]+" ");
		}
	
		return sb.toString().trim();
	}
}
