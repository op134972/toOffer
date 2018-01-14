package 网易编程题01;

import java.util.Scanner;






/**
 * 继续找规律
 * @author lenovo
 *
 */
public class Demo4_逆序列2 {

	
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
		boolean jian = true;//辅助数组的坐标移动方向，加减交替的
		if(len%2 == 0){//偶数其实位置是中偏右，起始操作是减1
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
