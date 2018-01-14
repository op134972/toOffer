package 剑指offer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Demo32_comparator {
	public static void main(String[] args) {
		int[] arr = {3,312,321,1,3,7};
		System.out.println(min(arr));
	}
	
	public static Integer min(int[] arr){
		List<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {
			list.add(arr[i]);
		}
		
		//定义排序新规则
		Collections.sort(list,new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return (o1+""+o2).compareTo(o2+""+o1);
			}
		});
		
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < list.size(); i++) {
			sb.append(list.get(i));
		}
		return Integer.valueOf(sb.toString());
	}
}
