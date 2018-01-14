package Å£¿Í;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Demo10528982 {
	public static void main(String[] args) {
		ArrayList<String> all = all("abcde");
		for (String string : all) {
			System.out.println(string);
		}
		
		System.out.println(all.size());
		System.out.println(all.indexOf("cbaed"));
	}
	public static ArrayList<String> all(String str){
		ArrayList<String> list = new ArrayList<>();
		if(str.length() == 0)
			return list;
		char[] array = str.toCharArray();
		Set<String> set = new HashSet<>();
		
		fun1(set,array,0);
		
		list.addAll(set);
		Collections.sort(list);
		return list;
	}
	private static void fun1(Set<String> set, char[] array, int k) {
		if(k == array.length-1){
			set.add(new String(array));
			return;
		}
		for (int i = k; i < array.length; i++) {
			swap(array, k, i);
			fun1(set, array, k+1);
			swap(array, k, i);//»Ö¸´
		}
	}
	public static void swap(char[]arr,int a,int b){
		char t = arr[a];
		arr[a] = arr[b];
		arr[b] = t;
	}
}
