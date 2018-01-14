package 剑指offer;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

/*
 * 滑动窗口的最大值
 */
public class Demo65 {

	public static ArrayList<Integer> maxInWindows(int[] num, int size) {
		ArrayList<Integer> list = new ArrayList<>();
		int len = num.length;
		if (size > len)
			return list;


		PriorityQueue<Integer> queue = new PriorityQueue<Integer>(10,
				new Comparator<Integer>() {
					public int compare(Integer o1, Integer o2) {
						return o2 - o1;
					};
				});
		for (int i = 0; i < size; i++) {
			queue.add(num[i]);
		}
		list.add(queue.peek());

		for (int i = size; i < num.length; i++) {
			queue.offer(num[i]);
			if(queue.peek() == num[i-size]){
				queue.poll();
			}
			list.add(queue.peek());
		}

		return list;
	}
	
	public static void main(String[] args) {
		int[] arr = {3,2,5,6,1,4,8,6,9,10};
		
		System.out.println(maxInWindows(arr,5).toString());
	}
}
