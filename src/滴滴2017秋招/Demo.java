package µŒµŒ2017«Ô’–;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		int[]arr = {-1,2,1};
		System.out.println(fun1(arr));
	}
	
	private static int fun1(int[]array){
		int maxSubsum = Integer.MIN_VALUE;
        int subSum = 0;
        for(int i = 0;i < array.length;i++){
            subSum += array[i];
            if(subSum>maxSubsum)
                maxSubsum = subSum;
            if(subSum<0)
                subSum = 0;
        }
        return maxSubsum;
	}
}
