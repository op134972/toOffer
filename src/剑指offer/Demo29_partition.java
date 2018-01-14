package 剑指offer;



/**
 * 数组中出现此处一半以上的数字
 * 1、partution函数解法
 * @author lenovo
 *
 */
public class Demo29_partition {

	//找到排序后在中间的数字，既中位数、在遍历数组，看该数字出现的次数
	
	public static boolean moreThanHalf(int[]arr){
		if(arr.length == 0)
			return false;
		int mid = (0+arr.length)/2;
		int index = partition(arr,0,arr.length-1);
		while(index != mid){
			if(index>mid){
				index = partition(arr,0,index-1);
			}else{
				index = partition(arr,index+1,arr.length-1);
			}
		}
		
		int target = arr[index];
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == target)
				count++;
		}
		System.out.println("mid num is "+target);
		if(count>arr.length/2)
			return true;
		else
			return false;
	}

	private static int partition(int[] arr, int start, int end) {
		int pivot = arr[start];
		int i = start;
		int j = end;
		while(i!=j){
			while(i<j&&arr[j]>=pivot){
				j--;
			}
			while(i<j&&arr[i]<=pivot){
				i++;
			}
			if(i<j){
				swap(arr,i,j);
			}else
				break;
		}
		swap(arr, start, j);
		return i;
	}

	private static void swap(int[] arr, int i, int j) {
		int t = arr[i];
		arr[i] = arr[j];
		arr[j] = t;
	}
	
	public static void main(String[] args) {
		int[] arr = {1,9,9,5,4,9,7,8,9,9,9};
		boolean result = moreThanHalf(arr);
		System.out.println(result);
	}
}
