package ��ָoffer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;


/*
 * �ַ������������
 * abcd �������
 * a
 * b
 * c
 * d
 * ab
 * cd
 * ac
 * bd
 * ...
 */
public class Demo28_b {

	
	/**
	 * ��ȫ����
	 * ��������ȡǰ1λ��ǰ2
	 * @param str
	 * @return
	 */
	public static ArrayList<String> all(String str){
		ArrayList<String> list = new ArrayList<>();
		if(str == null)
			return list;
		
		Set<String> set = new HashSet<>();
		fun1(set,str);
		
		list.addAll(set);
		Collections.sort(list);
		return list;
	}

	private static void fun1(Set<String> set,String str) {
		ArrayList<String> list = Demo28.all(str);
		for (String string : list) {
			for (int j = 0; j < str.length(); j++) {
				set.add(string.substring(0,j+1));
			}
		}
	}
	
	public static void main(String[] args) {
		ArrayList<String> all = all("abc");
		for (String string : all) {
			System.out.println(string);
		}
	}
	
	
}
