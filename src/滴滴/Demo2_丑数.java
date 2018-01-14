package µÎµÎ;

import java.util.Scanner;

public class Demo2_³óÊý {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int n= sc.nextInt();
		
		System.out.println(ugly(n));
	}
	public static int ugly(int n){
		if(n<=0)
			return -1;
		if(n<7){
			return n;
		}
		
		int[]arr = new int[n+1];
		arr[0] = 1;
		int i2=0,i3=0,i5 = 0;
		for (int i = 1; i < n+1; i++) {
			arr[i] = Math.min(Math.min(arr[i2]*2,arr[i3]*3), arr[i5]*5);
			if(arr[i] == arr[i2]*2)
				i2++;
			if(arr[i] == arr[i3]*3)
				i3++;
			if(arr[i] == arr[i5]*5)
				i5++;
		}
		return arr[n-1];
	}
}
