package 剑指offer;

import java.util.ArrayList;

/*
 * 圆圈中最后剩下的数字
 */
public class Demo45 {

	public static void main(String[] args) {
		System.out.println(LastRemaining_Solution(2, 1));
		
	}
	public static int LastRemaining_Solution(int n, int m) {
		if(n == 1)
			return 0;
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < n; i++) {
			list.add(i);
		}
		int step = m;
		while(list.size()!=1){
			int index = (m-1)%list.size();
			list.remove(index);
			m = step+index;
		}
		
		return list.get(0);
	}

}
