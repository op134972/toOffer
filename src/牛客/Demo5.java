package 牛客;

import java.util.ArrayList;
import java.util.Scanner;

/*
 * 如果一个单词通过循环右移获得的单词，我们称这些单词都为一种循环单词。
 *  例如：picture 和 turepic 就是属于同一种循环单词。 现在给出n个单词，
 *  需要统计这个n个单词中有多少种循环单词。 
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
	 *1、将列表第一个单词叠加，并在后续列表中遍历是否是当前单词的循环单词
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
					i--;//remove只有数组数量减少，i为之前的i+1个元素
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
