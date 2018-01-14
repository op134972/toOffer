package 牛客.动态规划;

import java.util.Scanner;

public class 最长字符串 {

	
	 public static void main(String[] args){
	        Scanner sc = new Scanner(System.in);
	        String str1 = sc.nextLine();
	        String str2 = sc.nextLine();
	        
	        System.out.println(fun1(str1,str2));
	    }
	    
	    private static int fun1(String str1,String str2){
	        char[] arr1 = str1.toCharArray();
	        char[] arr2 = str2.toCharArray();
	        
	        int length = 0;
	        //动态规划，保存之前的步骤数据  arrs[i][j]表示str1 i之前的子串、str2 j之前的子串的最大长度。
	        /*
	         * 1、如果当前位置字符对应相等，赋值为1，并且加上i-1，j-1位置的值（i-1\j-1大于0）
	         */
	        int[][] arrs = new int[arr1.length][arr2.length];
	        
	        for(int i = 0;i<arr1.length;i++){
	            for(int j = 0;j<arr2.length;j++){
	                if(arr1[i] == arr2[j]){
	                    arrs[i][j] = 1;
	                    if(i!=0&&j!=0){
	                        arrs[i][j] += arrs[i-1][j-1];
	                    }
	                }
	                
	                length = Math.max(length,arrs[i][j]);
	            }
	        }
	        return length;
	    }
}
