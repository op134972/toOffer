package ţ��;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * ���һ������ͨ��ѭ�����ƻ�õĵ��ʣ����ǳ���Щ���ʶ�Ϊһ��ѭ�����ʡ�
 *  ���磺picture �� turepic ��������ͬһ��ѭ�����ʡ� ���ڸ���n�����ʣ�
 *  ��Ҫͳ�����n���������ж�����ѭ�����ʡ� 
 */
public class Demo5 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<String> list = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			list.add(sc.next());
		}
		
		System.out.println(getCycWordNum(list));
	}
	
	/*
	 *1�����б��һ�����ʵ��ӣ����ں����б��б����Ƿ��ǵ�ǰ���ʵ�ѭ������
	 */
	public static int getCycWordNum(ArrayList<String> list){
		if(list.size() == 0)
			return 0;
			
		boolean flag = false;
		int count = 0;
		while(!list.isEmpty()){
			String word = list.remove(0);
			word = word+word;
			for (int i = 0; i < list.size(); i++) {
				if(word.contains(list.get(i))){
					flag = true;
					list.remove(i);
					i--;//removeֻ�������������٣�iΪ֮ǰ��i+1��Ԫ��
				}
			}
			if(flag){
				count++;
				flag = false;
			}
		}
		return count;
	}

}
