package 剑指offer;

import java.util.Arrays;



/**
 * 扑克牌中的顺子
 * @author lenovo
 *
 */
public class Demo44 {

	
	public static void main(String[] args) {
		int[]arr = {0,0,0,1,2,3,4,4,8,9};
		System.out.println(isContinuous(arr));
	}
	
	public static boolean isContinuous(int [] arr) {
		if(arr.length == 0||arr.length == 1)
			return true;
		Arrays.sort(arr);
		
		int kingNum = 0;
		for (int i = 0; i < arr.length-1; i++) {
			if(arr[i] == 0){
				kingNum++;
			}else{
				if(arr[i+1]-arr[i]==0)//非零且相等，不是顺子
					return false;
				int dis = arr[i+1]-arr[i];
				kingNum = kingNum-dis+1;
				if(kingNum<0)
					return false;
			}
		}
		return true;
    }
}
