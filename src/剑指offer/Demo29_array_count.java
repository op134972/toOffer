package 剑指offer;



/**
 * 遍历数组，维护count
 * @author lenovo
 *
 */
public class Demo29_array_count {

	public static void main(String[] args) {
		int[] arr = {1,1};
		System.out.println(moreThanHalf(arr));
	}
	
	public static boolean moreThanHalf(int[]arr){
		if(arr.length == 1)
			return true;
		
		int count = 1;
		int target = arr[0];
		int pre = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if(pre==arr[i]){
				count++;
			}else{
				count--;
				if(count<=0){
					pre = arr[i];
				}
			}
			
			if(count == 1){
				target = arr[i];
			}
		}
		
		System.out.println(target);
		return count>0;
	}
}
