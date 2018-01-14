package 美团2018校招1;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

/*
 * 
 * 在上小学的时候，我们经常碰到这样的事：
 考完试后老师懒得改试卷，于是让我们同桌相互交换试卷后为对方批改。
 但是后来老师发现这样作容易出现作弊，于是他想了一个新办法。老师将
 同学分成了 n 个组，其中编号为𝑖的组中有si 个人。然后老师会按某种顺
 序依次访问这些组。
 对于他访问的第一个组，他会将这组内的所有试卷都收走，放置在桌上；
 对于他后续访问的每一个组，首先他会从桌上的试卷最上方拿出该组对应
 人数数量的试卷，随机分配给该组每个人一张试卷让他们进行批改，而后
 再将这组学生自己考的试卷收走放置在桌面试卷的最下方。当他访问完所
 有的组后他会将桌面上剩余的所有试卷随机分配给他第一个访问的组的学
 生进行批改。
 但他发现这种方法有时候也会出现问题：有可能在中途访问到某个组的时
 候桌面上的试卷不够分配给这组学生每人一张；也有可能最后会有学生分
 配到批改自己的试卷，而且这两种情况是否出现是与他访问每个组的顺序
 有关的。现在他想知道是否存在一种访问顺序能够使以上两种情况都不出
 现，顺利完成试卷批改呢？ 
 * 
 * 
Example

Input

2
10 20
4
2 3 3 1
Output

No
Yes
 */
public class Demo2 {
	public static void main(String[] args) {
		Integer[]arr = {2,3,3,1};
		System.out.println(can(arr));
	}
	
	
	/*
	 * 思路

把 s1…sn 按降序排列,不会出现第一种情况
若人数最多的一组的人数不比其他所有组的人数之和,则不会出现第二种情况
	 */

	private static String can(Integer[]arr){
		Arrays.sort(arr,new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				return o2-o1;
			}
		});
		int max = arr[0];
		int otherSum = 0;
		for (int i = 1; i < arr.length; i++) {
			otherSum += arr[i];
		}
		if(max<=otherSum)
			return "Yes";
		return "No";
	}
}
