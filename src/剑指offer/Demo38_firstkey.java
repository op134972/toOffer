package ½£Ö¸offer;

public class Demo38_firstkey {

	public static void main(String[] args) {
		int[] arr = {1,3,3,3,3,4,5};
		System.out.println(getLengthOfK(arr, 2));
	}
	
	public static int getLengthOfK(int[] arr,int k){
		int first = getFirstOfK(arr,k,0,arr.length-1);
		int end = getEndOfK(arr,k,0,arr.length-1);
		
		if(first == -1)
			return 0;
		
		return end-first+1;
	}

	private static int getEndOfK(int[] arr, int k, int i, int j) {
		if(i>j)
			return -1;
		int mid =(i+j)/2;
		while(i<=j){
			if(k>arr[mid]){
				return getEndOfK(arr, k, mid+1, j);
			}else if(k<arr[mid]){
				return getEndOfK(arr, k, i, mid-1);
			}else{
				if(mid+1<=j&&arr[mid+1]==k){
					return getEndOfK(arr, k, mid+1, j);
				}else{
					return mid;
				}
			}
		}
		
		return -1;
	}

	private static int getFirstOfK(int[] arr, int k, int i, int j) {
		if(i>j)
			return -1;
		int mid =(i+j)/2;
		while(i<=j){
			if(k>arr[mid]){
				return getFirstOfK(arr, k, mid+1, j);
			}else if(k<arr[mid]){
				return getFirstOfK(arr, k, i, mid-1);
			}else{
				if(mid-1>=i&&arr[mid-1]==k){
					return getFirstOfK(arr, k,i,mid-1);
				}else{
					return mid;
				}
			}
		}
		
		return -1;
	}
}
