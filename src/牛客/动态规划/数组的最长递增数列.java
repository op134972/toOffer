package 牛客.动态规划;

public class 数组的最长递增数列 {

	public static void main(String[] args) {
		int[] arr = {2,1,5,3,6,4,8,9,7};
		System.out.println(longestSubArr(arr));
	}
	
	
	public static int longestSubArr(int[]arr){
		if(arr==null||arr.length == 0)
			return 0;
		if(arr.length == 1)
			return 1;
		
		int[] longth = new int[arr.length];//存储以i结尾的最长递增数列的长度
		longth[0] = 1;
		for (int i = 1; i < arr.length; i++) {
			if(arr[i]>=arr[i-1]){
				longth[i] = longth[i-1]+1;//左1的长度+1
			}else{
				longth[i] = max(longth,arr,0,i-1)+1;//左侧比该数小的最大长度+1
			}
		}
		
		
		int max = 0;
		for (int i = 0; i < longth.length; i++) {
			max = Math.max(max,longth[i]);
		}
		return max;
		
	}

	private static int max(int[] longth,int[]arr, int i, int j) {
		int max = 0;
		for (int k = i; k <= j; k++) {
			if(arr[k]<arr[j+1]){
				max = Math.max(max, longth[k]);
			}
		}
		return max;
	}
}
